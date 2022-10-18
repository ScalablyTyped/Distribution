package typings.babylonjs.miscIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "SceneOptimizer")
@js.native
open class SceneOptimizer protected ()
  extends typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer {
  /**
    * Creates a new SceneOptimizer
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param autoGeneratePriorities defines if priorities must be generated and not read from SceneOptimization property (true by default)
    * @param improvementMode defines if the scene optimizer must run the maximum optimization while staying over a target frame instead of trying to reach the target framerate (false by default)
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, options: typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions) = this()
  def this(scene: Scene, options: Unit, autoGeneratePriorities: Boolean) = this()
  def this(
    scene: Scene,
    options: typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions,
    autoGeneratePriorities: Boolean
  ) = this()
  def this(scene: Scene, options: Unit, autoGeneratePriorities: Boolean, improvementMode: Boolean) = this()
  def this(scene: Scene, options: Unit, autoGeneratePriorities: Unit, improvementMode: Boolean) = this()
  def this(
    scene: Scene,
    options: typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions,
    autoGeneratePriorities: Boolean,
    improvementMode: Boolean
  ) = this()
  def this(
    scene: Scene,
    options: typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions,
    autoGeneratePriorities: Unit,
    improvementMode: Boolean
  ) = this()
}
/* static members */
object SceneOptimizer {
  
  @JSImport("babylonjs/Misc/index", "SceneOptimizer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to create a SceneOptimizer with one single line of code
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param onSuccess defines a callback to call on success
    * @param onFailure defines a callback to call on failure
    * @returns the new SceneOptimizer object
    */
  inline def OptimizeAsync(scene: Scene): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer]
  inline def OptimizeAsync(scene: Scene, options: Unit, onSuccess: js.Function0[Unit]): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer]
  inline def OptimizeAsync(scene: Scene, options: Unit, onSuccess: js.Function0[Unit], onFailure: js.Function0[Unit]): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer]
  inline def OptimizeAsync(scene: Scene, options: Unit, onSuccess: Unit, onFailure: js.Function0[Unit]): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer]
  inline def OptimizeAsync(scene: Scene, options: typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer]
  inline def OptimizeAsync(
    scene: Scene,
    options: typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions,
    onSuccess: js.Function0[Unit]
  ): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer]
  inline def OptimizeAsync(
    scene: Scene,
    options: typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions,
    onSuccess: js.Function0[Unit],
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer]
  inline def OptimizeAsync(
    scene: Scene,
    options: typings.babylonjs.miscSceneOptimizerMod.SceneOptimizerOptions,
    onSuccess: Unit,
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscSceneOptimizerMod.SceneOptimizer]
}
