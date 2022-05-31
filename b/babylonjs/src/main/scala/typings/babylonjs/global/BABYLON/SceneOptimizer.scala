package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SceneOptimizer")
@js.native
class SceneOptimizer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SceneOptimizer {
  /**
    * Creates a new SceneOptimizer
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param autoGeneratePriorities defines if priorities must be generated and not read from SceneOptimization property (true by default)
    * @param improvementMode defines if the scene optimizer must run the maximum optimization while staying over a target frame instead of trying to reach the target framerate (false by default)
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, options: typings.babylonjs.BABYLON.SceneOptimizerOptions) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, options: Unit, autoGeneratePriorities: Boolean) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    options: typings.babylonjs.BABYLON.SceneOptimizerOptions,
    autoGeneratePriorities: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    options: Unit,
    autoGeneratePriorities: Boolean,
    improvementMode: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    options: Unit,
    autoGeneratePriorities: Unit,
    improvementMode: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    options: typings.babylonjs.BABYLON.SceneOptimizerOptions,
    autoGeneratePriorities: Boolean,
    improvementMode: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    options: typings.babylonjs.BABYLON.SceneOptimizerOptions,
    autoGeneratePriorities: Unit,
    improvementMode: Boolean
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object SceneOptimizer {
  
  @JSGlobal("BABYLON.SceneOptimizer")
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
  inline def OptimizeAsync(scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.SceneOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizer]
  inline def OptimizeAsync(scene: typings.babylonjs.BABYLON.Scene, options: Unit, onSuccess: js.Function0[Unit]): typings.babylonjs.BABYLON.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizer]
  inline def OptimizeAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    options: Unit,
    onSuccess: js.Function0[Unit],
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.BABYLON.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizer]
  inline def OptimizeAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    options: Unit,
    onSuccess: Unit,
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.BABYLON.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizer]
  inline def OptimizeAsync(scene: typings.babylonjs.BABYLON.Scene, options: typings.babylonjs.BABYLON.SceneOptimizerOptions): typings.babylonjs.BABYLON.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizer]
  inline def OptimizeAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    options: typings.babylonjs.BABYLON.SceneOptimizerOptions,
    onSuccess: js.Function0[Unit]
  ): typings.babylonjs.BABYLON.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizer]
  inline def OptimizeAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    options: typings.babylonjs.BABYLON.SceneOptimizerOptions,
    onSuccess: js.Function0[Unit],
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.BABYLON.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizer]
  inline def OptimizeAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    options: typings.babylonjs.BABYLON.SceneOptimizerOptions,
    onSuccess: Unit,
    onFailure: js.Function0[Unit]
  ): typings.babylonjs.BABYLON.SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SceneOptimizer]
}
