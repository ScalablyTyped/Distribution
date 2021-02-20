package typings.awsSdkConfigResolver

import typings.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typings.awsSdkNodeConfigProvider.configLoaderMod.LocalConfigOptions
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regionConfigMod {
  
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
  
  @JSImport("@aws-sdk/config-resolver/dist/cjs/RegionConfig", "resolveRegionConfig")
  @js.native
  def resolveRegionConfig[T](input: T with RegionInputConfig with PreviouslyResolved): T with RegionResolvedConfig = js.native
  
  @js.native
  trait PreviouslyResolved extends StObject
  
  @js.native
  trait RegionInputConfig extends StObject {
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.native
  }
  object RegionInputConfig {
    
    @scala.inline
    def apply(): RegionInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionInputConfig]
    }
    
    @scala.inline
    implicit class RegionInputConfigMutableBuilder[Self <: RegionInputConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  @js.native
  trait RegionResolvedConfig extends StObject {
    
    def region(): js.Promise[String] = js.native
    @JSName("region")
    var region_Original: Provider[String] = js.native
  }
}
