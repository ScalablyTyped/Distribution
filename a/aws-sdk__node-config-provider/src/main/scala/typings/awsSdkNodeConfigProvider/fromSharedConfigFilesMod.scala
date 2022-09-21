package typings.awsSdkNodeConfigProvider

import typings.awsSdkNodeConfigProvider.awsSdkNodeConfigProviderStrings.config
import typings.awsSdkNodeConfigProvider.awsSdkNodeConfigProviderStrings.credentials
import typings.awsSdkSharedIniFileLoader.parseKnownFilesMod.SourceProfileInit
import typings.awsSdkTypes.profileMod.Profile
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromSharedConfigFilesMod {
  
  @JSImport("@aws-sdk/node-config-provider/dist-types/fromSharedConfigFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSharedConfigFiles[T](configSelector: GetterFromConfig[T]): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")(configSelector.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  inline def fromSharedConfigFiles[T](configSelector: GetterFromConfig[T], hasPreferredFileInit: SharedConfigInit): Provider[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")(configSelector.asInstanceOf[js.Any], hasPreferredFileInit.asInstanceOf[js.Any])).asInstanceOf[Provider[T]]
  
  type GetterFromConfig[T] = js.Function1[/* profile */ Profile, js.UndefOr[T]]
  
  trait SharedConfigInit
    extends StObject
       with SourceProfileInit {
    
    /**
      * The preferred shared ini file to load the config. "config" option refers to
      * the shared config file(defaults to `~/.aws/config`). "credentials" option
      * refers to the shared credentials file(defaults to `~/.aws/credentials`)
      */
    var preferredFile: js.UndefOr[config | credentials] = js.undefined
  }
  object SharedConfigInit {
    
    inline def apply(): SharedConfigInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedConfigInit]
    }
    
    extension [Self <: SharedConfigInit](x: Self) {
      
      inline def setPreferredFile(value: config | credentials): Self = StObject.set(x, "preferredFile", value.asInstanceOf[js.Any])
      
      inline def setPreferredFileUndefined: Self = StObject.set(x, "preferredFile", js.undefined)
    }
  }
}
