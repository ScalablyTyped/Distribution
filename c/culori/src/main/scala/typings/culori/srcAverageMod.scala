package typings.culori

import typings.culori.culoriStrings.rgb
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.culori.srcCommonMod.Mode
import typings.culori.srcCommonMod.NonEmptyArray
import typings.culori.srcCommonMod.OverridesFunction
import typings.culori.srcCommonMod.OverridesObject
import typings.culori.srcRgbTypesMod.Rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAverageMod {
  
  @JSImport("culori/src/average", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def average(colors: NonEmptyArray[Color | String]): Rgb = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(colors.asInstanceOf[js.Any]).asInstanceOf[Rgb]
  inline def average(colors: NonEmptyArray[Color | String], mode: Unit, overrides: OverridesFunction): Rgb = (^.asInstanceOf[js.Dynamic].applyDynamic("average")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Rgb]
  inline def average[M /* <: Mode */](colors: NonEmptyArray[Color | String], mode: M): FindColorByMode[M, Color] = (^.asInstanceOf[js.Dynamic].applyDynamic("average")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[FindColorByMode[M, Color]]
  inline def average[M /* <: Mode */](colors: NonEmptyArray[Color | String], mode: M, overrides: OverridesFunction): FindColorByMode[M, Color] = (^.asInstanceOf[js.Dynamic].applyDynamic("average")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[FindColorByMode[M, Color]]
  inline def average[M /* <: Mode */](colors: NonEmptyArray[Color | String], mode: M, overrides: OverridesObject[M]): FindColorByMode[M, Color] = (^.asInstanceOf[js.Dynamic].applyDynamic("average")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[FindColorByMode[M, Color]]
  
  inline def averageAngle(`val`: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("averageAngle")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def averageNumber(`val`: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("averageNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def average_rgb(colors: NonEmptyArray[Color | String], mode: Unit, overrides: OverridesObject[rgb]): Rgb = (^.asInstanceOf[js.Dynamic].applyDynamic("average")(colors.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Rgb]
}
