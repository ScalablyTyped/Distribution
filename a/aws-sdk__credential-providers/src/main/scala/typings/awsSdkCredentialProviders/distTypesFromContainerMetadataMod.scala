package typings.awsSdkCredentialProviders

import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromContainerMetadataMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromContainerMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromContainerMetadata(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")().asInstanceOf[CredentialProvider]
  inline def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  type RemoteProviderInit = typings.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderInit
}
