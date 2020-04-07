package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.CircleOfConfusionPostProcess")
@js.native
class CircleOfConfusionPostProcess protected () extends PostProcess {
  /**
    * Creates a new instance CircleOfConfusionPostProcess
    * @param name The name of the effect.
    * @param depthTexture The depth texture of the scene to compute the circle of confusion. This must be set in order for this to function but may be set after initialization if needed.
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
    depthTexture: Nullable[RenderTargetTexture],
    options: Double,
    camera: Nullable[Camera]
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
    options: PostProcessOptions,
    camera: Nullable[Camera]
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    depthTexture: Nullable[RenderTargetTexture],
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
    depthTexture: Nullable[RenderTargetTexture],
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean,
    textureType: Double,
    blockCompilation: Boolean
  ) = this()
  var _depthTexture: js.Any = js.native
  /**
    * F-Stop of the effect's camera. The diamater of the resulting aperture can be computed by lensSize/fStop. (default: 1.4)
    */
  var fStop: Double = js.native
  /**
    * Focal length of the effect's camera in scene units/1000 (eg. millimeter). (default: 50)
    */
  var focalLength: Double = js.native
  /**
    * Distance away from the camera to focus on in scene units/1000 (eg. millimeter). (default: 2000)
    */
  var focusDistance: Double = js.native
  /**
    * Max lens size in scene units/1000 (eg. millimeter). Standard cameras are 50mm. (default: 50) The diamater of the resulting aperture can be computed by lensSize/fStop.
    */
  var lensSize: Double = js.native
  /**
    * Depth texture to be used to compute the circle of confusion. This must be set here or in the constructor in order for the post process to function.
    */
  def depthTexture(value: RenderTargetTexture): js.Any = js.native
}

