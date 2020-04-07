package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ColorCorrectionPostProcess")
@js.native
class ColorCorrectionPostProcess protected () extends PostProcess {
  def this(name: String, colorTableUrl: String, options: Double, camera: Camera) = this()
  def this(name: String, colorTableUrl: String, options: PostProcessOptions, camera: Camera) = this()
  def this(name: String, colorTableUrl: String, options: Double, camera: Camera, samplingMode: Double) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Camera,
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Camera,
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Camera,
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Camera,
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  var _colorTableTexture: js.Any = js.native
}

