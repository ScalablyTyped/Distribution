package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * This post-process allows the modification of rendered colors by using
     * a 'look-up table' (LUT). This effect is also called Color Grading.
     *
     * The object needs to be provided an url to a texture containing the color
     * look-up table: the texture must be 256 pixels wide and 16 pixels high.
     * Use an image editing software to tweak the LUT to match your needs.
     *
     * For an example of a color LUT, see here:
     * @see http://udn.epicgames.com/Three/rsrc/Three/ColorGrading/RGBTable16x1.png
     * For explanations on color grading, see here:
     * @see http://udn.epicgames.com/Three/ColorGrading.html
     *
     */
@JSGlobal("BABYLON.ColorCorrectionPostProcess")
@js.native
class ColorCorrectionPostProcess protected () extends PostProcess {
  def this(name: java.lang.String, colorTableUrl: java.lang.String, options: PostProcessOptions, camera: Camera) = this()
  def this(name: java.lang.String, colorTableUrl: java.lang.String, options: scala.Double, camera: Camera) = this()
  def this(name: java.lang.String, colorTableUrl: java.lang.String, options: PostProcessOptions, camera: Camera, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, colorTableUrl: java.lang.String, options: scala.Double, camera: Camera, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, colorTableUrl: java.lang.String, options: PostProcessOptions, camera: Camera, samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, colorTableUrl: java.lang.String, options: scala.Double, camera: Camera, samplingMode: scala.Double, engine: Engine) = this()
  def this(name: java.lang.String, colorTableUrl: java.lang.String, options: PostProcessOptions, camera: Camera, samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  def this(name: java.lang.String, colorTableUrl: java.lang.String, options: scala.Double, camera: Camera, samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  var _colorTableTexture: js.Any = js.native
}

