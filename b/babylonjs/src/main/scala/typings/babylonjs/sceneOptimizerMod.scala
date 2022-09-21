package typings.babylonjs

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneOptimizerMod {
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "CustomOptimization")
  @js.native
  /**
    * Creates the SceneOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    */
  open class CustomOptimization () extends SceneOptimization {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
    
    /**
      * Callback called to apply the custom optimization.
      */
    def onApply(scene: Scene, optimizer: SceneOptimizer): Boolean = js.native
    
    /**
      * Callback called to get custom description
      */
    def onGetDescription(): String = js.native
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "HardwareScalingOptimization")
  @js.native
  /**
    * Creates the HardwareScalingOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    * @param maximumScale defines the maximum scale to use (2 by default)
    * @param step defines the step to use between two passes (0.5 by default)
    */
  open class HardwareScalingOptimization () extends SceneOptimization {
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
    priority: Unit,
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
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double,
      /**
      * Defines the maximum scale to use (2 by default)
      */
    maximumScale: Unit,
      /**
      * Defines the step to use between two passes (0.5 by default)
      */
    step: Double
    ) = this()
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Unit,
      /**
      * Defines the maximum scale to use (2 by default)
      */
    maximumScale: Double,
      /**
      * Defines the step to use between two passes (0.5 by default)
      */
    step: Double
    ) = this()
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Unit,
      /**
      * Defines the maximum scale to use (2 by default)
      */
    maximumScale: Unit,
      /**
      * Defines the step to use between two passes (0.5 by default)
      */
    step: Double
    ) = this()
    
    /* private */ var _currentScale: Any = js.native
    
    /* private */ var _directionOffset: Any = js.native
    
    /**
      * Defines the maximum scale to use (2 by default)
      */
    var maximumScale: Double = js.native
    
    /**
      * Defines the step to use between two passes (0.5 by default)
      */
    var step: Double = js.native
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "LensFlaresOptimization")
  @js.native
  /**
    * Creates the SceneOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    */
  open class LensFlaresOptimization () extends SceneOptimization {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "MergeMeshesOptimization")
  @js.native
  /**
    * Creates the SceneOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    */
  open class MergeMeshesOptimization () extends SceneOptimization {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
    
    /* private */ var _canBeMerged: Any = js.native
    
    @JSName("apply")
    def apply(scene: Scene, optimizer: SceneOptimizer, updateSelectionTree: Boolean): Boolean = js.native
  }
  /* static members */
  object MergeMeshesOptimization {
    
    @JSImport("babylonjs/Misc/sceneOptimizer", "MergeMeshesOptimization")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/sceneOptimizer", "MergeMeshesOptimization._UpdateSelectionTree")
    @js.native
    def _UpdateSelectionTree: Any = js.native
    inline def _UpdateSelectionTree_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpdateSelectionTree")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "ParticlesOptimization")
  @js.native
  /**
    * Creates the SceneOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    */
  open class ParticlesOptimization () extends SceneOptimization {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "PostProcessesOptimization")
  @js.native
  /**
    * Creates the SceneOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    */
  open class PostProcessesOptimization () extends SceneOptimization {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "RenderTargetsOptimization")
  @js.native
  /**
    * Creates the SceneOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    */
  open class RenderTargetsOptimization () extends SceneOptimization {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "SceneOptimization")
  @js.native
  /**
    * Creates the SceneOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    */
  open class SceneOptimization () extends StObject {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
    
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
    
    /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    var priority: Double = js.native
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "SceneOptimizer")
  @js.native
  open class SceneOptimizer protected ()
    extends StObject
       with IDisposable {
    /**
      * Creates a new SceneOptimizer
      * @param scene defines the scene to work on
      * @param options defines the options to use with the SceneOptimizer
      * @param autoGeneratePriorities defines if priorities must be generated and not read from SceneOptimization property (true by default)
      * @param improvementMode defines if the scene optimizer must run the maximum optimization while staying over a target frame instead of trying to reach the target framerate (false by default)
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, options: SceneOptimizerOptions) = this()
    def this(scene: Scene, options: Unit, autoGeneratePriorities: Boolean) = this()
    def this(scene: Scene, options: SceneOptimizerOptions, autoGeneratePriorities: Boolean) = this()
    def this(scene: Scene, options: Unit, autoGeneratePriorities: Boolean, improvementMode: Boolean) = this()
    def this(scene: Scene, options: Unit, autoGeneratePriorities: Unit, improvementMode: Boolean) = this()
    def this(
      scene: Scene,
      options: SceneOptimizerOptions,
      autoGeneratePriorities: Boolean,
      improvementMode: Boolean
    ) = this()
    def this(
      scene: Scene,
      options: SceneOptimizerOptions,
      autoGeneratePriorities: Unit,
      improvementMode: Boolean
    ) = this()
    
    /* private */ var _checkCurrentState: Any = js.native
    
    /* private */ var _currentFrameRate: Any = js.native
    
    /* private */ var _currentPriorityLevel: Any = js.native
    
    /* private */ var _improvementMode: Any = js.native
    
    /* private */ var _isRunning: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _sceneDisposeObserver: Any = js.native
    
    /* private */ var _targetFrameRate: Any = js.native
    
    /* private */ var _trackerDuration: Any = js.native
    
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
      * Gets or sets a boolean indicating if the optimizer is in improvement mode
      */
    def isInImprovementMode: Boolean = js.native
    def isInImprovementMode_=(value: Boolean): Unit = js.native
    
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
      * Gets the list of active optimizations
      */
    def optimizations: js.Array[SceneOptimization] = js.native
    
    /**
      * Reset the optimizer to initial step (current priority level = 0)
      */
    def reset(): Unit = js.native
    
    /**
      * Start the optimizer. By default it will try to reach a specific framerate
      * but if the optimizer is set with improvementMode === true then it will run all optimization while frame rate is above the target frame rate
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
    def targetFrameRate_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the current interval between two checks (every 2000ms by default)
      */
    def trackerDuration: Double = js.native
    /**
      * Gets or sets the current interval between two checks (every 2000ms by default)
      */
    def trackerDuration_=(value: Double): Unit = js.native
  }
  /* static members */
  object SceneOptimizer {
    
    @JSImport("babylonjs/Misc/sceneOptimizer", "SceneOptimizer")
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
    inline def OptimizeAsync(scene: Scene): SceneOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[SceneOptimizer]
    inline def OptimizeAsync(scene: Scene, options: Unit, onSuccess: js.Function0[Unit]): SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[SceneOptimizer]
    inline def OptimizeAsync(scene: Scene, options: Unit, onSuccess: js.Function0[Unit], onFailure: js.Function0[Unit]): SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[SceneOptimizer]
    inline def OptimizeAsync(scene: Scene, options: Unit, onSuccess: Unit, onFailure: js.Function0[Unit]): SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[SceneOptimizer]
    inline def OptimizeAsync(scene: Scene, options: SceneOptimizerOptions): SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SceneOptimizer]
    inline def OptimizeAsync(scene: Scene, options: SceneOptimizerOptions, onSuccess: js.Function0[Unit]): SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[SceneOptimizer]
    inline def OptimizeAsync(
      scene: Scene,
      options: SceneOptimizerOptions,
      onSuccess: js.Function0[Unit],
      onFailure: js.Function0[Unit]
    ): SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[SceneOptimizer]
    inline def OptimizeAsync(scene: Scene, options: SceneOptimizerOptions, onSuccess: Unit, onFailure: js.Function0[Unit]): SceneOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("OptimizeAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any])).asInstanceOf[SceneOptimizer]
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "SceneOptimizerOptions")
  @js.native
  /**
    * Creates a new list of options used by SceneOptimizer
    * @param targetFrameRate defines the target frame rate to reach (60 by default)
    * @param trackerDuration defines the interval between two checks (2000ms by default)
    */
  open class SceneOptimizerOptions () extends StObject {
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
    
    /**
      * Add a new custom optimization
      * @param onApply defines the callback called to apply the custom optimization (true if everything that can be done was applied)
      * @param onGetDescription defines the callback called to get the description attached with the optimization.
      * @param priority defines the priority of this optimization (0 by default which means first in the list)
      * @returns the current SceneOptimizerOptions
      */
    def addCustomOptimization(
      onApply: js.Function2[/* scene */ Scene, /* optimizer */ SceneOptimizer, Boolean],
      onGetDescription: js.Function0[String]
    ): SceneOptimizerOptions = js.native
    def addCustomOptimization(
      onApply: js.Function2[/* scene */ Scene, /* optimizer */ SceneOptimizer, Boolean],
      onGetDescription: js.Function0[String],
      priority: Double
    ): SceneOptimizerOptions = js.native
    
    /**
      * Add a new optimization
      * @param optimization defines the SceneOptimization to add to the list of active optimizations
      * @returns the current SceneOptimizerOptions
      */
    def addOptimization(optimization: SceneOptimization): SceneOptimizerOptions = js.native
    
    /**
      * Gets the list of optimizations to apply
      */
    var optimizations: js.Array[SceneOptimization] = js.native
    
    /**
      * Defines the target frame rate to reach (60 by default)
      */
    var targetFrameRate: Double = js.native
    
    /**
      * Defines the interval between two checks (2000ms by default)
      */
    var trackerDuration: Double = js.native
  }
  /* static members */
  object SceneOptimizerOptions {
    
    @JSImport("babylonjs/Misc/sceneOptimizer", "SceneOptimizerOptions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a list of pre-defined optimizations aimed to have a big impact on the scene visual
      * @param targetFrameRate defines the target frame rate (60 by default)
      * @returns a SceneOptimizerOptions object
      */
    inline def HighDegradationAllowed(): SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("HighDegradationAllowed")().asInstanceOf[SceneOptimizerOptions]
    inline def HighDegradationAllowed(targetFrameRate: Double): SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("HighDegradationAllowed")(targetFrameRate.asInstanceOf[js.Any]).asInstanceOf[SceneOptimizerOptions]
    
    /**
      * Creates a list of pre-defined optimizations aimed to reduce the visual impact on the scene
      * @param targetFrameRate defines the target frame rate (60 by default)
      * @returns a SceneOptimizerOptions object
      */
    inline def LowDegradationAllowed(): SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("LowDegradationAllowed")().asInstanceOf[SceneOptimizerOptions]
    inline def LowDegradationAllowed(targetFrameRate: Double): SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("LowDegradationAllowed")(targetFrameRate.asInstanceOf[js.Any]).asInstanceOf[SceneOptimizerOptions]
    
    /**
      * Creates a list of pre-defined optimizations aimed to have a moderate impact on the scene visual
      * @param targetFrameRate defines the target frame rate (60 by default)
      * @returns a SceneOptimizerOptions object
      */
    inline def ModerateDegradationAllowed(): SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("ModerateDegradationAllowed")().asInstanceOf[SceneOptimizerOptions]
    inline def ModerateDegradationAllowed(targetFrameRate: Double): SceneOptimizerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("ModerateDegradationAllowed")(targetFrameRate.asInstanceOf[js.Any]).asInstanceOf[SceneOptimizerOptions]
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "ShadowsOptimization")
  @js.native
  /**
    * Creates the SceneOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    */
  open class ShadowsOptimization () extends SceneOptimization {
    def this(/**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double) = this()
  }
  
  @JSImport("babylonjs/Misc/sceneOptimizer", "TextureOptimization")
  @js.native
  /**
    * Creates the TextureOptimization object
    * @param priority defines the priority of this optimization (0 by default which means first in the list)
    * @param maximumSize defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    * @param step defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  open class TextureOptimization () extends SceneOptimization {
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
    priority: Unit,
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
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Double,
      /**
      * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
      */
    maximumSize: Unit,
      /**
      * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
      */
    step: Double
    ) = this()
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Unit,
      /**
      * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
      */
    maximumSize: Double,
      /**
      * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
      */
    step: Double
    ) = this()
    def this(
      /**
      * Defines the priority of this optimization (0 by default which means first in the list)
      */
    priority: Unit,
      /**
      * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
      */
    maximumSize: Unit,
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
}
