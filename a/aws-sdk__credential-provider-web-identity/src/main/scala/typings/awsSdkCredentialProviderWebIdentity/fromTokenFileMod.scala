package typings.awsSdkCredentialProviderWebIdentity

import typings.awsSdkCredentialProviderWebIdentity.anon.Arn
import typings.awsSdkCredentialProviderWebIdentity.fromWebTokenMod.AssumeRoleWithWebIdentityParams
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import typings.awsSdkTypes.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromTokenFileMod {
  
  @JSImport("@aws-sdk/credential-provider-web-identity/dist-types/fromTokenFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromTokenFile(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")().asInstanceOf[CredentialProvider]
  inline def fromTokenFile(init: FromTokenFileInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  /* Inlined parent std.Partial<std.Omit<@aws-sdk/credential-provider-web-identity.@aws-sdk/credential-provider-web-identity/dist-types/fromWebToken.FromWebTokenInit, 'webIdentityToken'>> */
  trait FromTokenFileInit extends StObject {
    
    var DurationSeconds: js.UndefOr[Double] = js.undefined
    
    var Policy: js.UndefOr[String] = js.undefined
    
    var PolicyArns: js.UndefOr[js.Array[Arn]] = js.undefined
    
    var ProviderId: js.UndefOr[String] = js.undefined
    
    var RoleArn: js.UndefOr[String] = js.undefined
    
    var RoleSessionName: js.UndefOr[String] = js.undefined
    
    var WebIdentityToken: js.UndefOr[String] = js.undefined
    
    var roleAssumerWithWebIdentity: js.UndefOr[
        js.Function1[/* params */ AssumeRoleWithWebIdentityParams, js.Promise[Credentials]]
      ] = js.undefined
    
    var roleSessionName: js.UndefOr[String] = js.undefined
    
    /**
      * File location of where the `OIDC` token is stored.
      */
    var webIdentityTokenFile: js.UndefOr[String] = js.undefined
  }
  object FromTokenFileInit {
    
    inline def apply(): FromTokenFileInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromTokenFileInit]
    }
    
    extension [Self <: FromTokenFileInit](x: Self) {
      
      inline def setDurationSeconds(value: Double): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
      
      inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyArns(value: js.Array[Arn]): Self = StObject.set(x, "PolicyArns", value.asInstanceOf[js.Any])
      
      inline def setPolicyArnsUndefined: Self = StObject.set(x, "PolicyArns", js.undefined)
      
      inline def setPolicyArnsVarargs(value: Arn*): Self = StObject.set(x, "PolicyArns", js.Array(value*))
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "ProviderId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "ProviderId", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
      
      inline def setRoleAssumerWithWebIdentity(value: /* params */ AssumeRoleWithWebIdentityParams => js.Promise[Credentials]): Self = StObject.set(x, "roleAssumerWithWebIdentity", js.Any.fromFunction1(value))
      
      inline def setRoleAssumerWithWebIdentityUndefined: Self = StObject.set(x, "roleAssumerWithWebIdentity", js.undefined)
      
      inline def setRoleSessionName(value: String): Self = StObject.set(x, "RoleSessionName", value.asInstanceOf[js.Any])
      
      inline def setRoleSessionNameUndefined: Self = StObject.set(x, "RoleSessionName", js.undefined)
      
      inline def setWebIdentityToken(value: String): Self = StObject.set(x, "WebIdentityToken", value.asInstanceOf[js.Any])
      
      inline def setWebIdentityTokenFile(value: String): Self = StObject.set(x, "webIdentityTokenFile", value.asInstanceOf[js.Any])
      
      inline def setWebIdentityTokenFileUndefined: Self = StObject.set(x, "webIdentityTokenFile", js.undefined)
      
      inline def setWebIdentityTokenUndefined: Self = StObject.set(x, "WebIdentityToken", js.undefined)
    }
  }
}
