package typings.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterClientResponse extends js.Object {
  /**
    * The endpoint where the client can request authorization.
    */
  var authorizationEndpoint: js.UndefOr[URI] = js.native
  /**
    * The unique identifier string for each client. This client uses this identifier to get authenticated by the service in subsequent calls.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  /**
    * Indicates the time at which the clientId and clientSecret were issued.
    */
  var clientIdIssuedAt: js.UndefOr[LongTimeStampType] = js.native
  /**
    * A secret string generated for the client. The client will use this string to get authenticated by the service in subsequent calls.
    */
  var clientSecret: js.UndefOr[ClientSecret] = js.native
  /**
    * Indicates the time at which the clientId and clientSecret will become invalid.
    */
  var clientSecretExpiresAt: js.UndefOr[LongTimeStampType] = js.native
  /**
    * The endpoint where the client can get an access token.
    */
  var tokenEndpoint: js.UndefOr[URI] = js.native
}

object RegisterClientResponse {
  @scala.inline
  def apply(): RegisterClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterClientResponse]
  }
  @scala.inline
  implicit class RegisterClientResponseOps[Self <: RegisterClientResponse] (val x: Self) extends AnyVal {
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
    def setAuthorizationEndpoint(value: URI): Self = this.set("authorizationEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationEndpoint: Self = this.set("authorizationEndpoint", js.undefined)
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setClientIdIssuedAt(value: LongTimeStampType): Self = this.set("clientIdIssuedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientIdIssuedAt: Self = this.set("clientIdIssuedAt", js.undefined)
    @scala.inline
    def setClientSecret(value: ClientSecret): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    @scala.inline
    def setClientSecretExpiresAt(value: LongTimeStampType): Self = this.set("clientSecretExpiresAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientSecretExpiresAt: Self = this.set("clientSecretExpiresAt", js.undefined)
    @scala.inline
    def setTokenEndpoint(value: URI): Self = this.set("tokenEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenEndpoint: Self = this.set("tokenEndpoint", js.undefined)
  }
  
}

