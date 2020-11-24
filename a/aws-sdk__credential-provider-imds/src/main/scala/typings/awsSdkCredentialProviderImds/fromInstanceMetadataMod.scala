package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-imds/dist/cjs/fromInstanceMetadata", JSImport.Namespace)
@js.native
object fromInstanceMetadataMod extends js.Object {
  
  def fromInstanceMetadata(): CredentialProvider = js.native
  def fromInstanceMetadata(init: RemoteProviderInit): CredentialProvider = js.native
}
