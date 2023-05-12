package typings.awsSdkCredentialProviderSso

import typings.awsSdkClientSso.mod.SSOClient
import typings.awsSdkCredentialProviderSso.anon.FromSSOInitPartialSsoCred
import typings.awsSdkSharedIniFileLoader.distTypesParseKnownFilesMod.SourceProfileInit
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromSSOMod {
  
  @JSImport("@aws-sdk/credential-provider-sso/dist-types/fromSSO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSSO(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromSSO(init: FromSSOInitPartialSsoCred): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromSSOInit] (val x: Self) extends AnyVal {
      
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
      * SSO session identifier.
      * Presence implies usage of the SSOTokenProvider.
      */
    var ssoSession: js.UndefOr[String] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SsoCredentialsParameters] (val x: Self) extends AnyVal {
      
      inline def setSsoAccountId(value: String): Self = StObject.set(x, "ssoAccountId", value.asInstanceOf[js.Any])
      
      inline def setSsoRegion(value: String): Self = StObject.set(x, "ssoRegion", value.asInstanceOf[js.Any])
      
      inline def setSsoRoleName(value: String): Self = StObject.set(x, "ssoRoleName", value.asInstanceOf[js.Any])
      
      inline def setSsoSession(value: String): Self = StObject.set(x, "ssoSession", value.asInstanceOf[js.Any])
      
      inline def setSsoSessionUndefined: Self = StObject.set(x, "ssoSession", js.undefined)
      
      inline def setSsoStartUrl(value: String): Self = StObject.set(x, "ssoStartUrl", value.asInstanceOf[js.Any])
    }
  }
}
