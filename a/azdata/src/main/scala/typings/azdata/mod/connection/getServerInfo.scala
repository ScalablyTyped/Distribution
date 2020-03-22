package typings.azdata.mod.connection

import typings.azdata.mod.ServerInfo
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "connection.getServerInfo")
@js.native
object getServerInfo extends js.Object {
  def apply(connectionId: String): Thenable[ServerInfo] = js.native
}

