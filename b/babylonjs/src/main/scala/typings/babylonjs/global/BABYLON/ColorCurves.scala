package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ColorCurves")
@js.native
class ColorCurves ()
  extends StObject
     with typings.babylonjs.BABYLON.ColorCurves
/* static members */
object ColorCurves {
  
  @JSGlobal("BABYLON.ColorCurves")
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
  inline def Bind(colorCurves: typings.babylonjs.BABYLON.ColorCurves, effect: typings.babylonjs.BABYLON.Effect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.BABYLON.ColorCurves,
    effect: typings.babylonjs.BABYLON.Effect,
    positiveUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.BABYLON.ColorCurves,
    effect: typings.babylonjs.BABYLON.Effect,
    positiveUniform: String,
    neutralUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.BABYLON.ColorCurves,
    effect: typings.babylonjs.BABYLON.Effect,
    positiveUniform: String,
    neutralUniform: String,
    negativeUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any], negativeUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.BABYLON.ColorCurves,
    effect: typings.babylonjs.BABYLON.Effect,
    positiveUniform: String,
    neutralUniform: Unit,
    negativeUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any], negativeUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.BABYLON.ColorCurves,
    effect: typings.babylonjs.BABYLON.Effect,
    positiveUniform: Unit,
    neutralUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.BABYLON.ColorCurves,
    effect: typings.babylonjs.BABYLON.Effect,
    positiveUniform: Unit,
    neutralUniform: String,
    negativeUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any], negativeUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Bind(
    colorCurves: typings.babylonjs.BABYLON.ColorCurves,
    effect: typings.babylonjs.BABYLON.Effect,
    positiveUniform: Unit,
    neutralUniform: Unit,
    negativeUniform: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Bind")(colorCurves.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], positiveUniform.asInstanceOf[js.Any], neutralUniform.asInstanceOf[js.Any], negativeUniform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Parses the color curve from a json representation.
    * @param source the JSON source to parse
    * @return The parsed curves
    */
  inline def Parse(source: js.Any): typings.babylonjs.BABYLON.ColorCurves = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.ColorCurves]
  
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
  @JSGlobal("BABYLON.ColorCurves.applyColorGradingSliderNonlinear")
  @js.native
  def applyColorGradingSliderNonlinear: js.Any = js.native
  inline def applyColorGradingSliderNonlinear_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applyColorGradingSliderNonlinear")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a value clamped between min and max
    * @param value The value to clamp
    * @param min The minimum of value
    * @param max The maximum of value
    * @returns The clamped value.
    */
  @JSGlobal("BABYLON.ColorCurves.clamp")
  @js.native
  def clamp: js.Any = js.native
  inline def clamp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clamp")(x.asInstanceOf[js.Any])
  
  /**
    * Returns an RGBA Color4 based on Hue, Saturation and Brightness (also referred to as value, HSV).
    * @param hue The hue (H) input.
    * @param saturation The saturation (S) input.
    * @param brightness The brightness (B) input.
    * @result An RGBA color represented as Vector4.
    */
  @JSGlobal("BABYLON.ColorCurves.fromHSBToRef")
  @js.native
  def fromHSBToRef: js.Any = js.native
  inline def fromHSBToRef_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromHSBToRef")(x.asInstanceOf[js.Any])
}
