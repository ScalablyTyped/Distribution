package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessKeyLastUsedResponse extends js.Object {
  /**
    * Contains information about the last time the access key was used.
    */
  var AccessKeyLastUsed: js.UndefOr[typings.awsSdk.iamMod.AccessKeyLastUsed] = js.native
  /**
    * The name of the AWS IAM user that owns this access key. 
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}

object GetAccessKeyLastUsedResponse {
  @scala.inline
  def apply(): GetAccessKeyLastUsedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessKeyLastUsedResponse]
  }
  @scala.inline
  implicit class GetAccessKeyLastUsedResponseOps[Self <: GetAccessKeyLastUsedResponse] (val x: Self) extends AnyVal {
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
    def setAccessKeyLastUsed(value: AccessKeyLastUsed): Self = this.set("AccessKeyLastUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyLastUsed: Self = this.set("AccessKeyLastUsed", js.undefined)
    @scala.inline
    def setUserName(value: existingUserNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
  
}

