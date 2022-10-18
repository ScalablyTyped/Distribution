package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveCustomEndpointsConfigMod.CustomEndpointsInputConfig
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveCustomEndpointsConfigMod.CustomEndpointsResolvedConfig
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveCustomEndpointsConfigMod.PreviouslyResolved
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveEndpointsConfigMod.EndpointsInputConfig
import typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveEndpointsConfigMod.EndpointsResolvedConfig
import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointsConfigMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig", "CONFIG_USE_DUALSTACK_ENDPOINT")
  @js.native
  val CONFIG_USE_DUALSTACK_ENDPOINT: /* "use_dualstack_endpoint" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig", "CONFIG_USE_FIPS_ENDPOINT")
  @js.native
  val CONFIG_USE_FIPS_ENDPOINT: /* "use_fips_endpoint" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig", "DEFAULT_USE_DUALSTACK_ENDPOINT")
  @js.native
  val DEFAULT_USE_DUALSTACK_ENDPOINT: /* false */ Boolean = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig", "DEFAULT_USE_FIPS_ENDPOINT")
  @js.native
  val DEFAULT_USE_FIPS_ENDPOINT: /* false */ Boolean = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig", "ENV_USE_DUALSTACK_ENDPOINT")
  @js.native
  val ENV_USE_DUALSTACK_ENDPOINT: /* "AWS_USE_DUALSTACK_ENDPOINT" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig", "ENV_USE_FIPS_ENDPOINT")
  @js.native
  val ENV_USE_FIPS_ENDPOINT: /* "AWS_USE_FIPS_ENDPOINT" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig", "NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS")
  @js.native
  val NODE_USE_DUALSTACK_ENDPOINT_CONFIG_OPTIONS: LoadedConfigSelectors[Boolean] = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/endpointsConfig", "NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS")
  @js.native
  val NODE_USE_FIPS_ENDPOINT_CONFIG_OPTIONS: LoadedConfigSelectors[Boolean] = js.native
  
  inline def resolveCustomEndpointsConfig[T](input: T & CustomEndpointsInputConfig & PreviouslyResolved): T & CustomEndpointsResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCustomEndpointsConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & CustomEndpointsResolvedConfig]
  
  inline def resolveEndpointsConfig[T](
    input: T & EndpointsInputConfig & typings.awsSdkConfigResolver.distTypesEndpointsConfigResolveEndpointsConfigMod.PreviouslyResolved
  ): T & EndpointsResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointsConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & EndpointsResolvedConfig]
}
