package typings.csstoolsColorHelpers

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object calculations {
    
    @JSImport("@csstools/color-helpers", "calculations")
    @js.native
    val ^ : js.Any = js.native
    
    inline def binarySearchGamut(
      startOKLCH: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any,
      toDestination: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ /* x */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
        ],
      fromDestination: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ /* x */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
        ]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearchGamut")(startOKLCH.asInstanceOf[js.Any], toDestination.asInstanceOf[js.Any], fromDestination.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def contrast(
      RGB1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any,
      RGB2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(RGB1.asInstanceOf[js.Any], RGB2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def deltaEOK(
      reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any,
      sample: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deltaEOK")(reference.asInstanceOf[js.Any], sample.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def mapGamut(
      startOKLCH: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any,
      toDestination: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ /* x */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
        ],
      fromDestination: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ /* x */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
        ]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapGamut")(startOKLCH.asInstanceOf[js.Any], toDestination.asInstanceOf[js.Any], fromDestination.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def multiplyMatrices(a: js.Array[js.Array[Double] | Double], b: js.Array[js.Array[Double] | Double]): js.Array[js.Array[Double] | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyMatrices")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double] | Double]]
  }
  
  object conversions {
    
    @JSImport("@csstools/color-helpers", "conversions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@csstools/color-helpers", "conversions.D50")
    @js.native
    val D50: js.Array[Double] = js.native
    
    inline def D50ToD65(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("D50_to_D65")(XYZ.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@csstools/color-helpers", "conversions.D65")
    @js.native
    val D65: js.Array[Double] = js.native
    
    inline def D65ToD50(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("D65_to_D50")(XYZ.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def HSLToSRGB(
      HSL: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("HSL_to_sRGB")(HSL.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def HWBToSRGB(
      HWB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("HWB_to_sRGB")(HWB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def LCHToLab(
      LCH: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("LCH_to_Lab")(LCH.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def LabToLCH(
      Lab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Lab_to_LCH")(Lab.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def LabToXYZ(
      Lab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Lab_to_XYZ")(Lab.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def OKLCHToOKLab(
      OKLCH: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("OKLCH_to_OKLab")(OKLCH.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def OKLabToOKLCH(
      OKLab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("OKLab_to_OKLCH")(OKLab.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def OKLabToXYZ(
      OKLab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("OKLab_to_XYZ")(OKLab.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZToLab(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_Lab")(XYZ.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZToLin2020(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_2020")(XYZ.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZToLinA98rgb(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_a98rgb")(XYZ.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZToLinP3(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_P3")(XYZ.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZToLinProPhoto(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_ProPhoto")(XYZ.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZToLinSRGB(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_lin_sRGB")(XYZ.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZToOKLab(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_OKLab")(XYZ.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZToUv(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_uv")(XYZ.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def XYZToXy(
      XYZ: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_to_xy")(XYZ.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def gam2020(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_2020")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def gamA98rgb(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_a98rgb")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def gamP3(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_P3")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def gamProPhoto(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_ProPhoto")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def gamSRGB(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gam_sRGB")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def hueToRGB(t1: Double, t2: Double, hue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hueToRGB")(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], hue.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def lin2020(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_2020")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def lin2020ToXYZ(
      rgb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_2020_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def linA98rgb(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_a98rgb")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def linA98rgbToXYZ(
      rgb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_a98rgb_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def linP3(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_P3")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def linP3ToXYZ(
      rgb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_P3_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def linProPhoto(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_ProPhoto")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def linProPhotoToXYZ(
      rgb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_ProPhoto_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def linSRGB(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_sRGB")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def linSRGBToXYZ(
      rgb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_sRGB_to_XYZ")(rgb.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def naiveCMYKToSRGB(CMYK: js.Tuple4[Double, Double, Double, Double]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("naive_CMYK_to_sRGB")(CMYK.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def sRGBToHSL(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGB_to_HSL")(RGB.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def sRGBToLuminance(
      RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGB_to_luminance")(RGB.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("@csstools/color-helpers", "namedColors")
  @js.native
  val namedColors: Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
  ] = js.native
  
  object utils {
    
    @JSImport("@csstools/color-helpers", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clip(
      color: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clip")(color.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def inGamut(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inGamut")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object xyz {
    
    @JSImport("@csstools/color-helpers", "xyz")
    @js.native
    val ^ : js.Any = js.native
    
    inline def HSLToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("HSL_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def HWBToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("HWB_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def LCHToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("LCH_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def LabToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Lab_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def OKLCHToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("OKLCH_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def OKLabToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("OKLab_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def P3ToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("P3_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def ProPhotoRGBToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ProPhoto_RGB_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToA98RGB(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_a98_RGB")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToHSL(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_HSL")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToHWB(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_HWB")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToLCH(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_LCH")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToLab(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_Lab")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToLinSRGB(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_lin_sRGB")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToOKLCH(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_OKLCH")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToOKLab(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_OKLab")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToP3(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_P3")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToProPhoto(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_ProPhoto")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToRec2020(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_rec_2020")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToSRGB(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_sRGB")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD50ToXYZD65(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_XYZ_D65")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def XYZD65ToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D65_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def a98RGBToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("a98_RGB_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def linSRGBToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("lin_sRGB_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def rec2020ToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rec_2020_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def sRGBToXYZD50(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGB_to_XYZ_D50")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
