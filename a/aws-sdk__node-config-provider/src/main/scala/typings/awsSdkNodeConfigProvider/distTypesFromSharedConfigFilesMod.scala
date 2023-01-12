package typings.awsSdkNodeConfigProvider

import typings.awsSdkNodeConfigProvider.awsSdkNodeConfigProviderStrings.config
import typings.awsSdkNodeConfigProvider.awsSdkNodeConfigProviderStrings.credentials
import typings.awsSdkSharedIniFileLoader.distTypesParseKnownFilesMod.SourceProfileInit
import typings.awsSdkTypes.distTypesProfileMod.Profile
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromSharedConfigFilesMod {
  
  @JSImport("@aws-sdk/node-config-provider/dist-types/fromSharedConfigFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSharedConfigFiles[T](configSelector: GetterFromConfig[T]): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")(configSelector.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  inline def fromSharedConfigFiles[T](configSelector: GetterFromConfig[T], param1: SharedConfigInit): Provider[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")(configSelector.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Provider[T]]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedConfigInit] (val x: Self) extends AnyVal {
      
      inline def setPreferredFile(value: config | credentials): Self = StObject.set(x, "preferredFile", value.asInstanceOf[js.Any])
      
      inline def setPreferredFileUndefined: Self = StObject.set(x, "preferredFile", js.undefined)
    }
  }
}
