package typings.awsSdkCredentialProviderProcess

import typings.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typings.awsSdkSharedIniFileLoader.mod.SharedConfigInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/credential-provider-process", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  inline def fromProcess(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")().asInstanceOf[CredentialProvider]
  inline def fromProcess(init: FromProcessInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  trait FromProcessInit
    extends StObject
       with SharedConfigInit {
    
    /**
      * A promise that will be resolved with loaded and parsed credentials files.
      * Used to avoid loading shared config files multiple times.
      */
    var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.undefined
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.undefined
  }
  object FromProcessInit {
    
    inline def apply(): FromProcessInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromProcessInit]
    }
    
    extension [Self <: FromProcessInit](x: Self) {
      
      inline def setLoadedConfig(value: js.Promise[SharedConfigFiles]): Self = StObject.set(x, "loadedConfig", value.asInstanceOf[js.Any])
      
      inline def setLoadedConfigUndefined: Self = StObject.set(x, "loadedConfig", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
