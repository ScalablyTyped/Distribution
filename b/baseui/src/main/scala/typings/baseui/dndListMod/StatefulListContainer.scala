package typings.baseui.dndListMod

import typings.baseui.anon.OldIndex
import typings.baseui.baseuiStrings.change_
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/dnd-list", "StatefulListContainer")
@js.native
class StatefulListContainer ()
  extends Component[StatefulComponentContainerProps, State, js.Any] {
  @JSName("internalSetState")
  def internalSetState_change(`type`: change_, changes: State): Unit = js.native
  def onChange(hasOldIndexNewIndex: OldIndex): Unit = js.native
}

