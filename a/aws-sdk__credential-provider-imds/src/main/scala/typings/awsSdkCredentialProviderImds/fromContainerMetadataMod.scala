package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-imds/dist/cjs/fromContainerMetadata", JSImport.Namespace)
@js.native
object fromContainerMetadataMod extends js.Object {
  
  val ENV_CMDS_AUTH_TOKEN: /* "AWS_CONTAINER_AUTHORIZATION_TOKEN" */ String = js.native
  
  val ENV_CMDS_FULL_URI: /* "AWS_CONTAINER_CREDENTIALS_FULL_URI" */ String = js.native
  
  val ENV_CMDS_RELATIVE_URI: /* "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" */ String = js.native
  
  def fromContainerMetadata(): CredentialProvider = js.native
  def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = js.native
}
