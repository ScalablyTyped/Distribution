package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/popover", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends reactLib.reactMod.Component[StatefulPopoverContainerProps, State, js.Any] {
  def close(): scala.Unit = js.native
  @JSName("internalSetState")
  def internalSetState_close(`type`: baseuiLib.baseuiLibStrings.close, changes: State): scala.Unit = js.native
  @JSName("internalSetState")
  def internalSetState_open(`type`: baseuiLib.baseuiLibStrings.open, changes: State): scala.Unit = js.native
  def onBlur(): scala.Unit = js.native
  def onClick(): scala.Unit = js.native
  def onClickOutside(): scala.Unit = js.native
  def onContentClose(): scala.Unit = js.native
  def onEsc(): scala.Unit = js.native
  def onFocus(): scala.Unit = js.native
  def onMouseEnter(): scala.Unit = js.native
  def onMouseLeave(): scala.Unit = js.native
  def open(): scala.Unit = js.native
}

