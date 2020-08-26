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
  def apply(): RoleCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleCredentials]
  }
  @scala.inline
  implicit class RoleCredentialsOps[Self <: RoleCredentials] (val x: Self) extends AnyVal {
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
    def setAccessKeyId(value: AccessKeyType): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    @scala.inline
    def setExpiration(value: ExpirationTimestampType): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setSecretAccessKey(value: SecretAccessKeyType): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretAccessKey: Self = this.set("secretAccessKey", js.undefined)
    @scala.inline
    def setSessionToken(value: SessionTokenType): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
  }
  
}

