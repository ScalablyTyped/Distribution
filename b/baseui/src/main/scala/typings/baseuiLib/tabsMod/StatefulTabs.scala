package typings
package baseuiLib.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/tabs", "StatefulTabs")
@js.native
class StatefulTabs ()
  extends reactLib.reactMod.Component[StatefulTabsProps, State, js.Any] {
  def getInitialKey(): js.Any = js.native
  @JSName("internalSetState")
  def internalSetState_change(`type`: baseuiLib.baseuiLibStrings.change, changes: State): scala.Unit = js.native
  def onTabChange(newState: State): scala.Unit = js.native
}

