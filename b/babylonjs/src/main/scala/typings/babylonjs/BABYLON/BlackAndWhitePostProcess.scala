package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BlackAndWhitePostProcess")
@js.native
class BlackAndWhitePostProcess protected () extends PostProcess {
  /**
    * Creates a black and white post process
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#black-and-white
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: String, options: Double, camera: Camera) = this()
  def this(name: String, options: PostProcessOptions, camera: Camera) = this()
  def this(name: String, options: Double, camera: Camera, samplingMode: Double) = this()
  def this(name: String, options: PostProcessOptions, camera: Camera, samplingMode: Double) = this()
  def this(name: String, options: Double, camera: Camera, samplingMode: Double, engine: Engine) = this()
  def this(name: String, options: PostProcessOptions, camera: Camera, samplingMode: Double, engine: Engine) = this()
  def this(
    name: String,
    options: Double,
    camera: Camera,
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Camera,
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  /**
    * Linear about to convert he result to black and white (default: 1)
    */
  var degree: Double = js.native
}

