package typings.awsSdk

import typings.awsSdk.configBaseMod.HTTPOptions
import typings.awsSdk.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/process_credentials", "ProcessCredentials")
  @js.native
  /**
    * Creates a new ProcessCredentials object.
    */
  open class ProcessCredentials () extends Credentials {
    def this(options: ProcessCredentialsOptions) = this()
  }
  
  trait ProcessCredentialsOptions extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var httpOptions: js.UndefOr[HTTPOptions] = js.undefined
    
    var profile: js.UndefOr[String] = js.undefined
  }
  object ProcessCredentialsOptions {
    
    inline def apply(): ProcessCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessCredentialsOptions]
    }
    
    extension [Self <: ProcessCredentialsOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
