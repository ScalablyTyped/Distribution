package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.distTypesRegionConfigResolveRegionConfigMod.PreviouslyResolved
import typings.awsSdkConfigResolver.distTypesRegionConfigResolveRegionConfigMod.RegionInputConfig
import typings.awsSdkConfigResolver.distTypesRegionConfigResolveRegionConfigMod.RegionResolvedConfig
import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LocalConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegionConfigMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig", "NODE_REGION_CONFIG_FILE_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_FILE_OPTIONS: LocalConfigOptions = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig", "NODE_REGION_CONFIG_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig", "REGION_ENV_NAME")
  @js.native
  val REGION_ENV_NAME: /* "AWS_REGION" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig", "REGION_INI_NAME")
  @js.native
  val REGION_INI_NAME: /* "region" */ String = js.native
  
  inline def resolveRegionConfig[T](input: T & RegionInputConfig & PreviouslyResolved): T & RegionResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRegionConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & RegionResolvedConfig]
}
