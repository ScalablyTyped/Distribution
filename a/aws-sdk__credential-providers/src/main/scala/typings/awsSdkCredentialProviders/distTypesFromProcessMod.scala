package typings.awsSdkCredentialProviders

import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromProcessMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/fromProcess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromProcess(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromProcess(init: FromProcessInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  type FromProcessInit = typings.awsSdkCredentialProviderProcess.distTypesFromProcessMod.FromProcessInit
}
