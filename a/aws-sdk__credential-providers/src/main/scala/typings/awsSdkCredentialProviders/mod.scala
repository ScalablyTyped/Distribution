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
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCognitoIdentity(options: FromCognitoIdentityParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentity")(options.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  inline def fromCognitoIdentityPool(options: FromCognitoIdentityPoolParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentityPool")(options.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  inline def fromContainerMetadata(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")().asInstanceOf[CredentialProvider]
  inline def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromEnv(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")().asInstanceOf[CredentialProvider]
  
  inline def fromIni(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")().asInstanceOf[CredentialProvider]
  inline def fromIni(init: FromIniInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromInstanceMetadata(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")().asInstanceOf[CredentialProvider]
  inline def fromInstanceMetadata(init: RemoteProviderConfig): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromNodeProviderChain(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeProviderChain")().asInstanceOf[CredentialProvider]
  inline def fromNodeProviderChain(init: fromNodeProviderChainInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeProviderChain")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromProcess(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")().asInstanceOf[CredentialProvider]
  inline def fromProcess(init: FromProcessInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromSSO(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")().asInstanceOf[CredentialProvider]
  inline def fromSSO(init: FromSSOInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromTemporaryCredentials(options: FromTemporaryCredentialsOptions): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTemporaryCredentials")(options.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromTokenFile(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")().asInstanceOf[CredentialProvider]
  inline def fromTokenFile(init: FromTokenFileInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromWebToken(init: FromWebTokenInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebToken")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
}
