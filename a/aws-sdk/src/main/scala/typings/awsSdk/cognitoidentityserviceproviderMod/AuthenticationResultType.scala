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
  def apply(): AuthenticationResultType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationResultType]
  }
  @scala.inline
  implicit class AuthenticationResultTypeOps[Self <: AuthenticationResultType] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("AccessToken", js.undefined)
    @scala.inline
    def setExpiresIn(value: IntegerType): Self = this.set("ExpiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresIn: Self = this.set("ExpiresIn", js.undefined)
    @scala.inline
    def setIdToken(value: TokenModelType): Self = this.set("IdToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("IdToken", js.undefined)
    @scala.inline
    def setNewDeviceMetadata(value: NewDeviceMetadataType): Self = this.set("NewDeviceMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewDeviceMetadata: Self = this.set("NewDeviceMetadata", js.undefined)
    @scala.inline
    def setRefreshToken(value: TokenModelType): Self = this.set("RefreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("RefreshToken", js.undefined)
    @scala.inline
    def setTokenType(value: StringType): Self = this.set("TokenType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenType: Self = this.set("TokenType", js.undefined)
  }
  
}

