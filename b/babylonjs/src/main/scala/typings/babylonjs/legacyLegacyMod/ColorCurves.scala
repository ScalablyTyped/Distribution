package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ColorCurves")
@js.native
open class ColorCurves ()
  extends typings.babylonjs.indexMod.ColorCurves
/* static members */
object ColorCurves {
  
  @JSImport("babylonjs/Legacy/legacy", "ColorCurves")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Binds the color curves to the shader.
    * @param colorCurves The color curve to bind
    * @param effect The effect to bind to
    * @param positiveUniform The positive uniform shader parameter
    * @param neutralUniform The neutral uniform shader parameter
    * @param negativeUniform The negative uniform shader parameter
    */
  inline def Bind(
    colorCurves: typings.babylonjs.materialsColorCurvesMod.ColorCurves,
    effect: typings.babylonjs.materialsEffectMod.Effect
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.materialsColorCurvesMod.ColorCurves,
    effect: typings.babylonjs.materialsEffectMod.Effect,
    positiveUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.materialsColorCurvesMod.ColorCurves,
    effect: typings.babylonjs.materialsEffectMod.Effect,
    positiveUniform: String,
    neutralUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.materialsColorCurvesMod.ColorCurves,
    effect: typings.babylonjs.materialsEffectMod.Effect,
    positiveUniform: String,
    neutralUniform: String,
    negativeUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any], negativeUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.materialsColorCurvesMod.ColorCurves,
    effect: typings.babylonjs.materialsEffectMod.Effect,
    positiveUniform: String,
    neutralUniform: Unit,
    negativeUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any], negativeUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.materialsColorCurvesMod.ColorCurves,
    effect: typings.babylonjs.materialsEffectMod.Effect,
    positiveUniform: Unit,
    neutralUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.materialsColorCurvesMod.ColorCurves,
    effect: typings.babylonjs.materialsEffectMod.Effect,
    positiveUniform: Unit,
    neutralUniform: String,
    negativeUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any], negativeUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.materialsColorCurvesMod.ColorCurves,
    effect: typings.babylonjs.materialsEffectMod.Effect,
    positiveUniform: Unit,
    neutralUniform: Unit,
    negativeUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any], negativeUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Parses the color curve from a json representation.
    * @param source the JSON source to parse
    * @returns The parsed curves
    */
  inline def Parse(source: Any): typings.babylonjs.materialsColorCurvesMod.ColorCurves = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.materialsColorCurvesMod.ColorCurves]
  
  /**
    * Prepare the list of uniforms associated with the ColorCurves effects.
    * @param uniformsList The list of uniforms used in the effect
    */
  inline def PrepareUniforms(uniformsList: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniforms")(uniformsList.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Takes an input slider value and returns an adjusted value that provides extra control near the centre.
    * @param value The input slider value in range [-100,100].
    * @returns Adjusted value.
    */
  @JSImport("babylonjs/Legacy/legacy", "ColorCurves._ApplyColorGradingSliderNonlinear")
  @js.native
  def _ApplyColorGradingSliderNonlinear: Any = js.native
  inline def _ApplyColorGradingSliderNonlinear_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ApplyColorGradingSliderNonlinear")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a value clamped between min and max
    * @param value The value to clamp
    * @param min The minimum of value
    * @param max The maximum of value
    * @returns The clamped value.
    */
  @JSImport("babylonjs/Legacy/legacy", "ColorCurves._Clamp")
  @js.native
  def _Clamp: Any = js.native
  inline def _Clamp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Clamp")(x.asInstanceOf[js.Any])
  
  /**
    * Returns an RGBA Color4 based on Hue, Saturation and Brightness (also referred to as value, HSV).
    * @param hue The hue (H) input.
    * @param saturation The saturation (S) input.
    * @param brightness The brightness (B) input.
    * @param result
    * @result An RGBA color represented as Vector4.
    */
  @JSImport("babylonjs/Legacy/legacy", "ColorCurves._FromHSBToRef")
  @js.native
  def _FromHSBToRef: Any = js.native
  inline def _FromHSBToRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FromHSBToRef")(x.asInstanceOf[js.Any])
}
