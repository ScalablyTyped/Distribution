package typings.atAwsDashSdkCredentialDashProviderDashNode

import typings.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typings.atAwsDashSdkCredentialDashProviderDashIni.atAwsDashSdkCredentialDashProviderDashIniMod.FromIniInit
import typings.atAwsDashSdkCredentialDashProviderDashNode.atAwsDashSdkCredentialDashProviderDashNodeStrings.AWS_EC2_METADATA_DISABLED
import typings.atAwsDashSdkTypes.buildCredentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-node", JSImport.Namespace)
@js.native
object atAwsDashSdkCredentialDashProviderDashNodeMod extends js.Object {
  val ENV_IMDS_DISABLED: AWS_EC2_METADATA_DISABLED = js.native
  def defaultProvider(): CredentialProvider = js.native
  def defaultProvider(init: FromIniInit with RemoteProviderInit): CredentialProvider = js.native
}

