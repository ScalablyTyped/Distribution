package typings.azdata.mod

import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "credentials")
@js.native
object credentials extends js.Object {
  
  def getProvider(namespaceId: String): Thenable[CredentialProvider] = js.native
  
  def registerProvider(provider: CredentialProvider): Disposable = js.native
}
