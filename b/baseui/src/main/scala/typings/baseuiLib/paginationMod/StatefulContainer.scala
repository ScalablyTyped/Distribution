package typings
package baseuiLib.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/pagination", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends reactLib.reactMod.Component[StatefulContainerProps, State, js.Any] {
  @JSName("internalSetState")
  def internalSetState_change(changeType: baseuiLib.baseuiLibStrings.change, changes: State): scala.Unit = js.native
  def onPageChange(args: baseuiLib.Anon_NextPageNumber): scala.Unit = js.native
}

