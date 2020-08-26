package typings.awsSdkClientCognitoIdentityBrowser.typesCredentialsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCredentials extends Credentials {
  /**
    * <p>The date at which these credentials will expire.</p>
    */
  @JSName("Expiration")
  var Expiration_UnmarshalledCredentials: js.UndefOr[Date] = js.native
}

object UnmarshalledCredentials {
  @scala.inline
  def apply(): UnmarshalledCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCredentials]
  }
  @scala.inline
  implicit class UnmarshalledCredentialsOps[Self <: UnmarshalledCredentials] (val x: Self) extends AnyVal {
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
    def setExpiration(value: Date): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
  }
  
}

