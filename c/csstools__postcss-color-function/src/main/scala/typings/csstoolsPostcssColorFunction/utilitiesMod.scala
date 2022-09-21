package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("@csstools/postcss-color-function/dist/css-color-4/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LCHToP3(LCH: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("LCH_to_P3")(LCH.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def LCHToR2020(LCH: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("LCH_to_r2020")(LCH.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def LCHToSRGB(LCH: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("LCH_to_sRGB")(LCH.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def P3ToLCH(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("P3_to_LCH")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def XYZToUv(XYZ: color): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_uv")(XYZ.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def XYZToXy(XYZ: color): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_xy")(XYZ.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def contrast(RGB1: color, RGB2: color): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(RGB1.asInstanceOf[js.Any], RGB2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hslToRgb(hsl: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(hsl.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def hueToRgb(t1: Double, t2: Double, hue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hueToRgb")(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], hue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def naiveCMYKToSRGB(CMYK: js.Tuple4[Double, Double, Double, Double]): color = ^.asInstanceOf[js.Dynamic].applyDynamic("naive_CMYK_to_sRGB")(CMYK.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def naiveSRGBToCMYK(RGB: color): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("naive_sRGB_to_CMYK")(RGB.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  
  inline def r2020ToLCH(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("r2020_to_LCH")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def sRGBToLCH(RGB: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGB_to_LCH")(RGB.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def sRGBToLuminance(RGB: color): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGB_to_luminance")(RGB.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def xyToUv(xy: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("xy_to_uv")(xy.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  type color = js.Tuple3[Double, Double, Double]
}
