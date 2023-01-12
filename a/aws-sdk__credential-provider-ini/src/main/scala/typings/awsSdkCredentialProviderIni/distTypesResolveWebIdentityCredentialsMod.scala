package typings.awsSdkCredentialProviderIni

import typings.awsSdkCredentialProviderIni.distTypesFromIniMod.FromIniInit
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveWebIdentityCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/resolveWebIdentityCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isWebIdentityProfile(arg: Any): /* is @aws-sdk/credential-provider-ini.@aws-sdk/credential-provider-ini/dist-types/resolveWebIdentityCredentials.WebIdentityProfile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebIdentityProfile")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/credential-provider-ini.@aws-sdk/credential-provider-ini/dist-types/resolveWebIdentityCredentials.WebIdentityProfile */ Boolean]
  
  inline def resolveWebIdentityCredentials(profile: WebIdentityProfile, options: FromIniInit): js.Promise[Credentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveWebIdentityCredentials")(profile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Credentials]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: string | undefined} */ trait WebIdentityProfile extends StObject {
    
    var role_arn: String
    
    var role_session_name: js.UndefOr[String] = js.undefined
    
    var web_identity_token_file: String
  }
  object WebIdentityProfile {
    
    inline def apply(role_arn: String, web_identity_token_file: String): WebIdentityProfile = {
      val __obj = js.Dynamic.literal(role_arn = role_arn.asInstanceOf[js.Any], web_identity_token_file = web_identity_token_file.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebIdentityProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebIdentityProfile] (val x: Self) extends AnyVal {
      
      inline def setRole_arn(value: String): Self = StObject.set(x, "role_arn", value.asInstanceOf[js.Any])
      
      inline def setRole_session_name(value: String): Self = StObject.set(x, "role_session_name", value.asInstanceOf[js.Any])
      
      inline def setRole_session_nameUndefined: Self = StObject.set(x, "role_session_name", js.undefined)
      
      inline def setWeb_identity_token_file(value: String): Self = StObject.set(x, "web_identity_token_file", value.asInstanceOf[js.Any])
    }
  }
}
