package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakpointsComponents extends js.Object {
  
  var breakpoints: js.UndefOr[js.Object] = js.native
  
  var components: js.UndefOr[js.Object] = js.native
}
object BreakpointsComponents {
  
  @scala.inline
  def apply(): BreakpointsComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakpointsComponents]
  }
  
  @scala.inline
  implicit class BreakpointsComponentsOps[Self <: BreakpointsComponents] (val x: Self) extends AnyVal {
    
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
    def setBreakpoints(value: js.Object): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    
    @scala.inline
    def setComponents(value: js.Object): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
  }
}
