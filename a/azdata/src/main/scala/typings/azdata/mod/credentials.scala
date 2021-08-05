package typings.azdata.mod

import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentials {
  
  @JSImport("azdata", "credentials")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProvider(namespaceId: String): Thenable[CredentialProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProvider")(namespaceId.asInstanceOf[js.Any]).asInstanceOf[Thenable[CredentialProvider]]
  
  inline def registerProvider(provider: CredentialProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
}
