package typings.awsSdk

import typings.awsSdk.configBaseMod.HTTPOptions
import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.ssoMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssoCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/sso_credentials", "SsoCredentials")
  @js.native
  /**
    * Creates a new SsoCredentials object.
    */
  open class SsoCredentials () extends Credentials {
    def this(options: SsoCredentialsOptions) = this()
  }
  
  trait SsoCredentialsOptions extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var httpOptions: js.UndefOr[HTTPOptions] = js.undefined
    
    var profile: js.UndefOr[String] = js.undefined
    
    var ssoClient: js.UndefOr[^] = js.undefined
  }
  object SsoCredentialsOptions {
    
    inline def apply(): SsoCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SsoCredentialsOptions]
    }
    
    extension [Self <: SsoCredentialsOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setSsoClient(value: ^): Self = StObject.set(x, "ssoClient", value.asInstanceOf[js.Any])
      
      inline def setSsoClientUndefined: Self = StObject.set(x, "ssoClient", js.undefined)
    }
  }
}
