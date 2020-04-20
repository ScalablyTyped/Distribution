package typings.azdata.mod.queryeditor

import typings.azdata.mod.connection.ConnectionProfile
import typings.azdata.mod.window.DialogTab
import typings.std.Map
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDocument extends js.Object {
  var providerId: String
  var uri: String
  // connect the query document using the given connection profile
  def connect(connectionProfile: ConnectionProfile): Thenable[Unit]
  // tab content is build using the modelview UI builder APIs
  // probably should rename DialogTab class since it is useful outside dialogs
  def createQueryTab(tab: DialogTab): Unit
  // set the document's execution options
  def setExecutionOptions(options: Map[String, _]): Thenable[Unit]
}

object QueryDocument {
  @scala.inline
  def apply(
    connect: ConnectionProfile => Thenable[Unit],
    createQueryTab: DialogTab => Unit,
    providerId: String,
    setExecutionOptions: Map[String, _] => Thenable[Unit],
    uri: String
  ): QueryDocument = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), createQueryTab = js.Any.fromFunction1(createQueryTab), providerId = providerId.asInstanceOf[js.Any], setExecutionOptions = js.Any.fromFunction1(setExecutionOptions), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDocument]
  }
}

