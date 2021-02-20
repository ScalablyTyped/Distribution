package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkspaceImagePermissionRequest extends StObject {
  
  /**
    * The permission to copy the image. This permission can be revoked only after an image has been shared.
    */
  var AllowCopyImage: BooleanObject = js.native
  
  /**
    * The identifier of the image.
    */
  var ImageId: WorkspaceImageId = js.native
  
  /**
    * The identifier of the AWS account to share or unshare the image with.  Before sharing the image, confirm that you are sharing to the correct AWS account ID. 
    */
  var SharedAccountId: AwsAccount = js.native
}
object UpdateWorkspaceImagePermissionRequest {
  
  @scala.inline
  def apply(AllowCopyImage: BooleanObject, ImageId: WorkspaceImageId, SharedAccountId: AwsAccount): UpdateWorkspaceImagePermissionRequest = {
    val __obj = js.Dynamic.literal(AllowCopyImage = AllowCopyImage.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceImagePermissionRequest]
  }
  
  @scala.inline
  implicit class UpdateWorkspaceImagePermissionRequestMutableBuilder[Self <: UpdateWorkspaceImagePermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCopyImage(value: BooleanObject): Self = StObject.set(x, "AllowCopyImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAccountId(value: AwsAccount): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
  }
}
