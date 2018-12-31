package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a list of options used by SceneOptimizer
  * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
  */
@JSImport("babylonjs", "SceneOptimizerOptions")
@js.native
/**
  * Creates a new list of options used by SceneOptimizer
  * @param targetFrameRate defines the target frame rate to reach (60 by default)
  * @param trackerDuration defines the interval between two checkes (2000ms by default)
  */
class SceneOptimizerOptions ()
  extends babylonjsLib.BABYLONNs.SceneOptimizerOptions {
  def this(/**
    * Defines the target frame rate to reach (60 by default)
    */
  targetFrameRate: scala.Double) = this()
  def this(/**
    * Defines the target frame rate to reach (60 by default)
    */
  targetFrameRate: scala.Double, /**
    * Defines the interval between two checkes (2000ms by default)
    */
  trackerDuration: scala.Double) = this()
}

/**
  * Defines a list of options used by SceneOptimizer
  * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
  */
@JSImport("babylonjs", "SceneOptimizerOptions")
@js.native
object SceneOptimizerOptions extends js.Object {
  /**
    * Creates a list of pre-defined optimizations aimed to have a big impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  def HighDegradationAllowed(): babylonjsLib.BABYLONNs.SceneOptimizerOptions = js.native
  def HighDegradationAllowed(targetFrameRate: scala.Double): babylonjsLib.BABYLONNs.SceneOptimizerOptions = js.native
  /**
    * Creates a list of pre-defined optimizations aimed to reduce the visual impact on the scene
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  def LowDegradationAllowed(): babylonjsLib.BABYLONNs.SceneOptimizerOptions = js.native
  def LowDegradationAllowed(targetFrameRate: scala.Double): babylonjsLib.BABYLONNs.SceneOptimizerOptions = js.native
  /**
    * Creates a list of pre-defined optimizations aimed to have a moderate impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  def ModerateDegradationAllowed(): babylonjsLib.BABYLONNs.SceneOptimizerOptions = js.native
  def ModerateDegradationAllowed(targetFrameRate: scala.Double): babylonjsLib.BABYLONNs.SceneOptimizerOptions = js.native
}

