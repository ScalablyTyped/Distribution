package typings.ctrlTinycolor

import typings.ctrlTinycolor.anon.NumberifyHSLA
import typings.ctrlTinycolor.anon.NumberifyHSVA
import typings.ctrlTinycolor.anon.NumberifyRGBA
import typings.ctrlTinycolor.anon.PartialTinyColorOptions
import typings.ctrlTinycolor.ctrlTinycolorBooleans.`false`
import typings.ctrlTinycolor.ctrlTinycolorStrings.name
import typings.ctrlTinycolor.interfacesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@ctrl/tinycolor/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ctrl/tinycolor/dist", "TinyColor")
  @js.native
  open class TinyColor_ ()
    extends StObject
       with _ColorInput {
    def this(color: ColorInput) = this()
    def this(color: Unit, opts: PartialTinyColorOptions) = this()
    def this(color: ColorInput, opts: PartialTinyColorOptions) = this()
    
    /** alpha */
    var a: Double = js.native
    
    def analogous(): js.Array[TinyColor_] = js.native
    def analogous(results: Double): js.Array[TinyColor_] = js.native
    def analogous(results: Double, slices: Double): js.Array[TinyColor_] = js.native
    def analogous(results: Unit, slices: Double): js.Array[TinyColor_] = js.native
    
    /** blue */
    var b: Double = js.native
    
    /**
      * Brighten the color a given amount, from 0 to 100.
      * @param amount - valid between 1-100
      */
    def brighten(): TinyColor_ = js.native
    def brighten(amount: Double): TinyColor_ = js.native
    
    /**
      * taken from https://github.com/infusion/jQuery-xcolor/blob/master/jquery.xcolor.js
      */
    def complement(): TinyColor_ = js.native
    
    /**
      * Darken the color a given amount, from 0 to 100.
      * Providing 100 will always return black.
      * @param amount - valid between 1-100
      */
    def darken(): TinyColor_ = js.native
    def darken(amount: Double): TinyColor_ = js.native
    
    /**
      * Desaturate the color a given amount, from 0 to 100.
      * Providing 100 will is the same as calling greyscale
      * @param amount - valid between 1-100
      */
    def desaturate(): TinyColor_ = js.native
    def desaturate(amount: Double): TinyColor_ = js.native
    
    /**
      * compare color vs current color
      */
    def equals(): Boolean = js.native
    
    /** the format used to create the tinycolor instance */
    var format: ColorFormats = js.native
    
    /** green */
    var g: Double = js.native
    
    /**
      * Returns the alpha value of a color, from 0-1.
      */
    def getAlpha(): Double = js.native
    
    /**
      * Returns the perceived brightness of the color, from 0-255.
      */
    def getBrightness(): Double = js.native
    
    /**
      * Returns the perceived luminance of a color, from 0-1.
      */
    def getLuminance(): Double = js.native
    
    var gradientType: js.UndefOr[String] = js.native
    
    /**
      * Completely desaturates a color into greyscale.
      * Same as calling `desaturate(100)`
      */
    def greyscale(): TinyColor_ = js.native
    
    def isDark(): Boolean = js.native
    
    def isLight(): Boolean = js.native
    
    /** the color was successfully parsed */
    var isValid: Boolean = js.native
    
    /**
      * Lighten the color a given amount. Providing 100 will always return white.
      * @param amount - valid between 1-100
      */
    def lighten(): TinyColor_ = js.native
    def lighten(amount: Double): TinyColor_ = js.native
    
    /**
      * Mix the current color a given amount with another color, from 0 to 100.
      * 0 means no mixing (return current color).
      */
    def mix(color: ColorInput): TinyColor_ = js.native
    def mix(color: ColorInput, amount: Double): TinyColor_ = js.native
    
    def monochromatic(): js.Array[TinyColor_] = js.native
    def monochromatic(results: Double): js.Array[TinyColor_] = js.native
    
    /**
      * Compute how the color would appear on a background
      */
    def onBackground(background: ColorInput): TinyColor_ = js.native
    
    /** input passed into the constructer used to create the tinycolor instance */
    var originalInput: ColorInput = js.native
    
    /**
      * Get polyad colors, like (for 1, 2, 3, 4, 5, 6, 7, 8, etc...)
      * monad, dyad, triad, tetrad, pentad, hexad, heptad, octad, etc...
      */
    def polyad(n: Double): js.Array[TinyColor_] = js.native
    
    /** red */
    var r: Double = js.native
    
    /** rounded alpha */
    var roundA: Double = js.native
    
    /**
      * Saturate the color a given amount, from 0 to 100.
      * @param amount - valid between 1-100
      */
    def saturate(): TinyColor_ = js.native
    def saturate(amount: Double): TinyColor_ = js.native
    
    /**
      * Sets the alpha value on the current color.
      *
      * @param alpha - The new alpha value. The accepted range is 0-1.
      */
    def setAlpha(): this.type = js.native
    def setAlpha(alpha: String): this.type = js.native
    def setAlpha(alpha: Double): this.type = js.native
    
    /**
      * Mix the color with pure black, from 0 to 100.
      * Providing 0 will do nothing, providing 100 will always return black.
      * @param amount - valid between 1-100
      */
    def shade(): TinyColor_ = js.native
    def shade(amount: Double): TinyColor_ = js.native
    
    /**
      * Spin takes a positive or negative amount within [-360, 360] indicating the change of hue.
      * Values outside of this range will be wrapped into this range.
      */
    def spin(amount: Double): TinyColor_ = js.native
    
    def splitcomplement(): js.Array[TinyColor_] = js.native
    
    /**
      * Alias for `polyad(4)`
      */
    def tetrad(): js.Array[TinyColor_] = js.native
    
    /**
      * Mix the color with pure white, from 0 to 100.
      * Providing 0 will do nothing, providing 100 will always return white.
      * @param amount - valid between 1-100
      */
    def tint(): TinyColor_ = js.native
    def tint(amount: Double): TinyColor_ = js.native
    
    /**
      * Returns the hex value of the color.
      * @param allow3Char will shorten hex value to 3 char if possible
      */
    def toHex(): String = js.native
    def toHex(allow3Char: Boolean): String = js.native
    
    /**
      * Returns the hex 8 value of the color.
      * @param allow4Char will shorten hex value to 4 char if possible
      */
    def toHex8(): String = js.native
    def toHex8(allow4Char: Boolean): String = js.native
    
    /**
      * Returns the hex 8 value of the color -with a # appened.
      * @param allow4Char will shorten hex value to 4 char if possible
      */
    def toHex8String(): String = js.native
    def toHex8String(allow4Char: Boolean): String = js.native
    
    /**
      * Returns the hex value of the color -with a # appened.
      * @param allow3Char will shorten hex value to 3 char if possible
      */
    def toHexString(): String = js.native
    def toHexString(allow3Char: Boolean): String = js.native
    
    /**
      * Returns the object as a HSLA object.
      */
    def toHsl(): NumberifyHSLA = js.native
    
    /**
      * Returns the hsla values interpolated into a string with the following format:
      * "hsla(xxx, xxx, xxx, xx)".
      */
    def toHslString(): String = js.native
    
    /**
      * Returns the object as a HSVA object.
      */
    def toHsv(): NumberifyHSVA = js.native
    
    /**
      * Returns the hsva values interpolated into a string with the following format:
      * "hsva(xxx, xxx, xxx, xx)".
      */
    def toHsvString(): String = js.native
    
    /**
      * The 'real' name of the color -if there is one.
      */
    def toName(): String | `false` = js.native
    
    def toNumber(): Double = js.native
    
    /**
      * Returns the object as a RGBA object.
      */
    def toPercentageRgb(): RGBA = js.native
    
    /**
      * Returns the RGBA relative values interpolated into a string
      */
    def toPercentageRgbString(): String = js.native
    
    /**
      * Returns the object as a RGBA object.
      */
    def toRgb(): NumberifyRGBA = js.native
    
    /**
      * Returns the RGBA values interpolated into a string with the following format:
      * "RGBA(xxx, xxx, xxx, xx)".
      */
    def toRgbString(): String = js.native
    
    /**
      * String representation of the color.
      *
      * @param format - The format to be used when displaying the string representation.
      */
    def toString[T /* <: name */](format: T): Boolean | String = js.native
    @JSName("toString")
    def toString_T_ColorFormats_String[T /* <: ColorFormats */](format: T): String = js.native
    
    /**
      * Alias for `polyad(3)`
      */
    def triad(): js.Array[TinyColor_] = js.native
  }
  
  inline def tinycolor(): TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")().asInstanceOf[TinyColor_]
  inline def tinycolor(color: Unit, opts: PartialTinyColorOptions): TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TinyColor_]
  inline def tinycolor(color: ColorInput): TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any]).asInstanceOf[TinyColor_]
  inline def tinycolor(color: ColorInput, opts: PartialTinyColorOptions): TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TinyColor_]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ctrlTinycolor.ctrlTinycolorStrings.rgb
    - typings.ctrlTinycolor.ctrlTinycolorStrings.prgb
    - typings.ctrlTinycolor.ctrlTinycolorStrings.hex
    - typings.ctrlTinycolor.ctrlTinycolorStrings.hex3
    - typings.ctrlTinycolor.ctrlTinycolorStrings.hex4
    - typings.ctrlTinycolor.ctrlTinycolorStrings.hex6
    - typings.ctrlTinycolor.ctrlTinycolorStrings.hex8
    - typings.ctrlTinycolor.ctrlTinycolorStrings.name
    - typings.ctrlTinycolor.ctrlTinycolorStrings.hsl
    - typings.ctrlTinycolor.ctrlTinycolorStrings.hsv
  */
  trait ColorFormats extends StObject
  object ColorFormats {
    
    inline def hex: typings.ctrlTinycolor.ctrlTinycolorStrings.hex = "hex".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.hex]
    
    inline def hex3: typings.ctrlTinycolor.ctrlTinycolorStrings.hex3 = "hex3".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.hex3]
    
    inline def hex4: typings.ctrlTinycolor.ctrlTinycolorStrings.hex4 = "hex4".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.hex4]
    
    inline def hex6: typings.ctrlTinycolor.ctrlTinycolorStrings.hex6 = "hex6".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.hex6]
    
    inline def hex8: typings.ctrlTinycolor.ctrlTinycolorStrings.hex8 = "hex8".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.hex8]
    
    inline def hsl: typings.ctrlTinycolor.ctrlTinycolorStrings.hsl = "hsl".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.hsl]
    
    inline def hsv: typings.ctrlTinycolor.ctrlTinycolorStrings.hsv = "hsv".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.hsv]
    
    inline def name: typings.ctrlTinycolor.ctrlTinycolorStrings.name = "name".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.name]
    
    inline def prgb: typings.ctrlTinycolor.ctrlTinycolorStrings.prgb = "prgb".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.prgb]
    
    inline def rgb: typings.ctrlTinycolor.ctrlTinycolorStrings.rgb = "rgb".asInstanceOf[typings.ctrlTinycolor.ctrlTinycolorStrings.rgb]
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.ctrlTinycolor.interfacesMod.RGB
    - typings.ctrlTinycolor.interfacesMod.RGBA
    - typings.ctrlTinycolor.interfacesMod.HSL
    - typings.ctrlTinycolor.interfacesMod.HSLA
    - typings.ctrlTinycolor.interfacesMod.HSV
    - typings.ctrlTinycolor.interfacesMod.HSVA
    - typings.ctrlTinycolor.distMod.TinyColor_
  */
  type ColorInput = _ColorInput | String | Double
  
  trait TinyColorOptions extends StObject {
    
    var format: String
    
    var gradientType: String
  }
  object TinyColorOptions {
    
    inline def apply(format: String, gradientType: String): TinyColorOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinyColorOptions]
    }
    
    extension [Self <: TinyColorOptions](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setGradientType(value: String): Self = StObject.set(x, "gradientType", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ColorInput extends StObject
}
