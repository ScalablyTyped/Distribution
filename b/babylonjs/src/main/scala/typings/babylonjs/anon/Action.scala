package typings.babylonjs.anon

import typings.babylonjs.sceneComponentMod.ISceneComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action[T /* <: js.Function */] extends StObject {
  
  var action: T
  
  var component: ISceneComponent
  
  var index: Double
}
object Action {
  
  inline def apply[T /* <: js.Function */](action: T, component: ISceneComponent, index: Double): Action[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action[?], T /* <: js.Function */] (val x: Self & Action[T]) extends AnyVal {
    
    inline def setAction(value: T): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: ISceneComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
