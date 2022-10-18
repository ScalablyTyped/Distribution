package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromContainerMetadataMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/fromContainerMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/fromContainerMetadata", "ENV_CMDS_AUTH_TOKEN")
  @js.native
  val ENV_CMDS_AUTH_TOKEN: /* "AWS_CONTAINER_AUTHORIZATION_TOKEN" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/fromContainerMetadata", "ENV_CMDS_FULL_URI")
  @js.native
  val ENV_CMDS_FULL_URI: /* "AWS_CONTAINER_CREDENTIALS_FULL_URI" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/fromContainerMetadata", "ENV_CMDS_RELATIVE_URI")
  @js.native
  val ENV_CMDS_RELATIVE_URI: /* "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" */ String = js.native
  
  inline def fromContainerMetadata(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")().asInstanceOf[CredentialProvider]
  inline def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
}
