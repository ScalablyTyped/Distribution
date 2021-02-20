package typings.awsSdkRegionProvider

import typings.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromSharedConfigFilesMod {
  
  @JSImport("@aws-sdk/region-provider/build/fromSharedConfigFiles", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  @JSImport("@aws-sdk/region-provider/build/fromSharedConfigFiles", "fromSharedConfigFiles")
  @js.native
  def fromSharedConfigFiles(): Provider[String] = js.native
  @JSImport("@aws-sdk/region-provider/build/fromSharedConfigFiles", "fromSharedConfigFiles")
  @js.native
  def fromSharedConfigFiles(init: SharedConfigInit): Provider[String] = js.native
  
  @js.native
  trait SharedConfigInit
    extends typings.awsSdkSharedIniFileLoader.mod.SharedConfigInit {
    
    /**
      * A promise that will be resolved with loaded and parsed credentials files.
      * Used to avoid loading shared config files multiple times.
      */
    var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.native
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.native
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
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
