package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The extract highlights post process sets all pixels to black except pixels above the specified luminance threshold. Used as the first step for a bloom effect.
  */
@JSGlobal("BABYLON.ExtractHighlightsPostProcess")
@js.native
class ExtractHighlightsPostProcess protected () extends PostProcess {
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
  def this(name: java.lang.String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  def this(name: java.lang.String, options: scala.Double, camera: Nullable[Camera], samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean, textureType: scala.Double, blockCompilation: scala.Boolean) = this()
  /** @hidden */
  var _exposure: scala.Double = js.native
  /**
    * Post process which has the input texture to be used when performing highlight extraction
    * @hidden
    */
  var _inputPostProcess: Nullable[PostProcess] = js.native
  /**
    * The luminance threshold, pixels below this value will be set to black.
    */
  var threshold: scala.Double = js.native
}

