package typings.bingmaps.MicrosoftNs.MapsNs

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInfoboxActions extends js.Object {
  /** The text to display for the action. */
  var label: String = js.native
  /** The function to call when the label is clicked.  */
  def eventHandler(): Unit = js.native
  def eventHandler(eventArg: MouseEvent): Unit = js.native
}

