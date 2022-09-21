package typings.awsSdkCredentialProviderSso

import typings.awsSdkClientSso.mod.SSOClient
import typings.awsSdkCredentialProviderSso.anon.FromSSOInitPartialSsoCred
import typings.awsSdkSharedIniFileLoader.parseKnownFilesMod.SourceProfileInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromSSOMod {
  
  @JSImport("@aws-sdk/credential-provider-sso/dist-types/fromSSO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSSO(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")().asInstanceOf[CredentialProvider]
  inline def fromSSO(init: FromSSOInitPartialSsoCred): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  trait FromSSOInit
    extends StObject
       with SourceProfileInit {
    
    var ssoClient: js.UndefOr[SSOClient] = js.undefined
  }
  object FromSSOInit {
    
    inline def apply(): FromSSOInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromSSOInit]
    }
    
    extension [Self <: FromSSOInit](x: Self) {
      
      inline def setSsoClient(value: SSOClient): Self = StObject.set(x, "ssoClient", value.asInstanceOf[js.Any])
      
      inline def setSsoClientUndefined: Self = StObject.set(x, "ssoClient", js.undefined)
    }
  }
  
  trait SsoCredentialsParameters extends StObject {
    
    /**
      * The ID of the AWS account to use for temporary credentials.
      */
    var ssoAccountId: String
    
    /**
      * The AWS region to use for temporary credentials.
      */
    var ssoRegion: String
    
    /**
      * The name of the AWS role to assume.
      */
    var ssoRoleName: String
    
    /**
      * The URL to the AWS SSO service.
      */
    var ssoStartUrl: String
  }
  object SsoCredentialsParameters {
    
    inline def apply(ssoAccountId: String, ssoRegion: String, ssoRoleName: String, ssoStartUrl: String): SsoCredentialsParameters = {
      val __obj = js.Dynamic.literal(ssoAccountId = ssoAccountId.asInstanceOf[js.Any], ssoRegion = ssoRegion.asInstanceOf[js.Any], ssoRoleName = ssoRoleName.asInstanceOf[js.Any], ssoStartUrl = ssoStartUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SsoCredentialsParameters]
    }
    
    extension [Self <: SsoCredentialsParameters](x: Self) {
      
      inline def setSsoAccountId(value: String): Self = StObject.set(x, "ssoAccountId", value.asInstanceOf[js.Any])
      
      inline def setSsoRegion(value: String): Self = StObject.set(x, "ssoRegion", value.asInstanceOf[js.Any])
      
      inline def setSsoRoleName(value: String): Self = StObject.set(x, "ssoRoleName", value.asInstanceOf[js.Any])
      
      inline def setSsoStartUrl(value: String): Self = StObject.set(x, "ssoStartUrl", value.asInstanceOf[js.Any])
    }
  }
}
