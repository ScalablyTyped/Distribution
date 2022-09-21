package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenSpaceReflectionPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/screenSpaceReflectionPostProcess", "ScreenSpaceReflectionPostProcess")
  @js.native
  open class ScreenSpaceReflectionPostProcess protected () extends PostProcess {
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
    
    /* private */ var _enableSmoothReflections: Any = js.native
    
    /* private */ var _forceGeometryBuffer: Any = js.native
    
    /* private */ def _geometryBufferRenderer: Any = js.native
    
    /* private */ var _isSceneRightHanded: Any = js.native
    
    /* private */ def _prePassRenderer: Any = js.native
    
    /* private */ var _reflectionSamples: Any = js.native
    
    /* private */ var _smoothSteps: Any = js.native
    
    /* private */ var _updateEffectDefines: Any = js.native
    
    /**
      * Gets whether or not smoothing reflections is enabled.
      * Enabling smoothing will require more GPU power and can generate a drop in FPS.
      */
    def enableSmoothReflections: Boolean = js.native
    /**
      * Sets whether or not smoothing reflections is enabled.
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
    
    @JSImport("babylonjs/PostProcesses/screenSpaceReflectionPostProcess", "ScreenSpaceReflectionPostProcess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param parsedPostProcess
      * @param targetCamera
      * @param scene
      * @param rootUrl
      * @hidden
      */
    inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): ScreenSpaceReflectionPostProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[ScreenSpaceReflectionPostProcess]
  }
}
