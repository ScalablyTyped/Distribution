package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveCustomEndpointsConfigMod.CustomEndpointsInputConfig
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveCustomEndpointsConfigMod.CustomEndpointsResolvedConfig
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveCustomEndpointsConfigMod.PreviouslyResolved
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveEndpointsConfigMod.EndpointsInputConfig
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveEndpointsConfigMod.EndpointsResolvedConfig
import typings.awsSdkConfigResolver.distTypesRegionConfigResolveRegionConfigMod.RegionInputConfig
import typings.awsSdkConfigResolver.distTypesRegionConfigResolveRegionConfigMod.RegionResolvedConfig
import typings.awsSdkConfigResolver.distTypesRegionInfoGetRegionInfoMod.GetRegionInfoOptions
import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LocalConfigOptions
import typings.awsSdkTypes.distTypesUtilMod.RegionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/config-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/config-resolver", "CONFIG_USE_DUALSTACK_ENDPOINT")
  @js.native
  val CONFIG_USE_DUALSTACK_ENDPOINT: /* "use_dualstack_endpoint" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver", "CONFIG_USE_FIPS_ENDPOINT")
  @js.native
  val CONFIG_USE_FIPS_ENDPOINT: /* "use_fips_endpoint" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver", "DEFAULT_USE_DUALSTACK_ENDPOINT")
  @js.native
  val DEFAULT_USE_DUALSTACK_ENDPOINT: /* false */ Boolean = js.native
  
  @JSImport("@aws-sdk/config-resolver", "DEFAULT_USE_FIPS_ENDPOINT")
  @js.native
  val DEFAULT_USE_FIPS_ENDPOINT: /* false */ Boolean = js.native
  
  @JSImport("@aws-sdk/config-resolver", "ENV_USE_DUALSTACK_ENDPOINT")
  @js.native
  val ENV_USE_DUALSTACK_ENDPOINT: /* "AWS_USE_DUALSTACK_ENDPOINT" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver", "ENV_USE_FIPS_ENDPOINT")
  @js.native
  val ENV_USE_FIPS_ENDPOINT: /* "AWS_USE_FIPS_ENDPOINT" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver", "NODE_REGION_CONFIG_FILE_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_FILE_OPTIONS: LocalConfigOptions = js.native
  
  @JSImport("@aws-sdk/config-resolver", "NODE_REGION_CONFIG_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  @JSImport("@aws-sdk/config-resolver", "NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS")
  @js.native
  val NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS: LoadedConfigSelectors[Boolean] = js.native
  
  @JSImport("@aws-sdk/config-resolver", "NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS")
  @js.native
  val NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS: LoadedConfigSelectors[Boolean] = js.native
  
  @JSImport("@aws-sdk/config-resolver", "REGION_ENV_NAME")
  @js.native
  val REGION_ENV_NAME: /* "AWS_REGION" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver", "REGION_INI_NAME")
  @js.native
  val REGION_INI_NAME: /* "region" */ String = js.native
  
  inline def getRegionInfo(region: String, param1: GetRegionInfoOptions): RegionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegionInfo")(region.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RegionInfo]
  
  inline def resolveCustomEndpointsConfig[T](input: T & CustomEndpointsInputConfig & PreviouslyResolved): T & CustomEndpointsResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCustomEndpointsConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & CustomEndpointsResolvedConfig]
  
  inline def resolveEndpointsConfig[T](
    input: T & EndpointsInputConfig & typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveEndpointsConfigMod.PreviouslyResolved
  ): T & EndpointsResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointsConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & EndpointsResolvedConfig]
  
  inline def resolveRegionConfig[T](
    input: T & RegionInputConfig & typings.awsSdkConfigResolver.distTypesRegionConfigResolveRegionConfigMod.PreviouslyResolved
  ): T & RegionResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRegionConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & RegionResolvedConfig]
}
