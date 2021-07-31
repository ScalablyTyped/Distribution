package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartProjectVersionRequest extends StObject {
  
  /**
    * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model. You are charged for the number of inference units that you use. 
    */
  var MinInferenceUnits: InferenceUnits
  
  /**
    * The Amazon Resource Name(ARN) of the model version that you want to start.
    */
  var ProjectVersionArn: typings.awsSdk.rekognitionMod.ProjectVersionArn
}
object StartProjectVersionRequest {
  
  @scala.inline
  def apply(MinInferenceUnits: InferenceUnits, ProjectVersionArn: ProjectVersionArn): StartProjectVersionRequest = {
    val __obj = js.Dynamic.literal(MinInferenceUnits = MinInferenceUnits.asInstanceOf[js.Any], ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProjectVersionRequest]
  }
  
  @scala.inline
  implicit class StartProjectVersionRequestMutableBuilder[Self <: StartProjectVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MinInferenceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
  }
}
