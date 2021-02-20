package typings.awsSdkCredentialProviderNode

import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkCredentialProviderIni.mod.FromIniInit
import typings.awsSdkCredentialProviderProcess.mod.FromProcessInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-node", "ENV_IMDS_DISABLED")
  @js.native
  val ENV_IMDS_DISABLED: /* "AWS_EC2_METADATA_DISABLED" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-node", "defaultProvider")
  @js.native
  def defaultProvider(): CredentialProvider = js.native
  @JSImport("@aws-sdk/credential-provider-node", "defaultProvider")
  @js.native
  def defaultProvider(init: FromIniInit with RemoteProviderInit with FromProcessInit): CredentialProvider = js.native
}
