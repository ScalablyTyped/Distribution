package typings.babylonjs.legacyMod

import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "BloomMergePostProcess")
@js.native
class BloomMergePostProcess protected ()
  extends typings.babylonjs.indexMod.BloomMergePostProcess {
  /**
    * Creates a new instance of @see BloomMergePostProcess
    * @param name The name of the effect.
    * @param originalFromInput Post process which's input will be used for the merge.
    * @param blurred Blurred highlights post process which's output will be used.
    * @param weight Weight of the bloom to be added to the original input.
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
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean,
    textureType: Double,
    blockCompilation: Boolean
  ) = this()
  def this(
    name: String,
    originalFromInput: typings.babylonjs.postProcessMod.PostProcess,
    blurred: typings.babylonjs.postProcessMod.PostProcess,
    /** Weight of the bloom to be added to the original input. */
  weight: Double,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean,
    textureType: Double,
    blockCompilation: Boolean
  ) = this()
}

