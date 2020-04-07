package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/index", "MotionBlurPostProcess")
@js.native
class MotionBlurPostProcess protected ()
  extends typings.babylonjs.motionBlurPostProcessMod.MotionBlurPostProcess {
  /**
    * Creates a new instance MotionBlurPostProcess
    * @param name The name of the effect.
    * @param scene The scene containing the objects to blur according to their velocity.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(name: String, scene: Scene, options: Double, camera: Nullable[Camera]) = this()
  def this(name: String, scene: Scene, options: PostProcessOptions, camera: Nullable[Camera]) = this()
  def this(name: String, scene: Scene, options: Double, camera: Nullable[Camera], samplingMode: Double) = this()
  def this(
    name: String,
    scene: Scene,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    scene: Scene,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    scene: Scene,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    scene: Scene,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    scene: Scene,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    scene: Scene,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: Scene,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: Scene,
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
    scene: Scene,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean,
    textureType: Double,
    blockCompilation: Boolean
  ) = this()
}

