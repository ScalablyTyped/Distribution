package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/depthOfFieldMergePostProcess", JSImport.Namespace)
@js.native
object depthOfFieldMergePostProcessMod extends js.Object {
  @js.native
  class DepthOfFieldMergePostProcess protected () extends PostProcess {
    /**
      * Creates a new instance of DepthOfFieldMergePostProcess
      * @param name The name of the effect.
      * @param originalFromInput Post process which's input will be used for the merge.
      * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
      * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
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
      blurSteps: js.Array[PostProcess],
      options: Double,
      camera: Nullable[Camera]
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: PostProcessOptions,
      camera: Nullable[Camera]
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean,
      textureType: Double,
      blockCompilation: Boolean
    ) = this()
    def this(
      name: String,
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean,
      textureType: Double,
      blockCompilation: Boolean
    ) = this()
    var blurSteps: js.Any = js.native
  }
  
  @js.native
  class DepthOfFieldMergePostProcessOptions () extends js.Object {
    /**
      * Parameters to perform the merge of bloom effect
      */
    var bloom: js.UndefOr[AnonBlurred] = js.native
    /**
      * Parameters to perform the merge of the depth of field effect
      */
    var depthOfField: js.UndefOr[AnonBlurSteps] = js.native
    /**
      * The original image to merge on top of
      */
    var originalFromInput: PostProcess = js.native
  }
  
}

