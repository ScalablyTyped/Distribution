package typings.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTokenRequest extends js.Object {
  /**
    * The unique identifier string for each client. This value should come from the persisted result of the RegisterClient API.
    */
  var clientId: ClientId = js.native
  /**
    * A secret string generated for the client. This value should come from the persisted result of the RegisterClient API.
    */
  var clientSecret: ClientSecret = js.native
  /**
    * The authorization code received from the authorization service. This parameter is required to perform an authorization grant request to get access to a token.
    */
  var code: js.UndefOr[AuthCode] = js.native
  /**
    * Used only when calling this API for the device code grant type. This short-term code is used to identify this authentication attempt. This should come from an in-memory reference to the result of the StartDeviceAuthorization API.
    */
  var deviceCode: DeviceCode = js.native
  /**
    * Supports grant types for authorization code, refresh token, and device code request.
    */
  var grantType: GrantType = js.native
  /**
    * The location of the application that will receive the authorization code. Users authorize the service to send the request to this location.
    */
  var redirectUri: js.UndefOr[URI] = js.native
  /**
    * The token used to obtain an access token in the event that the access token is invalid or expired. This token is not issued by the service.
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.native
  /**
    * The list of scopes that is defined by the client. Upon authorization, this list is used to restrict permissions when granting an access token.
    */
  var scope: js.UndefOr[Scopes] = js.native
}

object CreateTokenRequest {
  @scala.inline
  def apply(
    clientId: ClientId,
    clientSecret: ClientSecret,
    deviceCode: DeviceCode,
    grantType: GrantType,
    code: AuthCode = null,
    redirectUri: URI = null,
    refreshToken: RefreshToken = null,
    scope: Scopes = null
  ): CreateTokenRequest = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], deviceCode = deviceCode.asInstanceOf[js.Any], grantType = grantType.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTokenRequest]
  }
}

