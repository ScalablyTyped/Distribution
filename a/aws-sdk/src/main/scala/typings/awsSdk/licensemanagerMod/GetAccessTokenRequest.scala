package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessTokenRequest extends StObject {
  
  /**
    * Refresh token, encoded as a JWT token.
    */
  var Token: TokenString
  
  /**
    * Token properties to validate against those present in the JWT token.
    */
  var TokenProperties: js.UndefOr[MaxSize3StringList] = js.undefined
}
object GetAccessTokenRequest {
  
  inline def apply(Token: TokenString): GetAccessTokenRequest = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessTokenRequest]
  }
  
  extension [Self <: GetAccessTokenRequest](x: Self) {
    
    inline def setToken(value: TokenString): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setTokenProperties(value: MaxSize3StringList): Self = StObject.set(x, "TokenProperties", value.asInstanceOf[js.Any])
    
    inline def setTokenPropertiesUndefined: Self = StObject.set(x, "TokenProperties", js.undefined)
    
    inline def setTokenPropertiesVarargs(value: String*): Self = StObject.set(x, "TokenProperties", js.Array(value*))
  }
}
