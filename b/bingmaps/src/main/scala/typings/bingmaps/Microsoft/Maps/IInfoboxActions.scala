package typings.bingmaps.Microsoft.Maps

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInfoboxActions extends js.Object {
  
  /** The function to call when the label is clicked.  */
  def eventHandler(): Unit = js.native
  def eventHandler(eventArg: MouseEvent): Unit = js.native
  
  /** The text to display for the action. */
  var label: String = js.native
}
