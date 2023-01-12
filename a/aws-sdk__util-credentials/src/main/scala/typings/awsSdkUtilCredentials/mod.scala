package typings.awsSdkUtilCredentials

import typings.awsSdkSharedIniFileLoader.distTypesLoadSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkSharedIniFileLoader.distTypesTypesMod.ParsedIniData
import typings.awsSdkSharedIniFileLoader.distTypesTypesMod.SharedConfigFiles
import typings.awsSdkUtilCredentials.anon.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-credentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/util-credentials", "DEFAULT_PROFILE")
  @js.native
  val DEFAULT_PROFILE: /* "default" */ String = js.native
  
  @JSImport("@aws-sdk/util-credentials", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  inline def getMasterProfileName(init: Profile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMasterProfileName")(init.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseKnownFiles(init: SourceProfileInit): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKnownFiles")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedIniData]]
  
  trait SourceProfileInit
    extends StObject
       with SharedConfigInit {
    
    /**
      * A promise that will be resolved with loaded and parsed credentials files.
      * Used to avoid loading shared config files multiple times.
      *
      * @internal
      */
    var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.undefined
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.undefined
  }
  object SourceProfileInit {
    
    inline def apply(): SourceProfileInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceProfileInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceProfileInit] (val x: Self) extends AnyVal {
      
      inline def setLoadedConfig(value: js.Promise[SharedConfigFiles]): Self = StObject.set(x, "loadedConfig", value.asInstanceOf[js.Any])
      
      inline def setLoadedConfigUndefined: Self = StObject.set(x, "loadedConfig", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
