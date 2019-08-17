package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreCredentialsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Credentials extends js.Object {
  /**
    * <p>The Access Key portion of the credentials.</p>
    */
  var AccessKeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The date at which these credentials will expire.</p>
    */
  var Expiration: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The Secret Access Key portion of the credentials</p>
    */
  var SecretKey: js.UndefOr[String] = js.undefined
  /**
    * <p>The Session Token portion of the credentials</p>
    */
  var SessionToken: js.UndefOr[String] = js.undefined
}

object _Credentials {
  @scala.inline
  def apply(
    AccessKeyId: String = null,
    Expiration: Date | String | Double = null,
    SecretKey: String = null,
    SessionToken: String = null
  ): _Credentials = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (SecretKey != null) __obj.updateDynamic("SecretKey")(SecretKey)
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken)
    __obj.asInstanceOf[_Credentials]
  }
}

