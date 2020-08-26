package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifySoftwareTokenRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The friendly device name.
    */
  var FriendlyDeviceName: js.UndefOr[StringType] = js.native
  /**
    * The session which should be passed both ways in challenge-response calls to the service.
    */
  var Session: js.UndefOr[SessionType] = js.native
  /**
    * The one time password computed using the secret code returned by 
    */
  var UserCode: SoftwareTokenMFAUserCodeType = js.native
}

object VerifySoftwareTokenRequest {
  @scala.inline
  def apply(UserCode: SoftwareTokenMFAUserCodeType): VerifySoftwareTokenRequest = {
    val __obj = js.Dynamic.literal(UserCode = UserCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifySoftwareTokenRequest]
  }
  @scala.inline
  implicit class VerifySoftwareTokenRequestOps[Self <: VerifySoftwareTokenRequest] (val x: Self) extends AnyVal {
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
    def setUserCode(value: SoftwareTokenMFAUserCodeType): Self = this.set("UserCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("AccessToken", js.undefined)
    @scala.inline
    def setFriendlyDeviceName(value: StringType): Self = this.set("FriendlyDeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriendlyDeviceName: Self = this.set("FriendlyDeviceName", js.undefined)
    @scala.inline
    def setSession(value: SessionType): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
  }
  
}

