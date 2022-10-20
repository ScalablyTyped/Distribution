package typings.awsSdkCredentialProviders

import typings.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderConfig
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromInstanceMetadataMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromInstanceMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromInstanceMetadata(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")().asInstanceOf[CredentialProvider]
  inline def fromInstanceMetadata(init: RemoteProviderConfig): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
}
