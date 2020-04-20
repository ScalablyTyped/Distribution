package typings.babylonjs

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/sceneOptimizer", JSImport.Namespace)
@js.native
object sceneOptimizerMod extends js.Object {
  @js.native
  class CustomOptimization () extends SceneOptimization {
    /**
      * Callback called to apply the custom optimization.
      */
    def onApply(scene: Scene, optimizer: SceneOptimizer): Boolean = js.native
    /**
      * Callback called to get custom description
      */
    def onGetDescription(): String = js.native
  }
  
  @js.native
  /**
    * Creates the HardwareScalingOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    * @param maximumScale defines the maximum scale to use (2 by default)
    * @param step defines the step to use between two passes (0.5 by default)
    */
  class HardwareScalingOptimization () extends SceneOptimization {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double,
      /**
      * Defines the maximum scale to use (2 by default)
      */
    maximumScale: Double
    ) = this()
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double,
      /**
      * Defines the maximum scale to use (2 by default)
      */
    maximumScale: Double,
      /**
      * Defines the step to use between two passes (0.5 by default)
      */
    step: Double
    ) = this()
    var _currentScale: js.Any = js.native
    var _directionOffset: js.Any = js.native
    /**
      * Defines the maximum scale to use (2 by default)
      */
    var maximumScale: Double = js.native
    /**
      * Defines the step to use between two passes (0.5 by default)
      */
    var step: Double = js.native
  }
  
  @js.native
  class LensFlaresOptimization () extends SceneOptimization
  
  @js.native
  class MergeMeshesOptimization () extends SceneOptimization {
    var _canBeMerged: js.Any = js.native
    @JSName("apply")
    def apply(scene: Scene, optimizer: SceneOptimizer, updateSelectionTree: Boolean): Boolean = js.native
  }
  
  @js.native
  class ParticlesOptimization () extends SceneOptimization
  
  @js.native
  class PostProcessesOptimization () extends SceneOptimization
  
  @js.native
  class RenderTargetsOptimization () extends SceneOptimization
  
  @js.native
  /**
    * Creates the SceneOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    * @param desc defines the description associated with the optimization
    */
  class SceneOptimization () extends js.Object {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
    /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    var priority: Double = js.native
    /**
      * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
      * @param scene defines the current scene where to apply this optimization
      * @param optimizer defines the current optimizer
      * @returns true if everything that can be done was applied
      */
    @JSName("apply")
    def apply(scene: Scene, optimizer: SceneOptimizer): Boolean = js.native
    /**
      * Gets a string describing the action executed by the current optimization
      * @returns description string
      */
    def getDescription(): String = js.native
  }
  
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
    def currentFrameRate: Double = js.native
    /**
      * Gets the current priority level (0 at start)
      */
    def currentPriorityLevel: Double = js.native
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Gets a boolean indicating if the optimizer is in improvement mode
      */
    def isInImprovementMode: Boolean = js.native
    /**
      * Gets the list of active optimizations
      */
    def optimizations: js.Array[SceneOptimization] = js.native
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
    def targetFrameRate: Double = js.native
    /**
      * Gets or sets the current target frame rate (60 by default)
      */
    def targetFrameRate(value: Double): js.Any = js.native
    /**
      * Gets or sets the current interval between two checks (every 2000ms by default)
      */
    def trackerDuration: Double = js.native
    /**
      * Gets or sets the current interval between two checks (every 2000ms by default)
      */
    def trackerDuration(value: Double): js.Any = js.native
  }
  
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
  
  @js.native
  class ShadowsOptimization () extends SceneOptimization
  
  @js.native
  /**
    * Creates the TextureOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    * @param maximumSize defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    * @param step defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  class TextureOptimization () extends SceneOptimization {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double,
      /**
      * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
      */
    maximumSize: Double
    ) = this()
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double,
      /**
      * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
      */
    maximumSize: Double,
      /**
      * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
      */
    step: Double
    ) = this()
    /**
      * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
      */
    var maximumSize: Double = js.native
    /**
      * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
      */
    var step: Double = js.native
  }
  
  /* static members */
  @js.native
  object MergeMeshesOptimization extends js.Object {
    var _UpdateSelectionTree: js.Any = js.native
    /**
      * Gets or sets a boolean which defines if optimization octree has to be updated
      */
    def UpdateSelectionTree: Boolean = js.native
    /**
      * Gets or sets a boolean which defines if optimization octree has to be updated
      */
    def UpdateSelectionTree(value: Boolean): js.Any = js.native
  }
  
  /* static members */
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
  
  /* static members */
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
  
}

