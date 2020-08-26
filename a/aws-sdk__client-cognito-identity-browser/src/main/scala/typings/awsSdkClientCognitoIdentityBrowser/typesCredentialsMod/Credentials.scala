package typings.awsSdkClientCognitoIdentityBrowser.typesCredentialsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * <p>The Access Key portion of the credentials.</p>
    */
  var AccessKeyId: js.UndefOr[String] = js.native
  /**
    * <p>The date at which these credentials will expire.</p>
    */
  var Expiration: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>The Secret Access Key portion of the credentials</p>
    */
  var SecretKey: js.UndefOr[String] = js.native
  /**
    * <p>The Session Token portion of the credentials</p>
    */
  var SessionToken: js.UndefOr[String] = js.native
}

object Credentials {
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
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
    def deleteAccessKeyId: Self = this.set("AccessKeyId", js.undefined)
    @scala.inline
    def setExpiration(value: Date | String | Double): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    @scala.inline
    def setSecretKey(value: String): Self = this.set("SecretKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretKey: Self = this.set("SecretKey", js.undefined)
    @scala.inline
    def setSessionToken(value: String): Self = this.set("SessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("SessionToken", js.undefined)
  }
  
}

