package typings.awsSdkCredentialProviderSso

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait SSOToken extends StObject {
    
    var accessToken: String
    
    var expiresAt: String
    
    var region: js.UndefOr[String] = js.undefined
    
    var startUrl: js.UndefOr[String] = js.undefined
  }
  object SSOToken {
    
    inline def apply(accessToken: String, expiresAt: String): SSOToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSOToken]
    }
    
    extension [Self <: SSOToken](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setStartUrl(value: String): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
      
      inline def setStartUrlUndefined: Self = StObject.set(x, "startUrl", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: string | undefined} */ trait SsoProfile extends StObject {
    
    var sso_account_id: String
    
    var sso_region: String
    
    var sso_role_name: String
    
    var sso_session: js.UndefOr[String] = js.undefined
    
    var sso_start_url: String
  }
  object SsoProfile {
    
    inline def apply(sso_account_id: String, sso_region: String, sso_role_name: String, sso_start_url: String): SsoProfile = {
      val __obj = js.Dynamic.literal(sso_account_id = sso_account_id.asInstanceOf[js.Any], sso_region = sso_region.asInstanceOf[js.Any], sso_role_name = sso_role_name.asInstanceOf[js.Any], sso_start_url = sso_start_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SsoProfile]
    }
    
    extension [Self <: SsoProfile](x: Self) {
      
      inline def setSso_account_id(value: String): Self = StObject.set(x, "sso_account_id", value.asInstanceOf[js.Any])
      
      inline def setSso_region(value: String): Self = StObject.set(x, "sso_region", value.asInstanceOf[js.Any])
      
      inline def setSso_role_name(value: String): Self = StObject.set(x, "sso_role_name", value.asInstanceOf[js.Any])
      
      inline def setSso_session(value: String): Self = StObject.set(x, "sso_session", value.asInstanceOf[js.Any])
      
      inline def setSso_sessionUndefined: Self = StObject.set(x, "sso_session", js.undefined)
      
      inline def setSso_start_url(value: String): Self = StObject.set(x, "sso_start_url", value.asInstanceOf[js.Any])
    }
  }
}
