package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
  * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
  * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
  * corresponding to low luminance, medium luminance, and high luminance areas respectively.
  */
@JSImport("babylonjs", "ColorCurves")
@js.native
class ColorCurves ()
  extends babylonjsLib.BABYLONNs.ColorCurves

/**
  * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
  * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
  * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
  * corresponding to low luminance, medium luminance, and high luminance areas respectively.
  */
@JSImport("babylonjs", "ColorCurves")
@js.native
object ColorCurves extends js.Object {
  /**
    * Takes an input slider value and returns an adjusted value that provides extra control near the centre.
    * @param value The input slider value in range [-100,100].
    * @returns Adjusted value.
    */
  var applyColorGradingSliderNonlinear: js.Any = js.native
  /**
    * Returns a value clamped between min and max
    * @param value The value to clamp
    * @param min The minimum of value
    * @param max The maximum of value
    * @returns The clamped value.
    */
  var clamp: js.Any = js.native
  /**
    * Returns an RGBA Color4 based on Hue, Saturation and Brightness (also referred to as value, HSV).
    * @param hue The hue (H) input.
    * @param saturation The saturation (S) input.
    * @param brightness The brightness (B) input.
    * @result An RGBA color represented as Vector4.
    */
  var fromHSBToRef: js.Any = js.native
  /**
    * Binds the color curves to the shader.
    * @param colorCurves The color curve to bind
    * @param effect The effect to bind to
    * @param positiveUniform The positive uniform shader parameter
    * @param neutralUniform The neutral uniform shader parameter
    * @param negativeUniform The negative uniform shader parameter
    */
  def Bind(colorCurves: babylonjsLib.BABYLONNs.ColorCurves, effect: babylonjsLib.BABYLONNs.Effect): scala.Unit = js.native
  def Bind(
    colorCurves: babylonjsLib.BABYLONNs.ColorCurves,
    effect: babylonjsLib.BABYLONNs.Effect,
    positiveUniform: java.lang.String
  ): scala.Unit = js.native
  def Bind(
    colorCurves: babylonjsLib.BABYLONNs.ColorCurves,
    effect: babylonjsLib.BABYLONNs.Effect,
    positiveUniform: java.lang.String,
    neutralUniform: java.lang.String
  ): scala.Unit = js.native
  def Bind(
    colorCurves: babylonjsLib.BABYLONNs.ColorCurves,
    effect: babylonjsLib.BABYLONNs.Effect,
    positiveUniform: java.lang.String,
    neutralUniform: java.lang.String,
    negativeUniform: java.lang.String
  ): scala.Unit = js.native
  /**
    * Parses the color curve from a json representation.
    * @param source the JSON source to parse
    * @return The parsed curves
    */
  def Parse(source: js.Any): babylonjsLib.BABYLONNs.ColorCurves = js.native
  /**
    * Prepare the list of uniforms associated with the ColorCurves effects.
    * @param uniformsList The list of uniforms used in the effect
    */
  def PrepareUniforms(uniformsList: js.Array[java.lang.String]): scala.Unit = js.native
}

