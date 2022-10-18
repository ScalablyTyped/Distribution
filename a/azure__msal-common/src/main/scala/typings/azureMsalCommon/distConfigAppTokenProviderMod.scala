package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigAppTokenProviderMod {
  
  trait AppTokenProviderParameters extends StObject {
    
    val claims: js.UndefOr[String] = js.undefined
    
    val correlationId: js.UndefOr[String] = js.undefined
    
    val scopes: js.Array[String]
    
    val tenantId: String
  }
  object AppTokenProviderParameters {
    
    inline def apply(scopes: js.Array[String], tenantId: String): AppTokenProviderParameters = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppTokenProviderParameters]
    }
    
    extension [Self <: AppTokenProviderParameters](x: Self) {
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppTokenProviderResult extends StObject {
    
    var accessToken: String
    
    var expiresInSeconds: Double
    
    var refreshInSeconds: js.UndefOr[Double] = js.undefined
  }
  object AppTokenProviderResult {
    
    inline def apply(accessToken: String, expiresInSeconds: Double): AppTokenProviderResult = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresInSeconds = expiresInSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppTokenProviderResult]
    }
    
    extension [Self <: AppTokenProviderResult](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpiresInSeconds(value: Double): Self = StObject.set(x, "expiresInSeconds", value.asInstanceOf[js.Any])
      
      inline def setRefreshInSeconds(value: Double): Self = StObject.set(x, "refreshInSeconds", value.asInstanceOf[js.Any])
      
      inline def setRefreshInSecondsUndefined: Self = StObject.set(x, "refreshInSeconds", js.undefined)
    }
  }
  
  type IAppTokenProvider = js.Function1[
    /* appTokenProviderParameters */ AppTokenProviderParameters, 
    js.Promise[AppTokenProviderResult]
  ]
}
