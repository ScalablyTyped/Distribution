package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationResultType extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The expiration period of the authentication result in seconds.
    */
  var ExpiresIn: js.UndefOr[IntegerType] = js.native
  /**
    * The ID token.
    */
  var IdToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The new device metadata from an authentication result.
    */
  var NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType] = js.native
  /**
    * The refresh token.
    */
  var RefreshToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The token type.
    */
  var TokenType: js.UndefOr[StringType] = js.native
}

object AuthenticationResultType {
  @scala.inline
  def apply(
    AccessToken: TokenModelType = null,
    ExpiresIn: Int | Double = null,
    IdToken: TokenModelType = null,
    NewDeviceMetadata: NewDeviceMetadataType = null,
    RefreshToken: TokenModelType = null,
    TokenType: StringType = null
  ): AuthenticationResultType = {
    val __obj = js.Dynamic.literal()
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken.asInstanceOf[js.Any])
    if (ExpiresIn != null) __obj.updateDynamic("ExpiresIn")(ExpiresIn.asInstanceOf[js.Any])
    if (IdToken != null) __obj.updateDynamic("IdToken")(IdToken.asInstanceOf[js.Any])
    if (NewDeviceMetadata != null) __obj.updateDynamic("NewDeviceMetadata")(NewDeviceMetadata.asInstanceOf[js.Any])
    if (RefreshToken != null) __obj.updateDynamic("RefreshToken")(RefreshToken.asInstanceOf[js.Any])
    if (TokenType != null) __obj.updateDynamic("TokenType")(TokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationResultType]
  }
}

