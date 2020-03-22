package typings.azdata.mod.connection

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "connection.getConnections")
@js.native
object getConnections extends js.Object {
  def apply(): Thenable[js.Array[ConnectionProfile]] = js.native
  def apply(activeConnectionsOnly: Boolean): Thenable[js.Array[ConnectionProfile]] = js.native
}

