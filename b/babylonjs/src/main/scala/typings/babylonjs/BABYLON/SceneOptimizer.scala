package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(scene: Scene, options: SceneOptimizerOptions, autoGeneratePriorities: Boolean) = this()
  def this(
    scene: Scene,
    options: SceneOptimizerOptions,
    autoGeneratePriorities: Boolean,
    improvementMode: Boolean
  ) = this()
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
    * Gets the current frame rate checked by the SceneOptimizer
    */
  def currentFrameRate(): Double = js.native
  /**
    * Gets the current priority level (0 at start)
    */
  def currentPriorityLevel(): Double = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Gets a boolean indicating if the optimizer is in improvement mode
    */
  def isInImprovementMode(): Boolean = js.native
  /**
    * Gets the list of active optimizations
    */
  def optimizations(): js.Array[SceneOptimization] = js.native
  /**
    * Reset the optimizer to initial step (current priority level = 0)
    */
  def reset(): Unit = js.native
  /**
    * Start the optimizer. By default it will try to reach a specific framerate
    * but if the optimizer is set with improvementMode === true then it will run all optimiatiation while frame rate is above the target frame rate
    */
  def start(): Unit = js.native
  /**
    * Stops the current optimizer
    */
  def stop(): Unit = js.native
  /**
    * Gets or sets the current target frame rate (60 by default)
    */
  def targetFrameRate(): Double = js.native
  /**
    * Gets or sets the current target frame rate (60 by default)
    */
  def targetFrameRate(value: Double): js.Any = js.native
  /**
    * Gets or sets the current interval between two checks (every 2000ms by default)
    */
  def trackerDuration(): Double = js.native
  /**
    * Gets or sets the current interval between two checks (every 2000ms by default)
    */
  def trackerDuration(value: Double): js.Any = js.native
}

/* static members */
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
  def OptimizeAsync(scene: Scene): SceneOptimizer = js.native
  def OptimizeAsync(scene: Scene, options: SceneOptimizerOptions): SceneOptimizer = js.native
  def OptimizeAsync(scene: Scene, options: SceneOptimizerOptions, onSuccess: js.Function0[Unit]): SceneOptimizer = js.native
  def OptimizeAsync(
    scene: Scene,
    options: SceneOptimizerOptions,
    onSuccess: js.Function0[Unit],
    onFailure: js.Function0[Unit]
  ): SceneOptimizer = js.native
}

