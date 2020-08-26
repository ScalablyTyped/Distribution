package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpenIdTokenResponse extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on input.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.native
  /**
    * An OpenID token, valid for 10 minutes.
    */
  var Token: js.UndefOr[OIDCToken] = js.native
}

object GetOpenIdTokenResponse {
  @scala.inline
  def apply(): GetOpenIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIdTokenResponse]
  }
  @scala.inline
  implicit class GetOpenIdTokenResponseOps[Self <: GetOpenIdTokenResponse] (val x: Self) extends AnyVal {
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
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
    @scala.inline
    def setToken(value: OIDCToken): Self = this.set("Token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("Token", js.undefined)
  }
  
}

