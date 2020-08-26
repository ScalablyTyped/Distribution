package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAccessKeyRequest extends js.Object {
  /**
    * The access key ID for the access key ID and secret access key you want to delete. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var AccessKeyId: accessKeyIdType = js.native
  /**
    * The name of the user whose access key pair you want to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}

object DeleteAccessKeyRequest {
  @scala.inline
  def apply(AccessKeyId: accessKeyIdType): DeleteAccessKeyRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessKeyRequest]
  }
  @scala.inline
  implicit class DeleteAccessKeyRequestOps[Self <: DeleteAccessKeyRequest] (val x: Self) extends AnyVal {
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
    def setAccessKeyId(value: accessKeyIdType): Self = this.set("AccessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: existingUserNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
  
}

