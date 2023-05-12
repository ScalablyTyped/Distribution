package typings.awsSdkCredentialProviderIni

import typings.awsSdkCredentialProviderIni.distTypesFromIniMod.FromIniInit
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-ini", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromIni(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromIni(init: FromIniInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
}
