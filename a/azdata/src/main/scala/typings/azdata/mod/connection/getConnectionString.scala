package typings.azdata.mod.connection

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "connection.getConnectionString")
@js.native
object getConnectionString extends js.Object {
  def apply(connectionId: String, includePassword: Boolean): Thenable[String] = js.native
}

