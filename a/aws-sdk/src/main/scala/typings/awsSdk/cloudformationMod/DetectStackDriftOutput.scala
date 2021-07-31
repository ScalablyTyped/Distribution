package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectStackDriftOutput extends StObject {
  
  /**
    * The ID of the drift detection results of this operation.  AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary. 
    */
  var StackDriftDetectionId: typings.awsSdk.cloudformationMod.StackDriftDetectionId
}
object DetectStackDriftOutput {
  
  @scala.inline
  def apply(StackDriftDetectionId: StackDriftDetectionId): DetectStackDriftOutput = {
    val __obj = js.Dynamic.literal(StackDriftDetectionId = StackDriftDetectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackDriftOutput]
  }
  
  @scala.inline
  implicit class DetectStackDriftOutputMutableBuilder[Self <: DetectStackDriftOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackDriftDetectionId(value: StackDriftDetectionId): Self = StObject.set(x, "StackDriftDetectionId", value.asInstanceOf[js.Any])
  }
}
