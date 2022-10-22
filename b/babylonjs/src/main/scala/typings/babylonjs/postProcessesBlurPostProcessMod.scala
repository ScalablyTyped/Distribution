package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesBlurPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/blurPostProcess", "BlurPostProcess")
  @js.native
  open class BlurPostProcess protected () extends PostProcess {
    /**
      * Creates a new instance BlurPostProcess
      * @param name The name of the effect.
      * @param direction The direction in which to blur the image.
      * @param kernel The size of the kernel to be used when computing the blur. eg. Size of 3 will blur the center pixel by 2 pixels surrounding it.
      * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param defines
      * @param _blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
      * @param textureFormat Format of textures used when performing the post process. (default: TEXTUREFORMAT_RGBA)
      */
    def this(
      name: String,
      direction: Vector2,
      kernel: Double,
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      defines: js.UndefOr[String],
      _blockCompilation: js.UndefOr[Boolean],
      textureFormat: js.UndefOr[Double]
    ) = this()
    
    /* private */ var _blockCompilation: Any = js.native
    
    /**
      * Calculates the value of a Gaussian distribution with sigma 3 at a given point.
      * @param x The point on the Gaussian distribution to sample.
      * @returns the value of the Gaussian function at x.
      */
    /* protected */ def _gaussianWeight(x: Double): Double = js.native
    
    /**
      * Generates a string that can be used as a floating point number in GLSL.
      * @param x Value to print.
      * @param decimalFigures Number of decimal places to print the number to (excluding trailing 0s).
      * @returns GLSL float string.
      */
    /* protected */ def _glslFloat(x: Double): String = js.native
    /* protected */ def _glslFloat(x: Double, decimalFigures: Double): String = js.native
    
    /* protected */ var _idealKernel: Double = js.native
    
    /* protected */ var _kernel: Double = js.native
    
    /**
      * Best kernels are odd numbers that when divided by 2, their integer part is even, so 5, 9 or 13.
      * Other odd kernels optimize correctly but require proportionally more samples, even kernels are
      * possible but will produce minor visual artifacts. Since each new kernel requires a new shader we
      * want to minimize kernel changes, having gaps between physical kernels is helpful in that regard.
      * The gaps between physical kernels are compensated for in the weighting of the samples
      * @param idealKernel Ideal blur kernel.
      * @returns Nearest best kernel.
      */
    /* protected */ def _nearestBestKernel(idealKernel: Double): Double = js.native
    
    /* protected */ var _packedFloat: Boolean = js.native
    
    /* private */ var _staticDefines: Any = js.native
    
    /* protected */ def _updateParameters(): Unit = js.native
    /* protected */ def _updateParameters(onCompiled: js.Function1[/* effect */ Effect, Unit]): Unit = js.native
    /* protected */ def _updateParameters(
      onCompiled: js.Function1[/* effect */ Effect, Unit],
      onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
    ): Unit = js.native
    /* protected */ def _updateParameters(onCompiled: Unit, onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]): Unit = js.native
    
    /** The direction in which to blur the image. */
    var direction: Vector2 = js.native
    
    /**
      * Gets the length in pixels of the blur sample region
      */
    def kernel: Double = js.native
    /**
      * Sets the length in pixels of the blur sample region
      */
    def kernel_=(v: Double): Unit = js.native
    
    /**
      * Gets whether or not the blur is unpacking/repacking floats
      */
    def packedFloat: Boolean = js.native
    /**
      * Sets whether or not the blur needs to unpack/repack floats
      */
    def packedFloat_=(v: Boolean): Unit = js.native
    
    /**
      * Updates the effect with the current post process compile time values and recompiles the shader.
      * @param defines Define statements that should be added at the beginning of the shader. (default: null)
      * @param uniforms Set of uniform variables that will be passed to the shader. (default: null)
      * @param samplers Set of Texture2D variables that will be passed to the shader. (default: null)
      * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
      * @param onCompiled Called when the shader has been compiled.
      * @param onError Called if there is an error when compiling a shader.
      */
    def updateEffect(
      defines: js.UndefOr[Nullable[String]],
      uniforms: js.UndefOr[Nullable[js.Array[String]]],
      samplers: js.UndefOr[Nullable[js.Array[String]]],
      indexParameters: js.UndefOr[Any],
      onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, Unit]],
      onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]
    ): Unit = js.native
  }
  /* static members */
  object BlurPostProcess {
    
    @JSImport("babylonjs/PostProcesses/blurPostProcess", "BlurPostProcess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[BlurPostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[BlurPostProcess]]
  }
}
