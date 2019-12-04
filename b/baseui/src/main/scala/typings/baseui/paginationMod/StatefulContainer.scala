package typings.baseui.paginationMod

import typings.baseui.Anon_NextPageNumber
import typings.baseui.baseuiStrings.change_
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/pagination", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulContainerProps, State, js.Any] {
  @JSName("internalSetState")
  def internalSetState_change(changeType: change_, changes: State): Unit = js.native
  def onPageChange(args: Anon_NextPageNumber): Unit = js.native
}

