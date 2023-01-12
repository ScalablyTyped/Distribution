package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneOptimization extends StObject {
  
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  @JSName("apply")
  def apply(scene: Scene, optimizer: SceneOptimizer): Boolean
  
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  def getDescription(): String
  
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  var priority: Double
}
object SceneOptimization {
  
  inline def apply(apply: (Scene, SceneOptimizer) => Boolean, getDescription: () => String, priority: Double): SceneOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = js.Any.fromFunction0(getDescription), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneOptimization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneOptimization] (val x: Self) extends AnyVal {
    
    inline def setApply(value: (Scene, SceneOptimizer) => Boolean): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    
    inline def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
