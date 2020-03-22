package typings.azdata.mod.queryeditor

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "queryeditor.connect")
@js.native
object connect extends js.Object {
  def apply(fileUri: String, connectionId: String): Thenable[Unit] = js.native
}

