package typings.awsSdkClientCognitoIdentityBrowser.typesCredentialsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
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

object Credentials {
  @scala.inline
  def apply(
    AccessKeyId: String = null,
    Expiration: Date | String | Double = null,
    SecretKey: String = null,
    SessionToken: String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (SecretKey != null) __obj.updateDynamic("SecretKey")(SecretKey.asInstanceOf[js.Any])
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

