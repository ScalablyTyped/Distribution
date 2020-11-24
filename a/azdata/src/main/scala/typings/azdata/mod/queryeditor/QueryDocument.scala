package typings.azdata.mod.queryeditor

import typings.azdata.mod.connection.ConnectionProfile
import typings.azdata.mod.window.DialogTab
import typings.std.Map
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDocument extends js.Object {
  
  // connect the query document using the given connection profile
  def connect(connectionProfile: ConnectionProfile): Thenable[Unit] = js.native
  
  // tab content is build using the modelview UI builder APIs
  // probably should rename DialogTab class since it is useful outside dialogs
  def createQueryTab(tab: DialogTab): Unit = js.native
  
  var providerId: String = js.native
  
  // set the document's execution options
  def setExecutionOptions(options: Map[String, _]): Thenable[Unit] = js.native
  
  var uri: String = js.native
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
  
  @scala.inline
  implicit class QueryDocumentOps[Self <: QueryDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnect(value: ConnectionProfile => Thenable[Unit]): Self = this.set("connect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateQueryTab(value: DialogTab => Unit): Self = this.set("createQueryTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExecutionOptions(value: Map[String, _] => Thenable[Unit]): Self = this.set("setExecutionOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
}
