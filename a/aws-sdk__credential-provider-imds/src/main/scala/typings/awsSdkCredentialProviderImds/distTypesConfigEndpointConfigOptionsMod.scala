package typings.awsSdkCredentialProviderImds

import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigEndpointConfigOptionsMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/config/EndpointConfigOptions", "CONFIG_ENDPOINT_NAME")
  @js.native
  val CONFIG_ENDPOINT_NAME: /* "ec2_metadata_service_endpoint" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/config/EndpointConfigOptions", "ENDPOINT_CONFIG_OPTIONS")
  @js.native
  val ENDPOINT_CONFIG_OPTIONS: LoadedConfigSelectors[js.UndefOr[String]] = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/config/EndpointConfigOptions", "ENV_ENDPOINT_NAME")
  @js.native
  val ENV_ENDPOINT_NAME: /* "AWS_EC2_METADATA_SERVICE_ENDPOINT" */ String = js.native
}
