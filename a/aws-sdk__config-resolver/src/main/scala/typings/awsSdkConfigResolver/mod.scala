package typings.awsSdkConfigResolver

import typings.awsSdkConfigResolver.endpointsConfigMod.EndpointsInputConfig
import typings.awsSdkConfigResolver.endpointsConfigMod.EndpointsResolvedConfig
import typings.awsSdkConfigResolver.regionConfigMod.RegionInputConfig
import typings.awsSdkConfigResolver.regionConfigMod.RegionResolvedConfig
import typings.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typings.awsSdkNodeConfigProvider.configLoaderMod.LocalConfigOptions
import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.utilMod.RegionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/config-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def resolveEndpointsConfig[T](
    input: T & EndpointsInputConfig & typings.awsSdkConfigResolver.endpointsConfigMod.PreviouslyResolved
  ): T & EndpointsResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointsConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & EndpointsResolvedConfig]
  
  @scala.inline
  def resolveRegionConfig[T](input: T & RegionInputConfig & typings.awsSdkConfigResolver.regionConfigMod.PreviouslyResolved): T & RegionResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRegionConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & RegionResolvedConfig]
  
  trait PreviouslyResolved
    extends StObject
       with typings.awsSdkConfigResolver.endpointsConfigMod.PreviouslyResolved
       with typings.awsSdkConfigResolver.regionConfigMod.PreviouslyResolved
  object PreviouslyResolved {
    
    @scala.inline
    def apply(
      region: () => js.Promise[String],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]],
      urlParser: /* url */ String => Endpoint
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(region = js.Any.fromFunction0(region), regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), urlParser = js.Any.fromFunction1(urlParser))
      __obj.asInstanceOf[PreviouslyResolved]
    }
  }
}
