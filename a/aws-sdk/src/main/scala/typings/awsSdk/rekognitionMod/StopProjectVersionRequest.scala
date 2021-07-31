package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopProjectVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model version that you want to delete. This operation requires permissions to perform the rekognition:StopProjectVersion action.
    */
  var ProjectVersionArn: typings.awsSdk.rekognitionMod.ProjectVersionArn
}
object StopProjectVersionRequest {
  
  @scala.inline
  def apply(ProjectVersionArn: ProjectVersionArn): StopProjectVersionRequest = {
    val __obj = js.Dynamic.literal(ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProjectVersionRequest]
  }
  
  @scala.inline
  implicit class StopProjectVersionRequestMutableBuilder[Self <: StopProjectVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
  }
}
