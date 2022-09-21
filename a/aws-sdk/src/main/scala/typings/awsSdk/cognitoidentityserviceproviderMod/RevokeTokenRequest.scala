package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeTokenRequest extends StObject {
  
  /**
    * The client ID for the token that you want to revoke.
    */
  var ClientId: ClientIdType
  
  /**
    * The secret for the client ID. This is required only if the client ID has a secret.
    */
  var ClientSecret: js.UndefOr[ClientSecretType] = js.undefined
  
  /**
    * The refresh token that you want to revoke.
    */
  var Token: TokenModelType
}
object RevokeTokenRequest {
  
  inline def apply(ClientId: ClientIdType, Token: TokenModelType): RevokeTokenRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeTokenRequest]
  }
  
  extension [Self <: RevokeTokenRequest](x: Self) {
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: ClientSecretType): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "ClientSecret", js.undefined)
    
    inline def setToken(value: TokenModelType): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
  }
}
