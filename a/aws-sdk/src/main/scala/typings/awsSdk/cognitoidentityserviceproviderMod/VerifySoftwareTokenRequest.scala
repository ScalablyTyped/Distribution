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
  def apply(
    UserCode: SoftwareTokenMFAUserCodeType,
    AccessToken: TokenModelType = null,
    FriendlyDeviceName: StringType = null,
    Session: SessionType = null
  ): VerifySoftwareTokenRequest = {
    val __obj = js.Dynamic.literal(UserCode = UserCode.asInstanceOf[js.Any])
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken.asInstanceOf[js.Any])
    if (FriendlyDeviceName != null) __obj.updateDynamic("FriendlyDeviceName")(FriendlyDeviceName.asInstanceOf[js.Any])
    if (Session != null) __obj.updateDynamic("Session")(Session.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifySoftwareTokenRequest]
  }
}

