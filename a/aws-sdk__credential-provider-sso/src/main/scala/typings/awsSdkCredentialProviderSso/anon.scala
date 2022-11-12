package typings.awsSdkCredentialProviderSso

import typings.awsSdkClientSso.mod.SSOClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso/dist-types/fromSSO.FromSSOInit & std.Partial<@aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso/dist-types/fromSSO.SsoCredentialsParameters> */
  trait FromSSOInitPartialSsoCred extends StObject {
    
    /**
      * The path at which to locate the ini config file. Defaults to the value of
      * the `AWS_CONFIG_FILE` environment variable (if defined) or
      * `~/.aws/config` otherwise.
      */
    var configFilepath: js.UndefOr[String] = js.undefined
    
    /**
      * The path at which to locate the ini credentials file. Defaults to the
      * value of the `AWS_SHARED_CREDENTIALS_FILE` environment variable (if
      * defined) or `~/.aws/credentials` otherwise.
      */
    var filepath: js.UndefOr[String] = js.undefined
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.undefined
    
    var ssoAccountId: js.UndefOr[String] = js.undefined
    
    var ssoClient: js.UndefOr[SSOClient] = js.undefined
    
    var ssoRegion: js.UndefOr[String] = js.undefined
    
    var ssoRoleName: js.UndefOr[String] = js.undefined
    
    var ssoSession: js.UndefOr[String] = js.undefined
    
    var ssoStartUrl: js.UndefOr[String] = js.undefined
  }
  object FromSSOInitPartialSsoCred {
    
    inline def apply(): FromSSOInitPartialSsoCred = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromSSOInitPartialSsoCred]
    }
    
    extension [Self <: FromSSOInitPartialSsoCred](x: Self) {
      
      inline def setConfigFilepath(value: String): Self = StObject.set(x, "configFilepath", value.asInstanceOf[js.Any])
      
      inline def setConfigFilepathUndefined: Self = StObject.set(x, "configFilepath", js.undefined)
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSsoAccountId(value: String): Self = StObject.set(x, "ssoAccountId", value.asInstanceOf[js.Any])
      
      inline def setSsoAccountIdUndefined: Self = StObject.set(x, "ssoAccountId", js.undefined)
      
      inline def setSsoClient(value: SSOClient): Self = StObject.set(x, "ssoClient", value.asInstanceOf[js.Any])
      
      inline def setSsoClientUndefined: Self = StObject.set(x, "ssoClient", js.undefined)
      
      inline def setSsoRegion(value: String): Self = StObject.set(x, "ssoRegion", value.asInstanceOf[js.Any])
      
      inline def setSsoRegionUndefined: Self = StObject.set(x, "ssoRegion", js.undefined)
      
      inline def setSsoRoleName(value: String): Self = StObject.set(x, "ssoRoleName", value.asInstanceOf[js.Any])
      
      inline def setSsoRoleNameUndefined: Self = StObject.set(x, "ssoRoleName", js.undefined)
      
      inline def setSsoSession(value: String): Self = StObject.set(x, "ssoSession", value.asInstanceOf[js.Any])
      
      inline def setSsoSessionUndefined: Self = StObject.set(x, "ssoSession", js.undefined)
      
      inline def setSsoStartUrl(value: String): Self = StObject.set(x, "ssoStartUrl", value.asInstanceOf[js.Any])
      
      inline def setSsoStartUrlUndefined: Self = StObject.set(x, "ssoStartUrl", js.undefined)
    }
  }
}
