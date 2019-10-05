package typings.datatablesDotNetDashButtons.DataTables

import typings.datatablesDotNet.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtButtonsCollectionSettings extends js.Object {
  @JSName("action")
  var action_Original: FunctionButtonAction = js.native
  var autoClose: Boolean = js.native
  var background: Boolean = js.native
  var backgroundClassName: String = js.native
  var className: String = js.native
  var collectionLayout: String = js.native
  var fade: Double = js.native
  @JSName("text")
  var text_Original: FunctionExtButtonsCollectionText = js.native
  def action(e: js.Any, dt: Api, node: JQuery, config: ButtonSettings): Unit = js.native
  def text(a: js.Any): String = js.native
}

