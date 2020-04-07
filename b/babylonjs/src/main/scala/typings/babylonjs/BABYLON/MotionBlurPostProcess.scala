package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MotionBlurPostProcess")
@js.native
class MotionBlurPostProcess protected () extends PostProcess {
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
  var _geometryBufferRenderer: js.Any = js.native
  var _motionBlurSamples: js.Any = js.native
  /**
    * Defines how much the image is blurred by the movement. Default value is equal to 1
    */
  var motionStrength: Double = js.native
  /**
    * Excludes the given skinned mesh from computing bones velocities.
    * Computing bones velocities can have a cost and that cost. The cost can be saved by calling this function and by passing the skinned mesh reference to ignore.
    * @param skinnedMesh The mesh containing the skeleton to ignore when computing the velocity map.
    */
  def excludeSkinnedMesh(skinnedMesh: AbstractMesh): Unit = js.native
  /**
    * Gets the number of iterations are used for motion blur quality. Default value is equal to 32
    */
  def motionBlurSamples(): Double = js.native
  /**
    * Sets the number of iterations to be used for motion blur quality
    */
  def motionBlurSamples(samples: Double): js.Any = js.native
  /**
    * Removes the given skinned mesh from the excluded meshes to integrate bones velocities while rendering the velocity map.
    * @param skinnedMesh The mesh containing the skeleton that has been ignored previously.
    * @see excludeSkinnedMesh to exclude a skinned mesh from bones velocity computation.
    */
  def removeExcludedSkinnedMesh(skinnedMesh: AbstractMesh): Unit = js.native
}

