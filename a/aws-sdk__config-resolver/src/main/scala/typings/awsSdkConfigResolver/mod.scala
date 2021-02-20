package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.endpointsConfigMod.EndpointsInputConfig
import typings.awsSdkConfigResolver.endpointsConfigMod.EndpointsResolvedConfig
import typings.awsSdkConfigResolver.endpointsConfigMod.PreviouslyResolved
import typings.awsSdkConfigResolver.regionConfigMod.RegionInputConfig
import typings.awsSdkConfigResolver.regionConfigMod.RegionResolvedConfig
import typings.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typings.awsSdkNodeConfigProvider.configLoaderMod.LocalConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/config-resolver", "NODE_REGION_CONFIG_FILE_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_FILE_OPTIONS: LocalConfigOptions = js.native
  
  @JSImport("@aws-sdk/config-resolver", "NODE_REGION_CONFIG_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  @JSImport("@aws-sdk/config-resolver", "REGION_ENV_NAME")
  @js.native
  val REGION_ENV_NAME: /* "AWS_REGION" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver", "REGION_INI_NAME")
  @js.native
  val REGION_INI_NAME: /* "region" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver", "resolveEndpointsConfig")
  @js.native
  def resolveEndpointsConfig[T](input: T with EndpointsInputConfig with PreviouslyResolved): T with EndpointsResolvedConfig = js.native
  
  @JSImport("@aws-sdk/config-resolver", "resolveRegionConfig")
  @js.native
  def resolveRegionConfig[T](
    input: T with RegionInputConfig with typings.awsSdkConfigResolver.regionConfigMod.PreviouslyResolved
  ): T with RegionResolvedConfig = js.native
}
