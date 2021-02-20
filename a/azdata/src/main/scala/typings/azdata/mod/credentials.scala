package typings.azdata.mod

import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentials {
  
  @JSImport("azdata", "credentials.getProvider")
  @js.native
  def getProvider(namespaceId: String): Thenable[CredentialProvider] = js.native
  
  @JSImport("azdata", "credentials.registerProvider")
  @js.native
  def registerProvider(provider: CredentialProvider): Disposable = js.native
}
