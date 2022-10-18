package typings.babylonjs

import typings.babylonjs.anon.BlurSteps
import typings.babylonjs.anon.Blurred
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesDepthOfFieldMergePostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/depthOfFieldMergePostProcess", "DepthOfFieldMergePostProcess")
  @js.native
  open class DepthOfFieldMergePostProcess protected () extends PostProcess {
    /**
      * Creates a new instance of DepthOfFieldMergePostProcess
      * @param name The name of the effect.
      * @param originalFromInput Post process which's input will be used for the merge.
      * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
      * @param _blurSteps Blur post processes from low to high which will be mixed with the original image.
      * @param options The required width/height ratio to downsize to before computing the render pass.
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
      */
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      _blurSteps: js.Array[PostProcess],
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    
    /* private */ var _blurSteps: Any = js.native
    
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
  
  @JSImport("babylonjs/PostProcesses/depthOfFieldMergePostProcess", "DepthOfFieldMergePostProcessOptions")
  @js.native
  open class DepthOfFieldMergePostProcessOptions () extends StObject {
    
    /**
      * Parameters to perform the merge of bloom effect
      */
    var bloom: js.UndefOr[Blurred] = js.native
    
    /**
      * Parameters to perform the merge of the depth of field effect
      */
    var depthOfField: js.UndefOr[BlurSteps] = js.native
    
    /**
      * The original image to merge on top of
      */
    var originalFromInput: PostProcess = js.native
  }
}
