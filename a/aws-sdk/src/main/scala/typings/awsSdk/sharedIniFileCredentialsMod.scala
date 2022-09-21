package typings.awsSdk

import typings.awsSdk.configBaseMod.HTTPOptions
import typings.awsSdk.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedIniFileCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/shared_ini_file_credentials", "SharedIniFileCredentials")
  @js.native
  /**
    * Creates a new SharedIniFileCredentials object.
    */
  open class SharedIniFileCredentials () extends Credentials {
    def this(options: SharedIniFileCredentialsOptions) = this()
  }
  
  trait SharedIniFileCredentialsOptions extends StObject {
    
    var callback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.undefined
    
    var disableAssumeRole: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var httpOptions: js.UndefOr[HTTPOptions] = js.undefined
    
    var profile: js.UndefOr[String] = js.undefined
    
    var tokenCodeFn: js.UndefOr[
        js.Function2[
          /* mfaSerial */ String, 
          /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object SharedIniFileCredentialsOptions {
    
    inline def apply(): SharedIniFileCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedIniFileCredentialsOptions]
    }
    
    extension [Self <: SharedIniFileCredentialsOptions](x: Self) {
      
      inline def setCallback(value: /* err */ js.UndefOr[js.Error] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDisableAssumeRole(value: Boolean): Self = StObject.set(x, "disableAssumeRole", value.asInstanceOf[js.Any])
      
      inline def setDisableAssumeRoleUndefined: Self = StObject.set(x, "disableAssumeRole", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setTokenCodeFn(
        value: (/* mfaSerial */ String, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "tokenCodeFn", js.Any.fromFunction2(value))
      
      inline def setTokenCodeFnUndefined: Self = StObject.set(x, "tokenCodeFn", js.undefined)
    }
  }
}
