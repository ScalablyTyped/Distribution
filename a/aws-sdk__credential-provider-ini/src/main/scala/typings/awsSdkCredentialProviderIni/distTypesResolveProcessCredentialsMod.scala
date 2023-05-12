package typings.awsSdkCredentialProviderIni

import typings.awsSdkCredentialProviderIni.distTypesFromIniMod.FromIniInit
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveProcessCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/resolveProcessCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isProcessProfile(arg: Any): /* is @aws-sdk/credential-provider-ini.@aws-sdk/credential-provider-ini/dist-types/resolveProcessCredentials.ProcessProfile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProcessProfile")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/credential-provider-ini.@aws-sdk/credential-provider-ini/dist-types/resolveProcessCredentials.ProcessProfile */ Boolean]
  
  inline def resolveProcessCredentials(options: FromIniInit, profile: String): js.Promise[Credentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProcessCredentials")(options.asInstanceOf[js.Any], profile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Credentials]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: string | undefined} */ trait ProcessProfile extends StObject {
    
    var credential_process: String
  }
  object ProcessProfile {
    
    inline def apply(credential_process: String): ProcessProfile = {
      val __obj = js.Dynamic.literal(credential_process = credential_process.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessProfile] (val x: Self) extends AnyVal {
      
      inline def setCredential_process(value: String): Self = StObject.set(x, "credential_process", value.asInstanceOf[js.Any])
    }
  }
}
