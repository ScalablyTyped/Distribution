package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkspaceImageRequest extends StObject {
  
  /**
    * The identifier of the image.
    */
  var ImageId: WorkspaceImageId
}
object DeleteWorkspaceImageRequest {
  
  @scala.inline
  def apply(ImageId: WorkspaceImageId): DeleteWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceImageRequest]
  }
  
  @scala.inline
  implicit class DeleteWorkspaceImageRequestMutableBuilder[Self <: DeleteWorkspaceImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
  }
}
