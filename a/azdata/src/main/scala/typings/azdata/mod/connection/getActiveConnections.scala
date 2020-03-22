package typings.azdata.mod.connection

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "connection.getActiveConnections")
@js.native
object getActiveConnections extends js.Object {
  def apply(): Thenable[js.Array[Connection]] = js.native
}

