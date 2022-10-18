package typings.awsSdkRegionProvider

import typings.awsSdkSharedIniFileLoader.distTypesTypesMod.SharedConfigFiles
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFromSharedConfigFilesMod {
  
  @JSImport("@aws-sdk/region-provider/build/fromSharedConfigFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/region-provider/build/fromSharedConfigFiles", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  inline def fromSharedConfigFiles(): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")().asInstanceOf[Provider[String]]
  inline def fromSharedConfigFiles(init: SharedConfigInit): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")(init.asInstanceOf[js.Any]).asInstanceOf[Provider[String]]
  
  trait SharedConfigInit
    extends StObject
       with typings.awsSdkSharedIniFileLoader.distTypesLoadSharedConfigFilesMod.SharedConfigInit {
    
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
  object SharedConfigInit {
    
    inline def apply(): SharedConfigInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedConfigInit]
    }
    
    extension [Self <: SharedConfigInit](x: Self) {
      
      inline def setLoadedConfig(value: js.Promise[SharedConfigFiles]): Self = StObject.set(x, "loadedConfig", value.asInstanceOf[js.Any])
      
      inline def setLoadedConfigUndefined: Self = StObject.set(x, "loadedConfig", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
