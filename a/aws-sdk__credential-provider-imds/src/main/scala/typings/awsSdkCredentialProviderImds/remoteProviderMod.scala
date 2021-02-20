package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.imdsCredentialsMod.ImdsCredentials
import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderConfig
import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkTypes.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteProviderMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider", "DEFAULT_MAX_RETRIES")
  @js.native
  val DEFAULT_MAX_RETRIES: /* 0 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider", "DEFAULT_TIMEOUT")
  @js.native
  val DEFAULT_TIMEOUT: /* 1000 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider", "fromImdsCredentials")
  @js.native
  def fromImdsCredentials(creds: ImdsCredentials): Credentials = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider", "isImdsCredentials")
  @js.native
  def isImdsCredentials(arg: js.Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider", "providerConfigFromInit")
  @js.native
  def providerConfigFromInit(hasMaxRetriesTimeout: RemoteProviderInit): RemoteProviderConfig = js.native
}
