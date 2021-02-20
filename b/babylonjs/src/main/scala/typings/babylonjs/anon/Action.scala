package typings.babylonjs.anon

import typings.babylonjs.sceneComponentMod.ISceneComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action[T /* <: js.Function */] extends StObject {
  
  var action: T = js.native
  
  var component: ISceneComponent = js.native
  
  var index: Double = js.native
}
object Action {
  
  @scala.inline
  def apply[T /* <: js.Function */](action: T, component: ISceneComponent, index: Double): Action[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action[_], T /* <: js.Function */] (val x: Self with Action[T]) extends AnyVal {
    
    @scala.inline
    def setAction(value: T): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ISceneComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
