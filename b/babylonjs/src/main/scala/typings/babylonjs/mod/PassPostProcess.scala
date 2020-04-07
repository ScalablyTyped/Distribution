package typings.babylonjs.mod

import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "PassPostProcess")
@js.native
class PassPostProcess protected ()
  extends typings.babylonjs.legacyMod.PassPostProcess {
  /**
    * Creates the PassPostProcess
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    name: String,
    options: Double,
    camera: js.UndefOr[Nullable[typings.babylonjs.cameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: js.UndefOr[Nullable[typings.babylonjs.cameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}

