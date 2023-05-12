package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderConfig
import typings.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typings.awsSdkCredentialProviderImds.distTypesTypesMod.InstanceMetadataCredentials
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-imds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "DEFAULT_MAX_RETRIES")
  @js.native
  val DEFAULT_MAX_RETRIES: /* 0 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "DEFAULT_TIMEOUT")
  @js.native
  val DEFAULT_TIMEOUT: /* 1000 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "ENV_CMDS_AUTH_TOKEN")
  @js.native
  val ENV_CMDS_AUTH_TOKEN: /* "AWS_CONTAINER_AUTHORIZATION_TOKEN" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "ENV_CMDS_FULL_URI")
  @js.native
  val ENV_CMDS_FULL_URI: /* "AWS_CONTAINER_CREDENTIALS_FULL_URI" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "ENV_CMDS_RELATIVE_URI")
  @js.native
  val ENV_CMDS_RELATIVE_URI: /* "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" */ String = js.native
  
  inline def fromContainerMetadata(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromContainerMetadata(init: RemoteProviderInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromInstanceMetadata(): Provider[InstanceMetadataCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")().asInstanceOf[Provider[InstanceMetadataCredentials]]
  inline def fromInstanceMetadata(init: RemoteProviderInit): Provider[InstanceMetadataCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[Provider[InstanceMetadataCredentials]]
  
  inline def getInstanceMetadataEndpoint(): js.Promise[Endpoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceMetadataEndpoint")().asInstanceOf[js.Promise[Endpoint]]
  
  inline def httpRequest(options: RequestOptions): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def providerConfigFromInit(param0: RemoteProviderInit): RemoteProviderConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("providerConfigFromInit")(param0.asInstanceOf[js.Any]).asInstanceOf[RemoteProviderConfig]
}
