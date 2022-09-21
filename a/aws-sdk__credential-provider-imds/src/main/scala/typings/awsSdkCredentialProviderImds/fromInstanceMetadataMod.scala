package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typings.awsSdkCredentialProviderImds.typesMod.InstanceMetadataCredentials
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromInstanceMetadataMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/fromInstanceMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromInstanceMetadata(): Provider[InstanceMetadataCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")().asInstanceOf[Provider[InstanceMetadataCredentials]]
  inline def fromInstanceMetadata(init: RemoteProviderInit): Provider[InstanceMetadataCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[Provider[InstanceMetadataCredentials]]
}
