package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.imdsCredentialsMod.ImdsCredentials
import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderConfig
import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkTypes.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider", JSImport.Namespace)
@js.native
object remoteProviderMod extends js.Object {
  
  val DEFAULT_MAX_RETRIES: /* 0 */ Double = js.native
  
  val DEFAULT_TIMEOUT: /* 1000 */ Double = js.native
  
  def fromImdsCredentials(creds: ImdsCredentials): Credentials = js.native
  
  def isImdsCredentials(arg: js.Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = js.native
  
  def providerConfigFromInit(hasMaxRetriesTimeout: RemoteProviderInit): RemoteProviderConfig = js.native
}
