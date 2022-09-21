package typings.azureMsalCommon

import typings.azureMsalCommon.accountInfoMod.AccountInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticationResultMod {
  
  trait AuthenticationResult extends StObject {
    
    var accessToken: String
    
    var account: AccountInfo | Null
    
    var authority: String
    
    var cloudGraphHostName: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var correlationId: String
    
    var expiresOn: js.Date | Null
    
    var extExpiresOn: js.UndefOr[js.Date] = js.undefined
    
    var familyId: js.UndefOr[String] = js.undefined
    
    var fromCache: Boolean
    
    var fromNativeBroker: js.UndefOr[Boolean] = js.undefined
    
    var idToken: String
    
    var idTokenClaims: js.Object
    
    var msGraphHost: js.UndefOr[String] = js.undefined
    
    var scopes: js.Array[String]
    
    var state: js.UndefOr[String] = js.undefined
    
    var tenantId: String
    
    var tokenType: String
    
    var uniqueId: String
  }
  object AuthenticationResult {
    
    inline def apply(
      accessToken: String,
      authority: String,
      correlationId: String,
      fromCache: Boolean,
      idToken: String,
      idTokenClaims: js.Object,
      scopes: js.Array[String],
      tenantId: String,
      tokenType: String,
      uniqueId: String
    ): AuthenticationResult = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], idTokenClaims = idTokenClaims.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any], account = null, expiresOn = null)
      __obj.asInstanceOf[AuthenticationResult]
    }
    
    extension [Self <: AuthenticationResult](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountNull: Self = StObject.set(x, "account", null)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setCloudGraphHostName(value: String): Self = StObject.set(x, "cloudGraphHostName", value.asInstanceOf[js.Any])
      
      inline def setCloudGraphHostNameUndefined: Self = StObject.set(x, "cloudGraphHostName", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setExpiresOn(value: js.Date): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
      
      inline def setExpiresOnNull: Self = StObject.set(x, "expiresOn", null)
      
      inline def setExtExpiresOn(value: js.Date): Self = StObject.set(x, "extExpiresOn", value.asInstanceOf[js.Any])
      
      inline def setExtExpiresOnUndefined: Self = StObject.set(x, "extExpiresOn", js.undefined)
      
      inline def setFamilyId(value: String): Self = StObject.set(x, "familyId", value.asInstanceOf[js.Any])
      
      inline def setFamilyIdUndefined: Self = StObject.set(x, "familyId", js.undefined)
      
      inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
      
      inline def setFromNativeBroker(value: Boolean): Self = StObject.set(x, "fromNativeBroker", value.asInstanceOf[js.Any])
      
      inline def setFromNativeBrokerUndefined: Self = StObject.set(x, "fromNativeBroker", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenClaims(value: js.Object): Self = StObject.set(x, "idTokenClaims", value.asInstanceOf[js.Any])
      
      inline def setMsGraphHost(value: String): Self = StObject.set(x, "msGraphHost", value.asInstanceOf[js.Any])
      
      inline def setMsGraphHostUndefined: Self = StObject.set(x, "msGraphHost", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    }
  }
}
