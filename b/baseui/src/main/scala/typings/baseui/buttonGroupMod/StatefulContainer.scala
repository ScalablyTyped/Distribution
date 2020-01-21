package typings.baseui.buttonGroupMod

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/button-group", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulButtonGroupProps, State, js.Any] {
  def changeState(nextState: State): Unit = js.native
  def onClick(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], index: Double): Unit = js.native
}

