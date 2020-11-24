package typings.azdata.mod.queryeditor

import typings.azdata.mod.ResultSetSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryEventListener extends js.Object {
  
  def onQueryEvent(`type`: QueryEventType, document: QueryDocument): Unit = js.native
  def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: String): Unit = js.native
  def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: ResultSetSummary): Unit = js.native
}
