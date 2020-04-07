package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.FxaaPostProcess")
@js.native
class FxaaPostProcess protected () extends PostProcess {
  def this(name: String, options: Double) = this()
  def this(name: String, options: PostProcessOptions) = this()
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
  var _getDefines: js.Any = js.native
  /** @hidden */
  var texelHeight: Double = js.native
  /** @hidden */
  var texelWidth: Double = js.native
}

