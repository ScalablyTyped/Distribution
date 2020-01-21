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
  def apply(
    authorizationEndpoint: URI = null,
    clientId: ClientId = null,
    clientIdIssuedAt: Int | Double = null,
    clientSecret: ClientSecret = null,
    clientSecretExpiresAt: Int | Double = null,
    tokenEndpoint: URI = null
  ): RegisterClientResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizationEndpoint != null) __obj.updateDynamic("authorizationEndpoint")(authorizationEndpoint.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientIdIssuedAt != null) __obj.updateDynamic("clientIdIssuedAt")(clientIdIssuedAt.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (clientSecretExpiresAt != null) __obj.updateDynamic("clientSecretExpiresAt")(clientSecretExpiresAt.asInstanceOf[js.Any])
    if (tokenEndpoint != null) __obj.updateDynamic("tokenEndpoint")(tokenEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterClientResponse]
  }
}

