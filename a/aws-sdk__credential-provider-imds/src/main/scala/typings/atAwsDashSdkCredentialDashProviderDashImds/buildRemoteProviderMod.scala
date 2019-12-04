package typings.atAwsDashSdkCredentialDashProviderDashImds

import typings.atAwsDashSdkCredentialDashProviderDashImds.atAwsDashSdkCredentialDashProviderDashImdsNumbers.`0`
import typings.atAwsDashSdkCredentialDashProviderDashImds.atAwsDashSdkCredentialDashProviderDashImdsNumbers.`1000`
import typings.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderImdsCredentialsMod.ImdsCredentials
import typings.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderRemoteProviderInitMod.RemoteProviderConfig
import typings.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typings.atAwsDashSdkTypes.buildCredentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-imds/build/remoteProvider", JSImport.Namespace)
@js.native
object buildRemoteProviderMod extends js.Object {
  val DEFAULT_MAX_RETRIES: `0` = js.native
  val DEFAULT_TIMEOUT: `1000` = js.native
  def fromImdsCredentials(creds: ImdsCredentials): Credentials = js.native
  def isImdsCredentials(arg: js.Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/build/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = js.native
  def providerConfigFromInit(init: RemoteProviderInit): RemoteProviderConfig = js.native
}

