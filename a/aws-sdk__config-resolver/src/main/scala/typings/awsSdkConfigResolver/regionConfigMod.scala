package typings.awsSdkConfigResolver

import typings.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typings.awsSdkNodeConfigProvider.configLoaderMod.LocalConfigOptions
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regionConfigMod {
  
  @JSImport("@aws-sdk/config-resolver/dist/cjs/RegionConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist/cjs/RegionConfig", "NODE_REGION_CONFIG_FILE_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_FILE_OPTIONS: LocalConfigOptions = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist/cjs/RegionConfig", "NODE_REGION_CONFIG_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist/cjs/RegionConfig", "REGION_ENV_NAME")
  @js.native
  val REGION_ENV_NAME: /* "AWS_REGION" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist/cjs/RegionConfig", "REGION_INI_NAME")
  @js.native
  val REGION_INI_NAME: /* "region" */ String = js.native
  
  inline def resolveRegionConfig[T](input: T & RegionInputConfig & PreviouslyResolved): T & RegionResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRegionConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & RegionResolvedConfig]
  
  trait PreviouslyResolved extends StObject
  
  trait RegionInputConfig extends StObject {
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.undefined
  }
  object RegionInputConfig {
    
    inline def apply(): RegionInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionInputConfig]
    }
    
    extension [Self <: RegionInputConfig](x: Self) {
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  trait RegionResolvedConfig extends StObject {
    
    def region(): js.Promise[String]
    @JSName("region")
    var region_Original: Provider[String]
  }
  object RegionResolvedConfig {
    
    inline def apply(region: () => js.Promise[String]): RegionResolvedConfig = {
      val __obj = js.Dynamic.literal(region = js.Any.fromFunction0(region))
      __obj.asInstanceOf[RegionResolvedConfig]
    }
    
    extension [Self <: RegionResolvedConfig](x: Self) {
      
      inline def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
    }
  }
}
