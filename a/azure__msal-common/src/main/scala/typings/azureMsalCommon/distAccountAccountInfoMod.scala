package typings.azureMsalCommon

import typings.azureMsalCommon.anon.TokenClaimskeystringstrin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccountAccountInfoMod {
  
  trait AccountInfo extends StObject {
    
    var environment: String
    
    var homeAccountId: String
    
    var idToken: js.UndefOr[String] = js.undefined
    
    var idTokenClaims: js.UndefOr[TokenClaimskeystringstrin] = js.undefined
    
    var localAccountId: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeAccountId: js.UndefOr[String] = js.undefined
    
    var tenantId: String
    
    var username: String
  }
  object AccountInfo {
    
    inline def apply(
      environment: String,
      homeAccountId: String,
      localAccountId: String,
      tenantId: String,
      username: String
    ): AccountInfo = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], homeAccountId = homeAccountId.asInstanceOf[js.Any], localAccountId = localAccountId.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfo]
    }
    
    extension [Self <: AccountInfo](x: Self) {
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setHomeAccountId(value: String): Self = StObject.set(x, "homeAccountId", value.asInstanceOf[js.Any])
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenClaims(value: TokenClaimskeystringstrin): Self = StObject.set(x, "idTokenClaims", value.asInstanceOf[js.Any])
      
      inline def setIdTokenClaimsUndefined: Self = StObject.set(x, "idTokenClaims", js.undefined)
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setLocalAccountId(value: String): Self = StObject.set(x, "localAccountId", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeAccountId(value: String): Self = StObject.set(x, "nativeAccountId", value.asInstanceOf[js.Any])
      
      inline def setNativeAccountIdUndefined: Self = StObject.set(x, "nativeAccountId", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait ActiveAccountFilters extends StObject {
    
    var homeAccountId: String
    
    var localAccountId: String
  }
  object ActiveAccountFilters {
    
    inline def apply(homeAccountId: String, localAccountId: String): ActiveAccountFilters = {
      val __obj = js.Dynamic.literal(homeAccountId = homeAccountId.asInstanceOf[js.Any], localAccountId = localAccountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveAccountFilters]
    }
    
    extension [Self <: ActiveAccountFilters](x: Self) {
      
      inline def setHomeAccountId(value: String): Self = StObject.set(x, "homeAccountId", value.asInstanceOf[js.Any])
      
      inline def setLocalAccountId(value: String): Self = StObject.set(x, "localAccountId", value.asInstanceOf[js.Any])
    }
  }
}
