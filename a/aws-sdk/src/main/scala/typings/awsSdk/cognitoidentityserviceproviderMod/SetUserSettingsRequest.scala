package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetUserSettingsRequest extends js.Object {
  /**
    * The access token for the set user settings request.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
    */
  var MFAOptions: MFAOptionListType = js.native
}

object SetUserSettingsRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, MFAOptions: MFAOptionListType): SetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], MFAOptions = MFAOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserSettingsRequest]
  }
}

