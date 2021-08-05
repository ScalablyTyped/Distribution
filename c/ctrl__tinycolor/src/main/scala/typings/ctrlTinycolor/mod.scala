package typings.ctrlTinycolor

import typings.ctrlTinycolor.anon.A
import typings.ctrlTinycolor.anon.PartialTinyColorOptions
import typings.ctrlTinycolor.distMod.ColorInput
import typings.ctrlTinycolor.fromRatioMod.RatioInput
import typings.ctrlTinycolor.interfacesMod.HSL
import typings.ctrlTinycolor.interfacesMod.HSLA
import typings.ctrlTinycolor.interfacesMod.HSV
import typings.ctrlTinycolor.interfacesMod.HSVA
import typings.ctrlTinycolor.interfacesMod.RGB
import typings.ctrlTinycolor.interfacesMod.RGBA
import typings.ctrlTinycolor.randomMod.ColorBound
import typings.ctrlTinycolor.randomMod.RandomCountOptions
import typings.ctrlTinycolor.randomMod.RandomOptions
import typings.ctrlTinycolor.readabilityMod.WCAG2FallbackParms
import typings.ctrlTinycolor.readabilityMod.WCAG2Parms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ctrl/tinycolor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  inline def default(color: Unit, opts: PartialTinyColorOptions): typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  inline def default(color: ColorInput): typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  inline def default(color: ColorInput, opts: PartialTinyColorOptions): typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  
  @JSImport("@ctrl/tinycolor", "TinyColor")
  @js.native
  class TinyColor_ ()
    extends typings.ctrlTinycolor.distMod.TinyColor_ {
    def this(color: ColorInput) = this()
    def this(color: Unit, opts: PartialTinyColorOptions) = this()
    def this(color: ColorInput, opts: PartialTinyColorOptions) = this()
  }
  
  @JSImport("@ctrl/tinycolor", "bounds")
  @js.native
  val bounds: js.Array[ColorBound] = js.native
  
  inline def fromRatio(ratio: RatioInput): typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any]).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  inline def fromRatio(ratio: RatioInput, opts: js.Any): typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  
  inline def inputToRGB(color: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: js.Any): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSL): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSLA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSV): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: HSVA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: RGB): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  inline def inputToRGB(color: RGBA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def isReadable(color1: ColorInput, color2: ColorInput): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isReadable(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Parms): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], wcag2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidCSSUnit(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidCSSUnit(color: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def legacyRandom(): typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("legacyRandom")().asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  
  inline def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): typings.ctrlTinycolor.distMod.TinyColor_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mostReadable")(baseColor.asInstanceOf[js.Any], colorList.asInstanceOf[js.Any])).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_ | Null]
  inline def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: WCAG2FallbackParms): typings.ctrlTinycolor.distMod.TinyColor_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mostReadable")(baseColor.asInstanceOf[js.Any], colorList.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_ | Null]
  
  inline def random(): typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  inline def random(options: RandomCountOptions): js.Array[typings.ctrlTinycolor.distMod.TinyColor_] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.ctrlTinycolor.distMod.TinyColor_]]
  inline def random(options: RandomOptions): typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(options.asInstanceOf[js.Any]).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  
  inline def random_Array(): js.Array[typings.ctrlTinycolor.distMod.TinyColor_] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[js.Array[typings.ctrlTinycolor.distMod.TinyColor_]]
  
  inline def readability(color1: ColorInput, color2: ColorInput): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readability")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def stringInputToObject(color: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringInputToObject")(color.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def tinycolor(): typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")().asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  inline def tinycolor(color: Unit, opts: PartialTinyColorOptions): typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  inline def tinycolor(color: ColorInput): typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any]).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  inline def tinycolor(color: ColorInput, opts: PartialTinyColorOptions): typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.ctrlTinycolor.distMod.TinyColor_]
  
  inline def toMsFilter(firstColor: ColorInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMsFilter(firstColor: ColorInput, secondColor: ColorInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any], secondColor.asInstanceOf[js.Any])).asInstanceOf[String]
}
