package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationResultType extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user who you want to authenticate.
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
  
  inline def apply(): AuthenticationResultType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationResultType]
  }
  
  extension [Self <: AuthenticationResultType](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    inline def setExpiresIn(value: IntegerType): Self = StObject.set(x, "ExpiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "ExpiresIn", js.undefined)
    
    inline def setIdToken(value: TokenModelType): Self = StObject.set(x, "IdToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "IdToken", js.undefined)
    
    inline def setNewDeviceMetadata(value: NewDeviceMetadataType): Self = StObject.set(x, "NewDeviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setNewDeviceMetadataUndefined: Self = StObject.set(x, "NewDeviceMetadata", js.undefined)
    
    inline def setRefreshToken(value: TokenModelType): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "RefreshToken", js.undefined)
    
    inline def setTokenType(value: StringType): Self = StObject.set(x, "TokenType", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeUndefined: Self = StObject.set(x, "TokenType", js.undefined)
  }
}
