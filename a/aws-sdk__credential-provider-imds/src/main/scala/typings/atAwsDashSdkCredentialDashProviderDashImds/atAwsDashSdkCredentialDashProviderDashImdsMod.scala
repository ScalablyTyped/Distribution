package typings.atAwsDashSdkCredentialDashProviderDashImds

import typings.atAwsDashSdkCredentialDashProviderDashImds.atAwsDashSdkCredentialDashProviderDashImdsNumbers.`0`
import typings.atAwsDashSdkCredentialDashProviderDashImds.atAwsDashSdkCredentialDashProviderDashImdsNumbers.`1000`
import typings.atAwsDashSdkCredentialDashProviderDashImds.atAwsDashSdkCredentialDashProviderDashImdsStrings.AWS_CONTAINER_AUTHORIZATION_TOKEN
import typings.atAwsDashSdkCredentialDashProviderDashImds.atAwsDashSdkCredentialDashProviderDashImdsStrings.AWS_CONTAINER_CREDENTIALS_FULL_URI
import typings.atAwsDashSdkCredentialDashProviderDashImds.atAwsDashSdkCredentialDashProviderDashImdsStrings.AWS_CONTAINER_CREDENTIALS_RELATIVE_URI
import typings.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderRemoteProviderInitMod.RemoteProviderConfig
import typings.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typings.atAwsDashSdkTypes.buildCredentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-imds", JSImport.Namespace)
@js.native
object atAwsDashSdkCredentialDashProviderDashImdsMod extends js.Object {
  val DEFAULT_MAX_RETRIES: `0` = js.native
  val DEFAULT_TIMEOUT: `1000` = js.native
  val ENV_CMDS_AUTH_TOKEN: AWS_CONTAINER_AUTHORIZATION_TOKEN = js.native
  val ENV_CMDS_FULL_URI: AWS_CONTAINER_CREDENTIALS_FULL_URI = js.native
  val ENV_CMDS_RELATIVE_URI: AWS_CONTAINER_CREDENTIALS_RELATIVE_URI = js.native
  def fromContainerMetadata(): CredentialProvider = js.native
  def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = js.native
  def fromInstanceMetadata(): CredentialProvider = js.native
  def fromInstanceMetadata(init: RemoteProviderInit): CredentialProvider = js.native
  def providerConfigFromInit(init: RemoteProviderInit): RemoteProviderConfig = js.native
}

