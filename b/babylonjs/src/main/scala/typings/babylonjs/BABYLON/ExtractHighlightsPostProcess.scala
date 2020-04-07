package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ExtractHighlightsPostProcess")
@js.native
class ExtractHighlightsPostProcess protected () extends PostProcess {
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
  def this(
    name: String,
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
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean,
    textureType: Double,
    blockCompilation: Boolean
  ) = this()
  /** @hidden */
  var _exposure: Double = js.native
  /**
    * Post process which has the input texture to be used when performing highlight extraction
    * @hidden
    */
  var _inputPostProcess: Nullable[PostProcess] = js.native
  /**
    * The luminance threshold, pixels below this value will be set to black.
    */
  var threshold: Double = js.native
}

