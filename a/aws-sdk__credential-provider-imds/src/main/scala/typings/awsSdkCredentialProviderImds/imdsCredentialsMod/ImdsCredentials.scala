package typings.awsSdkCredentialProviderImds.imdsCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImdsCredentials extends js.Object {
  var AccessKeyId: String = js.native
  var Expiration: String = js.native
  var SecretAccessKey: String = js.native
  var Token: String = js.native
}

object ImdsCredentials {
  @scala.inline
  def apply(AccessKeyId: String, Expiration: String, SecretAccessKey: String, Token: String): ImdsCredentials = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], Expiration = Expiration.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImdsCredentials]
  }
  @scala.inline
  implicit class ImdsCredentialsOps[Self <: ImdsCredentials] (val x: Self) extends AnyVal {
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
    def setAccessKeyId(value: String): Self = this.set("AccessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiration(value: String): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("SecretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("Token", value.asInstanceOf[js.Any])
  }
  
}

