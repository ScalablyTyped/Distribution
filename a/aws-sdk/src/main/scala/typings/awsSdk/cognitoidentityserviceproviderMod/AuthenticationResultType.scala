package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationResultType extends StObject {
  
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  
  /**
    * The expiration period of the authentication result in seconds.
    */
  var ExpiresIn: js.UndefOr[IntegerType] = js.undefined
  
  /**
    * The ID token.
    */
  var IdToken: js.UndefOr[TokenModelType] = js.undefined
  
  /**
    * The new device metadata from an authentication result.
    */
  var NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType] = js.undefined
  
  /**
    * The refresh token.
    */
  var RefreshToken: js.UndefOr[TokenModelType] = js.undefined
  
  /**
    * The token type.
    */
  var TokenType: js.UndefOr[StringType] = js.undefined
}
object AuthenticationResultType {
  
  @scala.inline
  def apply(): AuthenticationResultType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationResultType]
  }
  
  @scala.inline
  implicit class AuthenticationResultTypeMutableBuilder[Self <: AuthenticationResultType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: IntegerType): Self = StObject.set(x, "ExpiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInUndefined: Self = StObject.set(x, "ExpiresIn", js.undefined)
    
    @scala.inline
    def setIdToken(value: TokenModelType): Self = StObject.set(x, "IdToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "IdToken", js.undefined)
    
    @scala.inline
    def setNewDeviceMetadata(value: NewDeviceMetadataType): Self = StObject.set(x, "NewDeviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDeviceMetadataUndefined: Self = StObject.set(x, "NewDeviceMetadata", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: TokenModelType): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "RefreshToken", js.undefined)
    
    @scala.inline
    def setTokenType(value: StringType): Self = StObject.set(x, "TokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenTypeUndefined: Self = StObject.set(x, "TokenType", js.undefined)
  }
}
