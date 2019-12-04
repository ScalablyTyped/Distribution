package typings.baseui.buttonDashGroupMod

import typings.react.reactMod.Component
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
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

