package typings.awsSdkCredentialProviderIni

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso.SsoProfile> */
  trait PartialSsoProfile extends StObject {
    
    var sso_account_id: js.UndefOr[String] = js.undefined
    
    var sso_region: js.UndefOr[String] = js.undefined
    
    var sso_role_name: js.UndefOr[String] = js.undefined
    
    var sso_session: js.UndefOr[String] = js.undefined
    
    var sso_start_url: js.UndefOr[String] = js.undefined
  }
  object PartialSsoProfile {
    
    inline def apply(): PartialSsoProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSsoProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSsoProfile] (val x: Self) extends AnyVal {
      
      inline def setSso_account_id(value: String): Self = StObject.set(x, "sso_account_id", value.asInstanceOf[js.Any])
      
      inline def setSso_account_idUndefined: Self = StObject.set(x, "sso_account_id", js.undefined)
      
      inline def setSso_region(value: String): Self = StObject.set(x, "sso_region", value.asInstanceOf[js.Any])
      
      inline def setSso_regionUndefined: Self = StObject.set(x, "sso_region", js.undefined)
      
      inline def setSso_role_name(value: String): Self = StObject.set(x, "sso_role_name", value.asInstanceOf[js.Any])
      
      inline def setSso_role_nameUndefined: Self = StObject.set(x, "sso_role_name", js.undefined)
      
      inline def setSso_session(value: String): Self = StObject.set(x, "sso_session", value.asInstanceOf[js.Any])
      
      inline def setSso_sessionUndefined: Self = StObject.set(x, "sso_session", js.undefined)
      
      inline def setSso_start_url(value: String): Self = StObject.set(x, "sso_start_url", value.asInstanceOf[js.Any])
      
      inline def setSso_start_urlUndefined: Self = StObject.set(x, "sso_start_url", js.undefined)
    }
  }
}
