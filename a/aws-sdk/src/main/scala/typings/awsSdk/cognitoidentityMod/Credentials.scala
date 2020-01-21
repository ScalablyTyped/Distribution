package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * The Access Key portion of the credentials.
    */
  var AccessKeyId: js.UndefOr[AccessKeyString] = js.native
  /**
    * The date at which these credentials will expire.
    */
  var Expiration: js.UndefOr[DateType] = js.native
  /**
    * The Secret Access Key portion of the credentials
    */
  var SecretKey: js.UndefOr[SecretKeyString] = js.native
  /**
    * The Session Token portion of the credentials
    */
  var SessionToken: js.UndefOr[SessionTokenString] = js.native
}

object Credentials {
  @scala.inline
  def apply(
    AccessKeyId: AccessKeyString = null,
    Expiration: DateType = null,
    SecretKey: SecretKeyString = null,
    SessionToken: SessionTokenString = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (SecretKey != null) __obj.updateDynamic("SecretKey")(SecretKey.asInstanceOf[js.Any])
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

