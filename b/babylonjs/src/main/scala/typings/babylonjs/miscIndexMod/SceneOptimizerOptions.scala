package typings.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "SceneOptimizerOptions")
@js.native
/**
  * Creates a new list of options used by SceneOptimizer
  * @param targetFrameRate defines the target frame rate to reach (60 by default)
  * @param trackerDuration defines the interval between two checkes (2000ms by default)
  */
class SceneOptimizerOptions ()
  extends typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions {
  def this(/**
    * Defines the target frame rate to reach (60 by default)
    */
  targetFrameRate: Double) = this()
  def this(
    /**
    * Defines the target frame rate to reach (60 by default)
    */
  targetFrameRate: js.UndefOr[scala.Nothing],
    /**
    * Defines the interval between two checkes (2000ms by default)
    */
  trackerDuration: Double
  ) = this()
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
object SceneOptimizerOptions {
  
  /**
    * Creates a list of pre-defined optimizations aimed to have a big impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  @JSImport("babylonjs/Misc/index", "SceneOptimizerOptions.HighDegradationAllowed")
  @js.native
  def HighDegradationAllowed(): typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions = js.native
  @JSImport("babylonjs/Misc/index", "SceneOptimizerOptions.HighDegradationAllowed")
  @js.native
  def HighDegradationAllowed(targetFrameRate: Double): typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions = js.native
  
  /**
    * Creates a list of pre-defined optimizations aimed to reduce the visual impact on the scene
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  @JSImport("babylonjs/Misc/index", "SceneOptimizerOptions.LowDegradationAllowed")
  @js.native
  def LowDegradationAllowed(): typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions = js.native
  @JSImport("babylonjs/Misc/index", "SceneOptimizerOptions.LowDegradationAllowed")
  @js.native
  def LowDegradationAllowed(targetFrameRate: Double): typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions = js.native
  
  /**
    * Creates a list of pre-defined optimizations aimed to have a moderate impact on the scene visual
    * @param targetFrameRate defines the target frame rate (60 by default)
    * @returns a SceneOptimizerOptions object
    */
  @JSImport("babylonjs/Misc/index", "SceneOptimizerOptions.ModerateDegradationAllowed")
  @js.native
  def ModerateDegradationAllowed(): typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions = js.native
  @JSImport("babylonjs/Misc/index", "SceneOptimizerOptions.ModerateDegradationAllowed")
  @js.native
  def ModerateDegradationAllowed(targetFrameRate: Double): typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions = js.native
}
