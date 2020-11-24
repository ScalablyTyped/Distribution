package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderConfig
import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-imds", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DEFAULT_MAX_RETRIES: /* 0 */ Double = js.native
  
  val DEFAULT_TIMEOUT: /* 1000 */ Double = js.native
  
  val ENV_CMDS_AUTH_TOKEN: /* "AWS_CONTAINER_AUTHORIZATION_TOKEN" */ String = js.native
  
  val ENV_CMDS_FULL_URI: /* "AWS_CONTAINER_CREDENTIALS_FULL_URI" */ String = js.native
  
  val ENV_CMDS_RELATIVE_URI: /* "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" */ String = js.native
  
  def fromContainerMetadata(): CredentialProvider = js.native
  def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = js.native
  
  def fromInstanceMetadata(): CredentialProvider = js.native
  def fromInstanceMetadata(init: RemoteProviderInit): CredentialProvider = js.native
  
  def providerConfigFromInit(hasMaxRetriesTimeout: RemoteProviderInit): RemoteProviderConfig = js.native
}
