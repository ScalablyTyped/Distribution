package typings.baseui.popoverMod

import typings.baseui.baseuiStrings.close
import typings.baseui.baseuiStrings.open
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/popover", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulPopoverContainerProps, State, js.Any] {
  
  def close(): Unit = js.native
  
  @JSName("internalSetState")
  def internalSetState_close(`type`: close, changes: State): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_open(`type`: open, changes: State): Unit = js.native
  
  def onBlur(): Unit = js.native
  
  def onClick(): Unit = js.native
  
  def onClickOutside(): Unit = js.native
  
  def onContentClose(): Unit = js.native
  
  def onEsc(): Unit = js.native
  
  def onFocus(): Unit = js.native
  
  def onMouseEnter(): Unit = js.native
  
  def onMouseLeave(): Unit = js.native
  
  def open(): Unit = js.native
}
