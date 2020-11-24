package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.endpointsConfigMod.EndpointsInputConfig
import typings.awsSdkConfigResolver.endpointsConfigMod.EndpointsResolvedConfig
import typings.awsSdkConfigResolver.endpointsConfigMod.PreviouslyResolved
import typings.awsSdkConfigResolver.regionConfigMod.RegionInputConfig
import typings.awsSdkConfigResolver.regionConfigMod.RegionResolvedConfig
import typings.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typings.awsSdkNodeConfigProvider.configLoaderMod.LocalConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/config-resolver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val NODE_REGION_CONFIG_FILE_OPTIONS: LocalConfigOptions = js.native
  
  val NODE_REGION_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  val REGION_ENV_NAME: /* "AWS_REGION" */ String = js.native
  
  val REGION_INI_NAME: /* "region" */ String = js.native
  
  def resolveEndpointsConfig[T](input: T with EndpointsInputConfig with PreviouslyResolved): T with EndpointsResolvedConfig = js.native
  
  def resolveRegionConfig[T](
    input: T with RegionInputConfig with typings.awsSdkConfigResolver.regionConfigMod.PreviouslyResolved
  ): T with RegionResolvedConfig = js.native
}
