package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkspaceImagePermissionRequest extends js.Object {
  /**
    * The permission to copy the image. This permission can be revoked only after an image has been shared.
    */
  var AllowCopyImage: BooleanObject = js.native
  /**
    * The identifier of the image.
    */
  var ImageId: WorkspaceImageId = js.native
  /**
    * The identifier of the AWS account to share or unshare the image with.
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
  implicit class UpdateWorkspaceImagePermissionRequestOps[Self <: UpdateWorkspaceImagePermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowCopyImage(value: BooleanObject): Self = this.set("AllowCopyImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedAccountId(value: AwsAccount): Self = this.set("SharedAccountId", value.asInstanceOf[js.Any])
  }
  
}

