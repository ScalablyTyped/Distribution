package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.distTypesRemoteProviderImdsCredentialsMod.ImdsCredentials
import typings.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderConfig
import typings.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRemoteProviderMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/remoteProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/remoteProvider", "DEFAULT_MAX_RETRIES")
  @js.native
  val DEFAULT_MAX_RETRIES: /* 0 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/remoteProvider", "DEFAULT_TIMEOUT")
  @js.native
  val DEFAULT_TIMEOUT: /* 1000 */ Double = js.native
  
  inline def fromImdsCredentials(creds: ImdsCredentials): AwsCredentialIdentity = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImdsCredentials")(creds.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentity]
  
  inline def isImdsCredentials(arg: Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist-types/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImdsCredentials")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist-types/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean]
  
  inline def providerConfigFromInit(param0: RemoteProviderInit): RemoteProviderConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("providerConfigFromInit")(param0.asInstanceOf[js.Any]).asInstanceOf[RemoteProviderConfig]
}
