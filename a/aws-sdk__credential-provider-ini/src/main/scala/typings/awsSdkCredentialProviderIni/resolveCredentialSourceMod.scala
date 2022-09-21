package typings.awsSdkCredentialProviderIni

import typings.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveCredentialSourceMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/resolveCredentialSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveCredentialSource(credentialSource: String, profileName: String): CredentialProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveCredentialSource")(credentialSource.asInstanceOf[js.Any], profileName.asInstanceOf[js.Any])).asInstanceOf[CredentialProvider]
}
