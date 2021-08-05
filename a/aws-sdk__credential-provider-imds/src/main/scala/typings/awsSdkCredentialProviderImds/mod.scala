package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderConfig
import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
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
  
  inline def fromContainerMetadata(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")().asInstanceOf[CredentialProvider]
  inline def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromInstanceMetadata(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")().asInstanceOf[CredentialProvider]
  inline def fromInstanceMetadata(init: RemoteProviderInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def providerConfigFromInit(hasMaxRetriesTimeout: RemoteProviderInit): RemoteProviderConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("providerConfigFromInit")(hasMaxRetriesTimeout.asInstanceOf[js.Any]).asInstanceOf[RemoteProviderConfig]
}
