package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneOptimizerOptions extends StObject {
  
  /**
    * Add a new custom optimization
    * @param onApply defines the callback called to apply the custom optimization (true if everything that can be done was applied)
    * @param onGetDescription defines the callback called to get the description attached with the optimization.
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    * @returns the current SceneOptimizerOptions
    */
  def addCustomOptimization(
    onApply: js.Function2[/* scene */ Scene, /* optimizer */ SceneOptimizer, Boolean],
    onGetDescription: js.Function0[String]
  ): SceneOptimizerOptions = js.native
  def addCustomOptimization(
    onApply: js.Function2[/* scene */ Scene, /* optimizer */ SceneOptimizer, Boolean],
    onGetDescription: js.Function0[String],
    priority: Double
  ): SceneOptimizerOptions = js.native
  
  /**
    * Add a new optimization
    * @param optimization defines the SceneOptimization to add to the list of active optimizations
    * @returns the current SceneOptimizerOptions
    */
  def addOptimization(optimization: SceneOptimization): SceneOptimizerOptions = js.native
  
  /**
    * Gets the list of optimizations to apply
    */
  var optimizations: js.Array[SceneOptimization] = js.native
  
  /**
    * Defines the target frame rate to reach (60 by default)
    */
  var targetFrameRate: Double = js.native
  
  /**
    * Defines the interval between two checks (2000ms by default)
    */
  var trackerDuration: Double = js.native
}
