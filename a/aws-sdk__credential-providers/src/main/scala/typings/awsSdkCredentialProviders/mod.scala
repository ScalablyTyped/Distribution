package typings.awsSdkCredentialProviders

import typings.awsSdkCredentialProviderCognitoIdentity.distTypesFromCognitoIdentityMod.CognitoIdentityCredentialProvider
import typings.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderConfig
import typings.awsSdkCredentialProviders.distTypesFromCognitoIdentityMod.FromCognitoIdentityParameters
import typings.awsSdkCredentialProviders.distTypesFromCognitoIdentityPoolMod.FromCognitoIdentityPoolParameters
import typings.awsSdkCredentialProviders.distTypesFromContainerMetadataMod.RemoteProviderInit
import typings.awsSdkCredentialProviders.distTypesFromIniMod.FromIniInit
import typings.awsSdkCredentialProviders.distTypesFromNodeProviderChainMod.fromNodeProviderChainInit
import typings.awsSdkCredentialProviders.distTypesFromProcessMod.FromProcessInit
import typings.awsSdkCredentialProviders.distTypesFromSSOMod.FromSSOInit
import typings.awsSdkCredentialProviders.distTypesFromTemporaryCredentialsMod.FromTemporaryCredentialsOptions
import typings.awsSdkCredentialProviders.distTypesFromTokenFileMod.FromTokenFileInit
import typings.awsSdkCredentialProviders.distTypesFromWebTokenMod.FromWebTokenInit
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCognitoIdentity(options: FromCognitoIdentityParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentity")(options.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  inline def fromCognitoIdentityPool(options: FromCognitoIdentityPoolParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentityPool")(options.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  inline def fromContainerMetadata(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromContainerMetadata(init: RemoteProviderInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromEnv(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")().asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromIni(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromIni(init: FromIniInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromInstanceMetadata(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromInstanceMetadata(init: RemoteProviderConfig): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromNodeProviderChain(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeProviderChain")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromNodeProviderChain(init: fromNodeProviderChainInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeProviderChain")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromProcess(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromProcess(init: FromProcessInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromSSO(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromSSO(init: FromSSOInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromTemporaryCredentials(options: FromTemporaryCredentialsOptions): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTemporaryCredentials")(options.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromTokenFile(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromTokenFile(init: FromTokenFileInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromWebToken(init: FromWebTokenInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebToken")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
}
