package typings.baseui.datepickerMod

import typings.baseui.AnonDate
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.mouseLeave
import typings.baseui.baseuiStrings.mouseOver
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveLeft
import typings.baseui.baseuiStrings.moveRight
import typings.baseui.baseuiStrings.moveUp
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulContainerProps[CalendarProps | DatepickerProps], ContainerState, js.Any] {
  @JSName("internalSetState")
  def internalSetState_change(`type`: change_, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_mouseLeave(`type`: mouseLeave, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_mouseOver(`type`: mouseOver, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveDown(`type`: moveDown, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveLeft(`type`: moveLeft, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveRight(`type`: moveRight, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveUp(`type`: moveUp, changes: ContainerState): Unit = js.native
  def onChange(data: AnonDate): Unit = js.native
}

