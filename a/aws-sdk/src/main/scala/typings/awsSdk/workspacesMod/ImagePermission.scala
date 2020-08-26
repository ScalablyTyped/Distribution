package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePermission extends js.Object {
  /**
    * The identifier of the AWS account that an image has been shared with.
    */
  var SharedAccountId: js.UndefOr[AwsAccount] = js.native
}

object ImagePermission {
  @scala.inline
  def apply(): ImagePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePermission]
  }
  @scala.inline
  implicit class ImagePermissionOps[Self <: ImagePermission] (val x: Self) extends AnyVal {
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
    def setSharedAccountId(value: AwsAccount): Self = this.set("SharedAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedAccountId: Self = this.set("SharedAccountId", js.undefined)
  }
  
}

