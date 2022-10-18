package typings.awsSdkCredentialProviderProcess

import typings.awsSdkSharedIniFileLoader.distTypesParseKnownFilesMod.SourceProfileInit
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromProcessMod {
  
  @JSImport("@aws-sdk/credential-provider-process/dist-types/fromProcess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromProcess(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")().asInstanceOf[CredentialProvider]
  inline def fromProcess(init: FromProcessInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  type FromProcessInit = SourceProfileInit
}
