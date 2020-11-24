package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ColorCurves")
@js.native
class ColorCurves ()
  extends typings.babylonjs.legacyMod.ColorCurves
/* static members */
@JSImport("babylonjs", "ColorCurves")
@js.native
object ColorCurves extends js.Object {
  
  /**
    * Binds the color curves to the shader.
    * @param colorCurves The color curve to bind
    * @param effect The effect to bind to
    * @param positiveUniform The positive uniform shader parameter
    * @param neutralUniform The neutral uniform shader parameter
    * @param negativeUniform The negative uniform shader parameter
    */
  def Bind(
    colorCurves: typings.babylonjs.colorCurvesMod.ColorCurves,
    effect: typings.babylonjs.effectMod.Effect
  ): Unit = js.native
  def Bind(
    colorCurves: typings.babylonjs.colorCurvesMod.ColorCurves,
    effect: typings.babylonjs.effectMod.Effect,
    positiveUniform: js.UndefOr[scala.Nothing],
    neutralUniform: js.UndefOr[scala.Nothing],
    negativeUniform: String
  ): Unit = js.native
  def Bind(
    colorCurves: typings.babylonjs.colorCurvesMod.ColorCurves,
    effect: typings.babylonjs.effectMod.Effect,
    positiveUniform: js.UndefOr[scala.Nothing],
    neutralUniform: String
  ): Unit = js.native
  def Bind(
    colorCurves: typings.babylonjs.colorCurvesMod.ColorCurves,
    effect: typings.babylonjs.effectMod.Effect,
    positiveUniform: js.UndefOr[scala.Nothing],
    neutralUniform: String,
    negativeUniform: String
  ): Unit = js.native
  def Bind(
    colorCurves: typings.babylonjs.colorCurvesMod.ColorCurves,
    effect: typings.babylonjs.effectMod.Effect,
    positiveUniform: String
  ): Unit = js.native
  def Bind(
    colorCurves: typings.babylonjs.colorCurvesMod.ColorCurves,
    effect: typings.babylonjs.effectMod.Effect,
    positiveUniform: String,
    neutralUniform: js.UndefOr[scala.Nothing],
    negativeUniform: String
  ): Unit = js.native
  def Bind(
    colorCurves: typings.babylonjs.colorCurvesMod.ColorCurves,
    effect: typings.babylonjs.effectMod.Effect,
    positiveUniform: String,
    neutralUniform: String
  ): Unit = js.native
  def Bind(
    colorCurves: typings.babylonjs.colorCurvesMod.ColorCurves,
    effect: typings.babylonjs.effectMod.Effect,
    positiveUniform: String,
    neutralUniform: String,
    negativeUniform: String
  ): Unit = js.native
  
  /**
    * Parses the color curve from a json representation.
    * @param source the JSON source to parse
    * @return The parsed curves
    */
  def Parse(source: js.Any): typings.babylonjs.colorCurvesMod.ColorCurves = js.native
  
  /**
    * Prepare the list of uniforms associated with the ColorCurves effects.
    * @param uniformsList The list of uniforms used in the effect
    */
  def PrepareUniforms(uniformsList: js.Array[String]): Unit = js.native
  
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
}
