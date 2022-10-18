package typings.awsSdkCredentialProviderImds

import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigEndpointModeConfigOptionsMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/config/EndpointModeConfigOptions", "CONFIG_ENDPOINT_MODE_NAME")
  @js.native
  val CONFIG_ENDPOINT_MODE_NAME: /* "ec2_metadata_service_endpoint_mode" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/config/EndpointModeConfigOptions", "ENDPOINT_MODE_CONFIG_OPTIONS")
  @js.native
  val ENDPOINT_MODE_CONFIG_OPTIONS: LoadedConfigSelectors[js.UndefOr[String]] = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/config/EndpointModeConfigOptions", "ENV_ENDPOINT_MODE_NAME")
  @js.native
  val ENV_ENDPOINT_MODE_NAME: /* "AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE" */ String = js.native
}
