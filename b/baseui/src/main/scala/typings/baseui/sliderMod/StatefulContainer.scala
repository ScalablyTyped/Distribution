package typings.baseui.sliderMod

import typings.baseui.baseuiStrings.change_
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/slider", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulContainerProps, State, js.Any] {
  var onFinalChange: js.UndefOr[js.Function1[/* params */ State, _]] = js.native
  @JSName("internalSetState")
  def internalSetState_change(`type`: change_, hasValue: State): Unit = js.native
  def onChange(params: State): js.Any = js.native
}

