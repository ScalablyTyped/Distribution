package typings.babylonjs.global.BABYLON

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
class SceneOptimizerOptions ()
  extends typings.babylonjs.BABYLON.SceneOptimizerOptions {
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
  def HighDegradationAllowed(): typings.babylonjs.BABYLON.SceneOptimizerOptions = js.native
  def HighDegradationAllowed(targetFrameRate: Double): typings.babylonjs.BABYLON.SceneOptimizerOptions = js.native
  /**
    * Creates a list of pre-defined optimizations aimed to reduce the visual impact on the scene
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  def LowDegradationAllowed(): typings.babylonjs.BABYLON.SceneOptimizerOptions = js.native
  def LowDegradationAllowed(targetFrameRate: Double): typings.babylonjs.BABYLON.SceneOptimizerOptions = js.native
  /**
    * Creates a list of pre-defined optimizations aimed to have a moderate impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  def ModerateDegradationAllowed(): typings.babylonjs.BABYLON.SceneOptimizerOptions = js.native
  def ModerateDegradationAllowed(targetFrameRate: Double): typings.babylonjs.BABYLON.SceneOptimizerOptions = js.native
}

