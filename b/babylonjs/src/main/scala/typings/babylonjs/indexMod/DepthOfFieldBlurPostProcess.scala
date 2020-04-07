package typings.babylonjs.indexMod

import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "DepthOfFieldBlurPostProcess")
@js.native
class DepthOfFieldBlurPostProcess protected ()
  extends typings.babylonjs.postProcessesIndexMod.DepthOfFieldBlurPostProcess {
  /**
    * Creates a new instance CircleOfConfusionPostProcess
    * @param name The name of the effect.
    * @param scene The scene the effect belongs to.
    * @param direction The direction the blur should be applied.
    * @param kernel The size of the kernel used to blur.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param circleOfConfusion The circle of confusion + depth map to be used to avoid blurring accross edges
    * @param imageToBlur The image to apply the blur to (default: Current rendered frame)
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    direction: typings.babylonjs.mathVectorMod.Vector2,
    kernel: Double,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    circleOfConfusion: typings.babylonjs.postProcessMod.PostProcess,
    imageToBlur: js.UndefOr[Nullable[typings.babylonjs.postProcessMod.PostProcess]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
  def this(
    name: String,
    scene: typings.babylonjs.sceneMod.Scene,
    direction: typings.babylonjs.mathVectorMod.Vector2,
    kernel: Double,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    circleOfConfusion: typings.babylonjs.postProcessMod.PostProcess,
    imageToBlur: js.UndefOr[Nullable[typings.babylonjs.postProcessMod.PostProcess]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}

