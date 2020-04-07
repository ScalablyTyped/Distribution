package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/index", "ColorCorrectionPostProcess")
@js.native
class ColorCorrectionPostProcess protected ()
  extends typings.babylonjs.colorCorrectionPostProcessMod.ColorCorrectionPostProcess {
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
}

