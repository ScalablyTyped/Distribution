package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenSpaceReflectionPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/screenSpaceReflectionPostProcess", "ScreenSpaceReflectionPostProcess")
  @js.native
  class ScreenSpaceReflectionPostProcess protected () extends PostProcess {
    /**
      * Creates a new instance of ScreenSpaceReflectionPostProcess.
      * @param name The name of the effect.
      * @param scene The scene containing the objects to calculate reflections.
      * @param options The required width/height ratio to downsize to before computing the render pass.
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: true)
      * @param forceGeometryBuffer If this post process should use geometry buffer instead of prepass (default: false)
      */
    def this(
      name: String,
      scene: Scene,
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean],
      forceGeometryBuffer: js.UndefOr[Boolean]
    ) = this()
    
    var _enableSmoothReflections: js.Any = js.native
    
    var _forceGeometryBuffer: js.Any = js.native
    
    var _geometryBufferRenderer: js.Any = js.native
    
    var _prePassRenderer: js.Any = js.native
    
    var _reflectionSamples: js.Any = js.native
    
    var _smoothSteps: js.Any = js.native
    
    var _updateEffectDefines: js.Any = js.native
    
    /**
      * Gets wether or not smoothing reflections is enabled.
      * Enabling smoothing will require more GPU power and can generate a drop in FPS.
      */
    def enableSmoothReflections: Boolean = js.native
    /**
      * Sets wether or not smoothing reflections is enabled.
      * Enabling smoothing will require more GPU power and can generate a drop in FPS.
      */
    def enableSmoothReflections_=(enabled: Boolean): Unit = js.native
    
    /**
      * Gets the number of samples taken while computing reflections. More samples count is high,
      * more the post-process wil require GPU power and can generate a drop in FPS. Basically in interval [25, 100].
      */
    def reflectionSamples: Double = js.native
    /**
      * Sets the number of samples taken while computing reflections. More samples count is high,
      * more the post-process wil require GPU power and can generate a drop in FPS. Basically in interval [25, 100].
      */
    def reflectionSamples_=(samples: Double): Unit = js.native
    
    /**
      * Gets or sets the falloff exponent used while computing fresnel. More the exponent is high, more the reflections will be discrete.
      */
    var reflectionSpecularFalloffExponent: Double = js.native
    
    /**
      * Gets or sets the factor applied when computing roughness. Default value is 0.2.
      */
    var roughnessFactor: Double = js.native
    
    /**
      * Gets the number of samples taken while smoothing reflections. More samples count is high,
      * more the post-process will require GPU power and can generate a drop in FPS.
      * Default value (5.0) work pretty well in all cases but can be adjusted.
      */
    def smoothSteps: Double = js.native
    def smoothSteps_=(steps: Double): Unit = js.native
    
    /**
      * Gets or sets the step size used to iterate until the effect finds the color of the reflection's pixel. Typically in interval [0.1, 1.0]
      */
    var step: Double = js.native
    
    /**
      * Gets or sets the current reflection strength. 1.0 is an ideal value but can be increased/decreased for particular results.
      */
    var strength: Double = js.native
    
    /**
      * Gets or sets a reflection threshold mainly used to adjust the reflection's height.
      */
    var threshold: Double = js.native
  }
  /* static members */
  object ScreenSpaceReflectionPostProcess {
    
    /** @hidden */
    @JSImport("babylonjs/PostProcesses/screenSpaceReflectionPostProcess", "ScreenSpaceReflectionPostProcess._Parse")
    @js.native
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): ScreenSpaceReflectionPostProcess = js.native
  }
}
