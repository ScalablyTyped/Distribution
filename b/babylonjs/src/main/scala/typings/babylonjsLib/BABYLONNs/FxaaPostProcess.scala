package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Fxaa post process
     * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#fxaa
     */
@JSGlobal("BABYLON.FxaaPostProcess")
@js.native
class FxaaPostProcess protected () extends PostProcess {
  def this(name: java.lang.String, options: PostProcessOptions) = this()
  def this(name: java.lang.String, options: scala.Double) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera]) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera]) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double) = this()
  var _getDefines: js.Any = js.native
  /** @hidden */
  var texelHeight: scala.Double = js.native
  /** @hidden */
  var texelWidth: scala.Double = js.native
}

