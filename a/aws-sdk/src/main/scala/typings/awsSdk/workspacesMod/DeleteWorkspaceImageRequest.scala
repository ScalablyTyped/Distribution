package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkspaceImageRequest extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageId: WorkspaceImageId = js.native
}

object DeleteWorkspaceImageRequest {
  @scala.inline
  def apply(ImageId: WorkspaceImageId): DeleteWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceImageRequest]
  }
  @scala.inline
  implicit class DeleteWorkspaceImageRequestOps[Self <: DeleteWorkspaceImageRequest] (val x: Self) extends AnyVal {
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
    def setImageId(value: WorkspaceImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
  }
  
}

