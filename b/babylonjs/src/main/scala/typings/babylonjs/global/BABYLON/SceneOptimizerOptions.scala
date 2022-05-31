package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SceneOptimizerOptions")
@js.native
/**
  * Creates a new list of options used by SceneOptimizer
  * @param targetFrameRate defines the target frame rate to reach (60 by default)
  * @param trackerDuration defines the interval between two checkes (2000ms by default)
  */
class SceneOptimizerOptions ()
  extends StObject
     with typings.babylonjs.BABYLON.SceneOptimizerOptions {
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
  def this(
    /**
    * Defines the target frame rate to reach (60 by default)
    */
  targetFrameRate: Unit,
    /**
    * Defines the interval between two checkes (2000ms by default)
    */
  trackerDuration: Double
  ) = this()
}
/* static members */
object SceneOptimizerOptions {
  
  @JSGlobal("BABYLON.SceneOptimizerOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a list of pre-defined optimizations aimed to have a big impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  inline def HighDegradationAllowed(): typings.babylonjs.BABYLON.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("HighDegradationAllowed")().asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizerOptions]
  inline def HighDegradationAllowed(targetFrameRate: Double): typings.babylonjs.BABYLON.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("HighDegradationAllowed")(targetFrameRate.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizerOptions]
  
  /**
    * Creates a list of pre-defined optimizations aimed to reduce the visual impact on the scene
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  inline def LowDegradationAllowed(): typings.babylonjs.BABYLON.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("LowDegradationAllowed")().asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizerOptions]
  inline def LowDegradationAllowed(targetFrameRate: Double): typings.babylonjs.BABYLON.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("LowDegradationAllowed")(targetFrameRate.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizerOptions]
  
  /**
    * Creates a list of pre-defined optimizations aimed to have a moderate impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  inline def ModerateDegradationAllowed(): typings.babylonjs.BABYLON.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("ModerateDegradationAllowed")().asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizerOptions]
  inline def ModerateDegradationAllowed(targetFrameRate: Double): typings.babylonjs.BABYLON.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("ModerateDegradationAllowed")(targetFrameRate.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizerOptions]
}
