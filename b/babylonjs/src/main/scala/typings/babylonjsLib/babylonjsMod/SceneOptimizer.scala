package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to run optimizations in order to reach a target frame rate
  * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
  */
@JSImport("babylonjs", "SceneOptimizer")
@js.native
class SceneOptimizer protected ()
  extends babylonjsLib.BABYLONNs.SceneOptimizer {
  /**
    * Creates a new SceneOptimizer
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param autoGeneratePriorities defines if priorities must be generated and not read from SceneOptimization property (true by default)
    * @param improvementMode defines if the scene optimizer must run the maximum optimization while staying over a target frame instead of trying to reach the target framerate (false by default)
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(scene: babylonjsLib.BABYLONNs.Scene, options: babylonjsLib.BABYLONNs.SceneOptimizerOptions) = this()
  def this(scene: babylonjsLib.BABYLONNs.Scene, options: babylonjsLib.BABYLONNs.SceneOptimizerOptions, autoGeneratePriorities: scala.Boolean) = this()
  def this(scene: babylonjsLib.BABYLONNs.Scene, options: babylonjsLib.BABYLONNs.SceneOptimizerOptions, autoGeneratePriorities: scala.Boolean, improvementMode: scala.Boolean) = this()
}

/* static members */
@JSImport("babylonjs", "SceneOptimizer")
@js.native
object SceneOptimizer extends js.Object {
  /**
    * Helper function to create a SceneOptimizer with one single line of code
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param onSuccess defines a callback to call on success
    * @param onFailure defines a callback to call on failure
    * @returns the new SceneOptimizer object
    */
  def OptimizeAsync(scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.SceneOptimizer = js.native
  def OptimizeAsync(scene: babylonjsLib.BABYLONNs.Scene, options: babylonjsLib.BABYLONNs.SceneOptimizerOptions): babylonjsLib.BABYLONNs.SceneOptimizer = js.native
  def OptimizeAsync(
    scene: babylonjsLib.BABYLONNs.Scene,
    options: babylonjsLib.BABYLONNs.SceneOptimizerOptions,
    onSuccess: js.Function0[scala.Unit]
  ): babylonjsLib.BABYLONNs.SceneOptimizer = js.native
  def OptimizeAsync(
    scene: babylonjsLib.BABYLONNs.Scene,
    options: babylonjsLib.BABYLONNs.SceneOptimizerOptions,
    onSuccess: js.Function0[scala.Unit],
    onFailure: js.Function0[scala.Unit]
  ): babylonjsLib.BABYLONNs.SceneOptimizer = js.native
}

