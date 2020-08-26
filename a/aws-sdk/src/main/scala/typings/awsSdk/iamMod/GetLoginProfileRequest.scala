package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoginProfileRequest extends js.Object {
  /**
    * The name of the user whose login profile you want to retrieve. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType = js.native
}

object GetLoginProfileRequest {
  @scala.inline
  def apply(UserName: userNameType): GetLoginProfileRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoginProfileRequest]
  }
  @scala.inline
  implicit class GetLoginProfileRequestOps[Self <: GetLoginProfileRequest] (val x: Self) extends AnyVal {
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
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

