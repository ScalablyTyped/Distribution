package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProjectVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model version that you want to delete.
    */
  var ProjectVersionArn: typings.awsSdk.rekognitionMod.ProjectVersionArn = js.native
}
object DeleteProjectVersionRequest {
  
  @scala.inline
  def apply(ProjectVersionArn: ProjectVersionArn): DeleteProjectVersionRequest = {
    val __obj = js.Dynamic.literal(ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteProjectVersionRequestMutableBuilder[Self <: DeleteProjectVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
  }
}
