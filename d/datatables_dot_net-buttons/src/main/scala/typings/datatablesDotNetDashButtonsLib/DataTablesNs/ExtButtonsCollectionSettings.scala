package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtButtonsCollectionSettings extends js.Object {
  @JSName("action")
  var action_Original: FunctionButtonAction = js.native
  var autoClose: scala.Boolean = js.native
  var background: scala.Boolean = js.native
  var backgroundClassName: java.lang.String = js.native
  var className: java.lang.String = js.native
  var collectionLayout: java.lang.String = js.native
  var fade: scala.Double = js.native
  @JSName("text")
  var text_Original: FunctionExtButtonsCollectionText = js.native
  def action(e: js.Any, dt: Api, node: datatablesDotNetLib.JQuery, config: ButtonSettings): scala.Unit = js.native
  def text(a: js.Any): java.lang.String = js.native
}

