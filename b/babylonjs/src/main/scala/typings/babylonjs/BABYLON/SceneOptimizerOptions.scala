package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SceneOptimizerOptions")
@js.native
/**
  * Creates a new list of options used by SceneOptimizer
  * @param targetFrameRate defines the target frame rate to reach (60 by default)
  * @param trackerDuration defines the interval between two checkes (2000ms by default)
  */
class SceneOptimizerOptions () extends js.Object {
  def this(/**
    * Defines the target frame rate to reach (60 by default)
    */
  targetFrameRate: Double) = this()
  def this(
    /**
    * Defines the target frame rate to reach (60 by default)
    */
  targetFrameRate: Double,
    /**
    * Defines the interval between two checkes (2000ms by default)
    */
  trackerDuration: Double
  ) = this()
  /**
    * Gets the list of optimizations to apply
    */
  var optimizations: js.Array[SceneOptimization] = js.native
  /**
    * Defines the target frame rate to reach (60 by default)
    */
  var targetFrameRate: Double = js.native
  /**
    * Defines the interval between two checkes (2000ms by default)
    */
  var trackerDuration: Double = js.native
  /**
    * Add a new custom optimization
    * @param onApply defines the callback called to apply the custom optimization (true if everything that can be done was applied)
    * @param onGetDescription defines the callback called to get the description attached with the optimization.
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    * @returns the current SceneOptimizerOptions
    */
  def addCustomOptimization(onApply: js.Function1[/* scene */ Scene, Boolean], onGetDescription: js.Function0[String]): SceneOptimizerOptions = js.native
  def addCustomOptimization(
    onApply: js.Function1[/* scene */ Scene, Boolean],
    onGetDescription: js.Function0[String],
    priority: Double
  ): SceneOptimizerOptions = js.native
  /**
    * Add a new optimization
    * @param optimization defines the SceneOptimization to add to the list of active optimizations
    * @returns the current SceneOptimizerOptions
    */
  def addOptimization(optimization: SceneOptimization): SceneOptimizerOptions = js.native
}

/* static members */
@JSGlobal("BABYLON.SceneOptimizerOptions")
@js.native
object SceneOptimizerOptions extends js.Object {
  /**
    * Creates a list of pre-defined optimizations aimed to have a big impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  def HighDegradationAllowed(): SceneOptimizerOptions = js.native
  def HighDegradationAllowed(targetFrameRate: Double): SceneOptimizerOptions = js.native
  /**
    * Creates a list of pre-defined optimizations aimed to reduce the visual impact on the scene
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  def LowDegradationAllowed(): SceneOptimizerOptions = js.native
  def LowDegradationAllowed(targetFrameRate: Double): SceneOptimizerOptions = js.native
  /**
    * Creates a list of pre-defined optimizations aimed to have a moderate impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  def ModerateDegradationAllowed(): SceneOptimizerOptions = js.native
  def ModerateDegradationAllowed(targetFrameRate: Double): SceneOptimizerOptions = js.native
}

