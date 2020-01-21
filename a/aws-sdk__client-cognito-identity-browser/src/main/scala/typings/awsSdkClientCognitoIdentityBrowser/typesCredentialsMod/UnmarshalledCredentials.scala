package typings.awsSdkClientCognitoIdentityBrowser.typesCredentialsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCredentials extends Credentials {
  /**
    * <p>The date at which these credentials will expire.</p>
    */
  @JSName("Expiration")
  var Expiration_UnmarshalledCredentials: js.UndefOr[Date] = js.undefined
}

object UnmarshalledCredentials {
  @scala.inline
  def apply(
    AccessKeyId: String = null,
    Expiration: Date = null,
    SecretKey: String = null,
    SessionToken: String = null
  ): UnmarshalledCredentials = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (SecretKey != null) __obj.updateDynamic("SecretKey")(SecretKey.asInstanceOf[js.Any])
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCredentials]
  }
}

