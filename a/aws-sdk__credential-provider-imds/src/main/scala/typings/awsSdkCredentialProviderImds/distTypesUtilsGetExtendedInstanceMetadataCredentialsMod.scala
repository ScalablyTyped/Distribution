package typings.awsSdkCredentialProviderImds

import typings.awsSdkCredentialProviderImds.distTypesTypesMod.InstanceMetadataCredentials
import typings.awsSdkTypes.distTypesLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsGetExtendedInstanceMetadataCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/utils/getExtendedInstanceMetadataCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExtendedInstanceMetadataCredentials(credentials: InstanceMetadataCredentials, logger: Logger): InstanceMetadataCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtendedInstanceMetadataCredentials")(credentials.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[InstanceMetadataCredentials]
}
