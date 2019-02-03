package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
  * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
  * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
  * corresponding to low luminance, medium luminance, and high luminance areas respectively.
  */
@JSGlobal("BABYLON.ColorCurves")
@js.native
class ColorCurves () extends js.Object {
  var _dirty: js.Any = js.native
  var _globalCurve: js.Any = js.native
  var _globalDensity: js.Any = js.native
  var _globalExposure: js.Any = js.native
  var _globalHue: js.Any = js.native
  var _globalSaturation: js.Any = js.native
  var _highlightsCurve: js.Any = js.native
  var _highlightsDensity: js.Any = js.native
  var _highlightsExposure: js.Any = js.native
  var _highlightsHue: js.Any = js.native
  var _highlightsSaturation: js.Any = js.native
  var _midtonesCurve: js.Any = js.native
  var _midtonesDensity: js.Any = js.native
  var _midtonesExposure: js.Any = js.native
  var _midtonesHue: js.Any = js.native
  var _midtonesSaturation: js.Any = js.native
  var _negativeCurve: js.Any = js.native
  var _positiveCurve: js.Any = js.native
  var _shadowsCurve: js.Any = js.native
  var _shadowsDensity: js.Any = js.native
  var _shadowsExposure: js.Any = js.native
  var _shadowsHue: js.Any = js.native
  var _shadowsSaturation: js.Any = js.native
  var _tempColor: js.Any = js.native
  /**
    * Returns color grading data based on a hue, density, saturation and exposure value.
    * @param filterHue The hue of the color filter.
    * @param filterDensity The density of the color filter.
    * @param saturation The saturation.
    * @param exposure The exposure.
    * @param result The result data container.
    */
  var getColorGradingDataToRef: js.Any = js.native
  /**
    * Gets the global Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  /**
    * Sets the global Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  var globalDensity: scala.Double = js.native
  /**
    * Gets the global Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  /**
    * Sets the global Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  var globalExposure: scala.Double = js.native
  /**
    * Gets the global Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  /**
    * Sets the global Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  var globalHue: scala.Double = js.native
  /**
    * Gets the global Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  /**
    * Sets the global Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  var globalSaturation: scala.Double = js.native
  /**
    * Gets the highlights Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  /**
    * Sets the highlights Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  var highlightsDensity: scala.Double = js.native
  /**
    * Gets the highlights Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  /**
    * Sets the highlights Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  var highlightsExposure: scala.Double = js.native
  /**
    * Gets the highlights Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  /**
    * Sets the highlights Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  var highlightsHue: scala.Double = js.native
  /**
    * Gets the highlights Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  /**
    * Sets the highlights Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  var highlightsSaturation: scala.Double = js.native
  /**
    * Gets the midtones Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  /**
    * Sets the midtones Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  var midtonesDensity: scala.Double = js.native
  /**
    * Gets the midtones Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  /**
    * Sets the midtones Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  var midtonesExposure: scala.Double = js.native
  /**
    * Gets the midtones Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  /**
    * Sets the midtones Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  var midtonesHue: scala.Double = js.native
  /**
    * Gets the midtones Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  /**
    * Sets the midtones Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  var midtonesSaturation: scala.Double = js.native
  /**
    * Gets the shadows Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  /**
    * Sets the shadows Density value.
    * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
    * Values less than zero provide a filter of opposite hue.
    */
  var shadowsDensity: scala.Double = js.native
  /**
    * Gets the shadows Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  /**
    * Sets the shadows Exposure value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
    */
  var shadowsExposure: scala.Double = js.native
  /**
    * Gets the shadows Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  /**
    * Sets the shadows Hue value.
    * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
    */
  var shadowsHue: scala.Double = js.native
  /**
    * Gets the shadows Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  /**
    * Sets the shadows Saturation value.
    * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
    */
  var shadowsSaturation: scala.Double = js.native
  /**
    * Returns the class name
    * @returns The class name
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Serializes the current color curve instance to a json representation.
    * @return a JSON representation
    */
  def serialize(): js.Any = js.native
}

/* static members */
@JSGlobal("BABYLON.ColorCurves")
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

