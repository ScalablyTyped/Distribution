package typings.babylonjs.anon

import typings.babylonjs.BABYLON.ISceneComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component[T /* <: js.Function */] extends js.Object {
  
  var action: T = js.native
  
  var component: ISceneComponent = js.native
  
  var index: Double = js.native
}
object Component {
  
  @scala.inline
  def apply[T /* <: js.Function */](action: T, component: ISceneComponent, index: Double): Component[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[T]]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component[_], T /* <: js.Function */] (val x: Self with Component[T]) extends AnyVal {
    
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
    def setAction(value: T): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ISceneComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
