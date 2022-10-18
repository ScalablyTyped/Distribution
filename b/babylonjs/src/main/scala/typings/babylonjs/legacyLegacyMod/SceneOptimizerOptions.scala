package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SceneOptimizerOptions")
@js.native
/**
  * Creates a new list of options used by SceneOptimizer
  * @param targetFrameRate defines the target frame rate to reach (60 by default)
  * @param trackerDuration defines the interval between two checks (2000ms by default)
  */
open class SceneOptimizerOptions ()
  extends typings.babylonjs.indexMod.SceneOptimizerOptions {
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
    * Defines the interval between two checks (2000ms by default)
    */
  trackerDuration: Double
  ) = this()
  def this(
    /**
    * Defines the target frame rate to reach (60 by default)
    */
  targetFrameRate: Unit,
    /**
    * Defines the interval between two checks (2000ms by default)
    */
  trackerDuration: Double
  ) = this()
}
/* static members */
object SceneOptimizerOptions {
  
  @JSImport("babylonjs/Legacy/legacy", "SceneOptimizerOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a list of pre-defined optimizations aimed to have a big impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  inline def HighDegradationAllowed(): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("HighDegradationAllowed")().asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions]
  inline def HighDegradationAllowed(targetFrameRate: Double): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("HighDegradationAllowed")(targetFrameRate.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions]
  
  /**
    * Creates a list of pre-defined optimizations aimed to reduce the visual impact on the scene
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  inline def LowDegradationAllowed(): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("LowDegradationAllowed")().asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions]
  inline def LowDegradationAllowed(targetFrameRate: Double): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("LowDegradationAllowed")(targetFrameRate.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions]
  
  /**
    * Creates a list of pre-defined optimizations aimed to have a moderate impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  inline def ModerateDegradationAllowed(): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("ModerateDegradationAllowed")().asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions]
  inline def ModerateDegradationAllowed(targetFrameRate: Double): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("ModerateDegradationAllowed")(targetFrameRate.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions]
}
