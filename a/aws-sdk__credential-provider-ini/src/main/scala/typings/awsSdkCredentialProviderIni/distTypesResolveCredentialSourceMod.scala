package typings.awsSdkCredentialProviderIni

import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveCredentialSourceMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/resolveCredentialSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveCredentialSource(credentialSource: String, profileName: String): AwsCredentialIdentityProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveCredentialSource")(credentialSource.asInstanceOf[js.Any], profileName.asInstanceOf[js.Any])).asInstanceOf[AwsCredentialIdentityProvider]
}
