package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromInstanceMetadataMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/fromInstanceMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromInstanceMetadata(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")().asInstanceOf[CredentialProvider]
  inline def fromInstanceMetadata(init: RemoteProviderInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
}
