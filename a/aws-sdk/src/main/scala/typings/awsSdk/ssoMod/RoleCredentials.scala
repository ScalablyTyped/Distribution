package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleCredentials extends js.Object {
  /**
    * The identifier used for the temporary security credentials. For more information, see Using Temporary Security Credentials to Request Access to AWS Resources in the AWS IAM User Guide.
    */
  var accessKeyId: js.UndefOr[AccessKeyType] = js.native
  /**
    * The date on which temporary security credentials expire.
    */
  var expiration: js.UndefOr[ExpirationTimestampType] = js.native
  /**
    * The key that is used to sign the request. For more information, see Using Temporary Security Credentials to Request Access to AWS Resources in the AWS IAM User Guide.
    */
  var secretAccessKey: js.UndefOr[SecretAccessKeyType] = js.native
  /**
    * The token used for temporary credentials. For more information, see Using Temporary Security Credentials to Request Access to AWS Resources in the AWS IAM User Guide.
    */
  var sessionToken: js.UndefOr[SessionTokenType] = js.native
}

object RoleCredentials {
  @scala.inline
  def apply(
    accessKeyId: AccessKeyType = null,
    expiration: Int | Double = null,
    secretAccessKey: SecretAccessKeyType = null,
    sessionToken: SessionTokenType = null
  ): RoleCredentials = {
    val __obj = js.Dynamic.literal()
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleCredentials]
  }
}

