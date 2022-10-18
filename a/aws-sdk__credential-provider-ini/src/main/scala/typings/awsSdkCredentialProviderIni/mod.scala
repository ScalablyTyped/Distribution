package typings.awsSdkCredentialProviderIni

import typings.awsSdkCredentialProviderIni.distTypesFromIniMod.FromIniInit
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-ini", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromIni(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")().asInstanceOf[CredentialProvider]
  inline def fromIni(init: FromIniInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
}
