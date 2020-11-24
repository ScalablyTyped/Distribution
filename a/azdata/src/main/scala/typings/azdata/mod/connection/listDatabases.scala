package typings.azdata.mod.connection

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "connection.listDatabases")
@js.native
object listDatabases extends js.Object {
  
  def apply(connectionId: String): Thenable[js.Array[String]] = js.native
}
