package typings.awsSdkNodeConfigProvider

import typings.awsSdkNodeConfigProvider.awsSdkNodeConfigProviderStrings.config
import typings.awsSdkNodeConfigProvider.awsSdkNodeConfigProviderStrings.credentials
import typings.awsSdkSharedIniFileLoader.mod.Profile
import typings.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromSharedConfigFilesMod {
  
  @JSImport("@aws-sdk/node-config-provider/dist/cjs/fromSharedConfigFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/node-config-provider/dist/cjs/fromSharedConfigFiles", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  @scala.inline
  def fromSharedConfigFiles[T](configSelector: GetterFromConfig[T]): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")(configSelector.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  @scala.inline
  def fromSharedConfigFiles[T](configSelector: GetterFromConfig[T], hasPreferredFileInit: SharedConfigInit): Provider[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")(configSelector.asInstanceOf[js.Any], hasPreferredFileInit.asInstanceOf[js.Any])).asInstanceOf[Provider[T]]
  
  type GetterFromConfig[T] = js.Function1[/* profile */ Profile, js.UndefOr[T]]
  
  trait SharedConfigInit
    extends StObject
       with typings.awsSdkSharedIniFileLoader.mod.SharedConfigInit {
    
    /**
      * A promise that will be resolved with loaded and parsed credentials files.
      * Used to avoid loading shared config files multiple times.
      */
    var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.undefined
    
    /**
      * The preferred shared ini file to load the config. "config" option refers to
      * the shared config file(defaults to `~/.aws/config`). "credentials" option
      * refers to the shared credentials file(defaults to `~/.aws/credentials`)
      */
    var preferredFile: js.UndefOr[config | credentials] = js.undefined
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.undefined
  }
  object SharedConfigInit {
    
    @scala.inline
    def apply(): SharedConfigInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedConfigInit]
    }
    
    @scala.inline
    implicit class SharedConfigInitMutableBuilder[Self <: SharedConfigInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadedConfig(value: js.Promise[SharedConfigFiles]): Self = StObject.set(x, "loadedConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedConfigUndefined: Self = StObject.set(x, "loadedConfig", js.undefined)
      
      @scala.inline
      def setPreferredFile(value: config | credentials): Self = StObject.set(x, "preferredFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredFileUndefined: Self = StObject.set(x, "preferredFile", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
