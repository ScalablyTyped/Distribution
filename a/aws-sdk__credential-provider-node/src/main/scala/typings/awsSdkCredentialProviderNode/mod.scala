package typings.awsSdkCredentialProviderNode

import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkCredentialProviderIni.mod.FromIniInit
import typings.awsSdkCredentialProviderProcess.mod.FromProcessInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ENV_IMDS_DISABLED: /* "AWS_EC2_METADATA_DISABLED" */ String = js.native
  
  def defaultProvider(): CredentialProvider = js.native
  def defaultProvider(init: FromIniInit with RemoteProviderInit with FromProcessInit): CredentialProvider = js.native
}
