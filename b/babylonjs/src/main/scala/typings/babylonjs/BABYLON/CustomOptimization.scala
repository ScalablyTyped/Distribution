package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomOptimization
  extends StObject
     with SceneOptimization {
  
  /**
    * Callback called to apply the custom optimization.
    */
  def onApply(scene: Scene, optimizer: SceneOptimizer): Boolean
  
  /**
    * Callback called to get custom description
    */
  def onGetDescription(): String
}
object CustomOptimization {
  
  inline def apply(
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: () => String,
    onApply: (Scene, SceneOptimizer) => Boolean,
    onGetDescription: () => String,
    priority: Double
  ): CustomOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), onApply = js.Any.fromFunction2(onApply), onGetDescription = js.Any.fromFunction0(onGetDescription), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOptimization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomOptimization] (val x: Self) extends AnyVal {
    
    inline def setOnApply(value: (Scene, SceneOptimizer) => Boolean): Self = StObject.set(x, "onApply", js.Any.fromFunction2(value))
    
    inline def setOnGetDescription(value: () => String): Self = StObject.set(x, "onGetDescription", js.Any.fromFunction0(value))
  }
}
