package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to run optimizations in order to reach a target frame rate
  * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
  */
@JSGlobal("BABYLON.SceneOptimizer")
@js.native
class SceneOptimizer protected () extends IDisposable {
  /**
    * Creates a new SceneOptimizer
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param autoGeneratePriorities defines if priorities must be generated and not read from SceneOptimization property (true by default)
    * @param improvementMode defines if the scene optimizer must run the maximum optimization while staying over a target frame instead of trying to reach the target framerate (false by default)
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, options: SceneOptimizerOptions) = this()
  def this(scene: Scene, options: SceneOptimizerOptions, autoGeneratePriorities: scala.Boolean) = this()
  def this(scene: Scene, options: SceneOptimizerOptions, autoGeneratePriorities: scala.Boolean, improvementMode: scala.Boolean) = this()
  var _checkCurrentState: js.Any = js.native
  var _currentFrameRate: js.Any = js.native
  var _currentPriorityLevel: js.Any = js.native
  var _improvementMode: js.Any = js.native
  var _isRunning: js.Any = js.native
  var _options: js.Any = js.native
  var _scene: js.Any = js.native
  var _sceneDisposeObserver: js.Any = js.native
  var _targetFrameRate: js.Any = js.native
  var _trackerDuration: js.Any = js.native
  /**
    * Gets the current frame rate checked by the SceneOptimizer
    */
  val currentFrameRate: scala.Double = js.native
  /**
    * Gets the current priority level (0 at start)
    */
  val currentPriorityLevel: scala.Double = js.native
  /**
    * Gets a boolean indicating if the optimizer is in improvement mode
    */
  val isInImprovementMode: scala.Boolean = js.native
  /**
    * Defines an observable called when the optimizer is not able to reach the target frame rate
    */
  var onFailureObservable: Observable[SceneOptimizer] = js.native
  /**
    * Defines an observable called when the optimizer enables an optimization
    */
  var onNewOptimizationAppliedObservable: Observable[SceneOptimization] = js.native
  /**
    * Defines an observable called when the optimizer reaches the target frame rate
    */
  var onSuccessObservable: Observable[SceneOptimizer] = js.native
  /**
    * Gets the list of active optimizations
    */
  val optimizations: js.Array[SceneOptimization] = js.native
  /**
    * Gets or sets the current target frame rate (60 by default)
    */
  /**
    * Gets or sets the current target frame rate (60 by default)
    */
  var targetFrameRate: scala.Double = js.native
  /**
    * Gets or sets the current interval between two checks (every 2000ms by default)
    */
  /**
    * Gets or sets the current interval between two checks (every 2000ms by default)
    */
  var trackerDuration: scala.Double = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Reset the optimizer to initial step (current priority level = 0)
    */
  def reset(): scala.Unit = js.native
  /**
    * Start the optimizer. By default it will try to reach a specific framerate
    * but if the optimizer is set with improvementMode === true then it will run all optimiatiation while frame rate is above the target frame rate
    */
  def start(): scala.Unit = js.native
  /**
    * Stops the current optimizer
    */
  def stop(): scala.Unit = js.native
}

/**
  * Class used to run optimizations in order to reach a target frame rate
  * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
  */
@JSGlobal("BABYLON.SceneOptimizer")
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

