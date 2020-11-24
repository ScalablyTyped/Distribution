package typings.blueprintjsCore.panelStackMod

import typings.blueprintjsCore.blueprintjsCoreStrings.pop
import typings.blueprintjsCore.blueprintjsCoreStrings.push
import typings.blueprintjsCore.panelPropsMod.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelStackState extends js.Object {
  
  /** Whether the stack is currently animating the push or pop of a panel. */
  var direction: push | pop = js.native
  
  /** The current stack of panels. The first panel in the stack will be displayed. */
  var stack: js.Array[IPanel[js.Object]] = js.native
}
object IPanelStackState {
  
  @scala.inline
  def apply(direction: push | pop, stack: js.Array[IPanel[js.Object]]): IPanelStackState = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelStackState]
  }
  
  @scala.inline
  implicit class IPanelStackStateOps[Self <: IPanelStackState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirection(value: push | pop): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackVarargs(value: IPanel[js.Object]*): Self = this.set("stack", js.Array(value :_*))
    
    @scala.inline
    def setStack(value: js.Array[IPanel[js.Object]]): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
}
