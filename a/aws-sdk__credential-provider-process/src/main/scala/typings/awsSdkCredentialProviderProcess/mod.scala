package typings.awsSdkCredentialProviderProcess

import typings.awsSdkCredentialProviderProcess.fromProcessMod.FromProcessInit
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromProcess(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")().asInstanceOf[CredentialProvider]
  inline def fromProcess(init: FromProcessInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProcess")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
}
