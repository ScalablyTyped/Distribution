package typings.deku.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends js.Object {
  
  var onCreate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.native
  
  var onRemove: js.UndefOr[js.Function1[/* model */ Model, _]] = js.native
  
  var onUpdate: js.UndefOr[js.Function1[/* model */ Model, _]] = js.native
  
  def render(model: Model): VirtualElement = js.native
}
object Component {
  
  @scala.inline
  def apply(render: Model => VirtualElement): Component = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    
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
    def setRender(value: Model => VirtualElement): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCreate(value: /* model */ Model => _): Self = this.set("onCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCreate: Self = this.set("onCreate", js.undefined)
    
    @scala.inline
    def setOnRemove(value: /* model */ Model => _): Self = this.set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* model */ Model => _): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
}
