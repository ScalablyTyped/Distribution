package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreCredentialsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCredentials extends _Credentials {
  /**
    * <p>The date at which these credentials will expire.</p>
    */
  @JSName("Expiration")
  var Expiration__UnmarshalledCredentials: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledCredentials {
  @scala.inline
  def apply(
    AccessKeyId: String = null,
    Expiration: Date = null,
    SecretKey: String = null,
    SessionToken: String = null
  ): _UnmarshalledCredentials = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (SecretKey != null) __obj.updateDynamic("SecretKey")(SecretKey)
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken)
    __obj.asInstanceOf[_UnmarshalledCredentials]
  }
}

