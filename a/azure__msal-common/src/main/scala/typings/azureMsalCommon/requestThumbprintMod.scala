package typings.azureMsalCommon

import typings.azureMsalCommon.constantsMod.AuthenticationScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestThumbprintMod {
  
  trait RequestThumbprint extends StObject {
    
    var authenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var authority: String
    
    var claims: js.UndefOr[String] = js.undefined
    
    var clientId: String
    
    var homeAccountIdentifier: js.UndefOr[String] = js.undefined
    
    var resourceRequestMethod: js.UndefOr[String] = js.undefined
    
    var resourceRequestUri: js.UndefOr[String] = js.undefined
    
    var scopes: js.Array[String]
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var sshKid: js.UndefOr[String] = js.undefined
  }
  object RequestThumbprint {
    
    inline def apply(authority: String, clientId: String, scopes: js.Array[String]): RequestThumbprint = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestThumbprint]
    }
    
    extension [Self <: RequestThumbprint](x: Self) {
      
      inline def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "authenticationScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "authenticationScheme", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setHomeAccountIdentifier(value: String): Self = StObject.set(x, "homeAccountIdentifier", value.asInstanceOf[js.Any])
      
      inline def setHomeAccountIdentifierUndefined: Self = StObject.set(x, "homeAccountIdentifier", js.undefined)
      
      inline def setResourceRequestMethod(value: String): Self = StObject.set(x, "resourceRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethodUndefined: Self = StObject.set(x, "resourceRequestMethod", js.undefined)
      
      inline def setResourceRequestUri(value: String): Self = StObject.set(x, "resourceRequestUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestUriUndefined: Self = StObject.set(x, "resourceRequestUri", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setSshKid(value: String): Self = StObject.set(x, "sshKid", value.asInstanceOf[js.Any])
      
      inline def setSshKidUndefined: Self = StObject.set(x, "sshKid", js.undefined)
    }
  }
}
