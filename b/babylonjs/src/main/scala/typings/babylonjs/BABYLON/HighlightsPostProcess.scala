package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.HighlightsPostProcess")
@js.native
class HighlightsPostProcess protected () extends PostProcess {
  /**
    * Extracts highlights from the image
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of texture for the post process (default: Engine.TEXTURETYPE_UNSIGNED_INT)
    */
  def this(name: String, options: Double, camera: Nullable[Camera]) = this()
  def this(name: String, options: PostProcessOptions, camera: Nullable[Camera]) = this()
  def this(name: String, options: Double, camera: Nullable[Camera], samplingMode: Double) = this()
  def this(name: String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: Double) = this()
  def this(name: String, options: Double, camera: Nullable[Camera], samplingMode: Double, engine: Engine) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
}

