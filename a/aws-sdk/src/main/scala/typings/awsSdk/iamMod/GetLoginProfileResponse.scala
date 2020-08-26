package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoginProfileResponse extends js.Object {
  /**
    * A structure containing the user name and password create date for the user.
    */
  var LoginProfile: typings.awsSdk.iamMod.LoginProfile = js.native
}

object GetLoginProfileResponse {
  @scala.inline
  def apply(LoginProfile: LoginProfile): GetLoginProfileResponse = {
    val __obj = js.Dynamic.literal(LoginProfile = LoginProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoginProfileResponse]
  }
  @scala.inline
  implicit class GetLoginProfileResponseOps[Self <: GetLoginProfileResponse] (val x: Self) extends AnyVal {
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
    def setLoginProfile(value: LoginProfile): Self = this.set("LoginProfile", value.asInstanceOf[js.Any])
  }
  
}

