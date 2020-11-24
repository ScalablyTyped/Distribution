package typings.baseui.layerMod

import typings.baseui.anon.IsMounted
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/layer", "TetherBehavior")
@js.native
class TetherBehavior ()
  extends Component[TetherProps, TetherState, js.Any] {
  
  def destroyPopover(): Unit = js.native
  
  def initializePopper(): Unit = js.native
  
  def onPopperUpdate(data: PopperDataObject): Unit = js.native
  
  @JSName("state")
  var state_TetherBehavior: IsMounted = js.native
}
