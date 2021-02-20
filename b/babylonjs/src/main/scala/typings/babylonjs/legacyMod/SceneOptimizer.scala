package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SceneOptimizer")
@js.native
class SceneOptimizer protected ()
  extends typings.babylonjs.indexMod.SceneOptimizer {
  /**
    * Creates a new SceneOptimizer
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param autoGeneratePriorities defines if priorities must be generated and not read from SceneOptimization property (true by default)
    * @param improvementMode defines if the scene optimizer must run the maximum optimization while staying over a target frame instead of trying to reach the target framerate (false by default)
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    options: js.UndefOr[scala.Nothing],
    autoGeneratePriorities: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions,
    autoGeneratePriorities: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    options: js.UndefOr[scala.Nothing],
    autoGeneratePriorities: js.UndefOr[scala.Nothing],
    improvementMode: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    options: js.UndefOr[scala.Nothing],
    autoGeneratePriorities: Boolean,
    improvementMode: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions,
    autoGeneratePriorities: js.UndefOr[scala.Nothing],
    improvementMode: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions,
    autoGeneratePriorities: Boolean,
    improvementMode: Boolean
  ) = this()
}
/* static members */
object SceneOptimizer {
  
  /**
    * Helper function to create a SceneOptimizer with one single line of code
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param onSuccess defines a callback to call on success
    * @param onFailure defines a callback to call on failure
    * @returns the new SceneOptimizer object
    */
  @JSImport("babylonjs/Legacy/legacy", "SceneOptimizer.OptimizeAsync")
  @js.native
  def OptimizeAsync(scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.sceneOptimizerMod.SceneOptimizer = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneOptimizer.OptimizeAsync")
  @js.native
  def OptimizeAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: js.UndefOr[scala.Nothing],
    onSuccess: js.UndefOr[scala.Nothing],
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.sceneOptimizerMod.SceneOptimizer = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneOptimizer.OptimizeAsync")
  @js.native
  def OptimizeAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: js.UndefOr[scala.Nothing],
    onSuccess: js.Function0[Unit]
  ): typings.babylonjs.sceneOptimizerMod.SceneOptimizer = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneOptimizer.OptimizeAsync")
  @js.native
  def OptimizeAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: js.UndefOr[scala.Nothing],
    onSuccess: js.Function0[Unit],
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.sceneOptimizerMod.SceneOptimizer = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneOptimizer.OptimizeAsync")
  @js.native
  def OptimizeAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions
  ): typings.babylonjs.sceneOptimizerMod.SceneOptimizer = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneOptimizer.OptimizeAsync")
  @js.native
  def OptimizeAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions,
    onSuccess: js.UndefOr[scala.Nothing],
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.sceneOptimizerMod.SceneOptimizer = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneOptimizer.OptimizeAsync")
  @js.native
  def OptimizeAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions,
    onSuccess: js.Function0[Unit]
  ): typings.babylonjs.sceneOptimizerMod.SceneOptimizer = js.native
  @JSImport("babylonjs/Legacy/legacy", "SceneOptimizer.OptimizeAsync")
  @js.native
  def OptimizeAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.sceneOptimizerMod.SceneOptimizerOptions,
    onSuccess: js.Function0[Unit],
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.sceneOptimizerMod.SceneOptimizer = js.native
}
