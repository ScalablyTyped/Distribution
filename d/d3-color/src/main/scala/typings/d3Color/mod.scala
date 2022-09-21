package typings.d3Color

import typings.d3Color.anon.A
import typings.d3Color.anon.B
import typings.d3Color.anon.C
import typings.d3Color.anon.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-color", "color")
  @js.native
  val color: ColorFactory = js.native
  
  @JSImport("d3-color", "cubehelix")
  @js.native
  val cubehelix: CubehelixColorFactory = js.native
  
  @JSImport("d3-color", "gray")
  @js.native
  val gray: GrayColorFactory = js.native
  
  @JSImport("d3-color", "hcl")
  @js.native
  val hcl: HCLColorFactory = js.native
  
  @JSImport("d3-color", "hsl")
  @js.native
  val hsl: HSLColorFactory = js.native
  
  @JSImport("d3-color", "lab")
  @js.native
  val lab: LabColorFactory = js.native
  
  @JSImport("d3-color", "lch")
  @js.native
  val lch: LCHColorFactory = js.native
  
  @JSImport("d3-color", "rgb")
  @js.native
  val rgb: RGBColorFactory = js.native
  
  @js.native
  trait ColorCommonInstance extends StObject {
    
    /**
      * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
      * If k is not specified, it defaults to 1. The behavior of this method is dependent on the implementing color space.
      *
      * @param k A color space dependent number to determine, how much brighter the returned color should be.
      */
    def brighter(): this.type = js.native
    def brighter(k: Double): this.type = js.native
    
    /**
      * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
      * If k is not specified, it defaults to 1. The behavior of this method is dependent on the implementing color space.
      *
      * @param k A color space dependent number to determine, how much darker the returned color should be.
      */
    def darker(): this.type = js.native
    def darker(k: Double): this.type = js.native
    
    /**
      * Returns true if and only if the color is displayable on standard hardware.
      * For example, this returns false for an RGB color if any channel value is less than zero or greater than 255, or if the opacity is not in the range [0, 1].
      */
    def displayable(): Boolean = js.native
    
    /**
      * Returns a hexadecimal string representing this color.
      * If this color is not displayable, a suitable displayable color is returned instead.
      * For example, RGB channel values greater than 255 are clamped to 255.
      */
    def hex(): String = js.native
    
    /**
      * Returns the RGB equivalent of this color. For RGB colors, that’s "this".
      */
    def rgb(): RGBColor = js.native
  }
  
  @js.native
  trait ColorFactory
    extends js.Function {
    
    def apply(color: ColorCommonInstance): RGBColor | HSLColor = js.native
    /**
      * Converts the provided color instance and returns an RGB or HSL color.
      *
      * @param color A permissible color space instance.
      */
    def apply(color: ColorSpaceObject): RGBColor | HSLColor = js.native
    /**
      * Parses the specified CSS Color Module Level 3 specifier string, returning an RGB or HSL color.
      * If the specifier was not valid, null is returned.
      *
      * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
      */
    def apply(cssColorSpecifier: String): RGBColor | HSLColor | Null = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.d3Color.mod.RGBColor
    - typings.d3Color.mod.HSLColor
    - typings.d3Color.mod.LabColor
    - typings.d3Color.mod.HCLColor
    - typings.d3Color.mod.CubehelixColor
  */
  trait ColorSpaceObject extends StObject
  
  trait Color_ extends StObject {
    
    /**
      * Returns true if and only if the color is displayable on standard hardware.
      * For example, this returns false for an RGB color if any channel value is less than zero or greater than 255, or if the opacity is not in the range [0, 1].
      */
    def displayable(): Boolean
    
    // Note: While this method is used in prototyping for colors of specific colorspaces, it should not be called directly, as 'this.rgb' would not be implemented on Color
    /**
      * Returns a hexadecimal string representing this color in RGB space, such as #f7eaba.
      * If this color is not displayable, a suitable displayable color is returned instead.
      * For example, RGB channel values greater than 255 are clamped to 255.
      */
    def formatHex(): String
    
    /**
      * Returns a hexadecimal string representing this color in RGBA space, such as #f7eaba90.
      * If this color is not displayable, a suitable displayable color is returned instead.
      * For example, RGB channel values greater than 255 are clamped to 255.
      */
    def formatHex8(): String
    
    /**
      * Returns a string representing this color according to the CSS Color Module Level 3 specification, such as hsl(257, 50%, 80%) or hsla(257, 50%, 80%, 0.2).
      * If this color is not displayable, a suitable displayable color is returned instead by clamping S and L channel values to the interval [0, 100].
      */
    def formatHsl(): String
    
    /**
      * Returns a string representing this color according to the CSS Object Model specification, such as rgb(247, 234, 186) or rgba(247, 234, 186, 0.2).
      * If this color is not displayable, a suitable displayable color is returned instead by clamping RGB channel values to the interval [0, 255].
      */
    def formatRgb(): String
    
    /**
      * @deprecated Use color.formatHex.
      */
    def hex(): String
  }
  object Color_ {
    
    inline def apply(
      displayable: () => Boolean,
      formatHex: () => String,
      formatHex8: () => String,
      formatHsl: () => String,
      formatRgb: () => String,
      hex: () => String
    ): Color_ = {
      val __obj = js.Dynamic.literal(displayable = js.Any.fromFunction0(displayable), formatHex = js.Any.fromFunction0(formatHex), formatHex8 = js.Any.fromFunction0(formatHex8), formatHsl = js.Any.fromFunction0(formatHsl), formatRgb = js.Any.fromFunction0(formatRgb), hex = js.Any.fromFunction0(hex))
      __obj.asInstanceOf[Color_]
    }
    
    extension [Self <: Color_](x: Self) {
      
      inline def setDisplayable(value: () => Boolean): Self = StObject.set(x, "displayable", js.Any.fromFunction0(value))
      
      inline def setFormatHex(value: () => String): Self = StObject.set(x, "formatHex", js.Any.fromFunction0(value))
      
      inline def setFormatHex8(value: () => String): Self = StObject.set(x, "formatHex8", js.Any.fromFunction0(value))
      
      inline def setFormatHsl(value: () => String): Self = StObject.set(x, "formatHsl", js.Any.fromFunction0(value))
      
      inline def setFormatRgb(value: () => String): Self = StObject.set(x, "formatRgb", js.Any.fromFunction0(value))
      
      inline def setHex(value: () => String): Self = StObject.set(x, "hex", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CubehelixColor
    extends StObject
       with Color_
       with ColorSpaceObject {
    
    /**
      * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much brighter the returned color should be.
      */
    def brighter(): this.type = js.native
    def brighter(k: Double): this.type = js.native
    
    /**
      * Returns a copy of this color.
      *
      * @param values If values is specified, any enumerable own properties of values are assigned to the new returned color.
      */
    def copy(): this.type = js.native
    def copy(values: H): this.type = js.native
    
    /**
      * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much darker the returned color should be.
      */
    def darker(): this.type = js.native
    def darker(k: Double): this.type = js.native
    
    /**
      * Hue channel value.
      */
    var h: Double = js.native
    
    /**
      * Lightness channel value.
      */
    var l: Double = js.native
    
    /**
      * Opacity value.
      */
    var opacity: Double = js.native
    
    /**
      * Returns the RGB color equivalent of this color.
      */
    def rgb(): RGBColor = js.native
    
    /**
      * Saturation channel value.
      */
    var s: Double = js.native
  }
  
  @js.native
  trait CubehelixColorFactory
    extends js.Function {
    
    def apply(color: ColorCommonInstance): CubehelixColor = js.native
    /**
      * Converts the provided color instance and returns a Cubehelix color.
      * The color instance is specified, it is converted to the RGB color space using color.rgb and then converted to Cubehelix.
      * (Colors already in the Cubehelix color space skip the conversion to RGB.)
      *
      * @param color A permissible color space instance.
      */
    // tslint:disable-next-line:unified-signatures
    def apply(color: ColorSpaceObject): CubehelixColor = js.native
    /**
      * Parses the specified CSS Color Module Level 3 specifier string, returning an Cubehelix color.
      * If the specifier was not valid, null is returned.
      *
      * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
      */
    def apply(cssColorSpecifier: String): CubehelixColor = js.native
    /**
      * Constructs a new Cubehelix color based on the specified channel values and opacity.
      *
      * @param h Hue channel value.
      * @param s Saturation channel value.
      * @param l Lightness channel value.
      * @param opacity Optional opacity value, defaults to 1.
      */
    def apply(h: Double, s: Double, l: Double): CubehelixColor = js.native
    def apply(h: Double, s: Double, l: Double, opacity: Double): CubehelixColor = js.native
  }
  
  type GrayColorFactory = /**
    * Constructs a new CIELAB color with the specified l value and a = b = 0.
    *
    * @param l Lightness typically in the range [0, 100].
    * @param opacity Optional opacity value, defaults to 1.
    */
  js.Function2[/* l */ Double, /* opacity */ js.UndefOr[Double], LabColor]
  
  @js.native
  trait HCLColor
    extends StObject
       with Color_
       with ColorSpaceObject {
    
    /**
      * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much brighter the returned color should be.
      */
    def brighter(): this.type = js.native
    def brighter(k: Double): this.type = js.native
    
    /**
      * Chroma channel value typically in [0, 230].
      */
    var c: Double = js.native
    
    /**
      * Returns a copy of this color.
      *
      * @param values If values is specified, any enumerable own properties of values are assigned to the new returned color.
      */
    def copy(): this.type = js.native
    def copy(values: C): this.type = js.native
    
    /**
      * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much darker the returned color should be.
      */
    def darker(): this.type = js.native
    def darker(k: Double): this.type = js.native
    
    /**
      * Hue channel value typically in [0, 360).
      */
    var h: Double = js.native
    
    /**
      * Luminance channel value typically in the range [0, 100].
      */
    var l: Double = js.native
    
    /**
      * Opacity value
      */
    var opacity: Double = js.native
    
    /**
      * Returns the RGB color equivalent of this color.
      */
    def rgb(): RGBColor = js.native
  }
  
  @js.native
  trait HCLColorFactory
    extends js.Function {
    
    def apply(color: ColorCommonInstance): HCLColor = js.native
    /**
      * Converts the provided color instance and returns an HCL color.
      * The color instance is converted to the RGB color space using color.rgb and then converted to HCL.
      * (Colors already in the HCL color space skip the conversion to RGB,
      * and colors in the Lab color space are converted directly to HCL.)
      *
      * @param color A permissible color space instance.
      */
    // tslint:disable-next-line:unified-signatures
    def apply(color: ColorSpaceObject): HCLColor = js.native
    /**
      * Parses the specified CSS Color Module Level 3 specifier string, returning an HCL color.
      * If the specifier was not valid, null is returned.
      *
      * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
      */
    def apply(cssColorSpecifier: String): HCLColor = js.native
    /**
      * Constructs a new HCL color based on the specified channel values and opacity.
      *
      * @param h Hue channel value typically in [0, 360).
      * @param c Chroma channel value typically in [0, 230].
      * @param l Luminance channel value typically in the range [0, 100].
      * @param opacity Optional opacity value, defaults to 1.
      */
    def apply(h: Double, c: Double, l: Double): HCLColor = js.native
    def apply(h: Double, c: Double, l: Double, opacity: Double): HCLColor = js.native
  }
  
  @js.native
  trait HSLColor
    extends StObject
       with Color_
       with ColorSpaceObject {
    
    /**
      * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much brighter the returned color should be.
      */
    def brighter(): this.type = js.native
    def brighter(k: Double): this.type = js.native
    
    /**
      * Returns a new HSL color where the h channel is clamped to the range [0, 360), and the s, l, and opacity channels are clamped to the range [0, 1].
      */
    def clamp(): this.type = js.native
    
    /**
      * Returns a copy of this color.
      *
      * @param values If values is specified, any enumerable own properties of values are assigned to the new returned color.
      */
    def copy(): this.type = js.native
    def copy(values: H): this.type = js.native
    
    /**
      * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much darker the returned color should be.
      */
    def darker(): this.type = js.native
    def darker(k: Double): this.type = js.native
    
    /**
      * Hue channel value.
      */
    var h: Double = js.native
    
    /**
      * Lightness channel value.
      */
    var l: Double = js.native
    
    /**
      * Opacity value.
      */
    var opacity: Double = js.native
    
    /**
      * Returns the RGB color equivalent of this color.
      */
    def rgb(): RGBColor = js.native
    
    /**
      * Saturation channel value.
      */
    var s: Double = js.native
  }
  
  @js.native
  trait HSLColorFactory
    extends js.Function {
    
    def apply(color: ColorCommonInstance): HSLColor = js.native
    /**
      * Converts the provided color instance and returns an HSL color.
      * The color instance is converted to the RGB color space using color.rgb and then converted to HSL.
      * (Colors already in the HSL color space skip the conversion to RGB.)
      *
      * @param color A permissible color space instance.
      */
    // tslint:disable-next-line:unified-signatures
    def apply(color: ColorSpaceObject): HSLColor = js.native
    /**
      * Parses the specified CSS Color Module Level 3 specifier string, returning an HSL color.
      * If the specifier was not valid, null is returned.
      *
      * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
      */
    def apply(cssColorSpecifier: String): HSLColor = js.native
    /**
      * Constructs a new HSL color based on the specified channel values and opacity.
      *
      * @param h Hue channel value.
      * @param s Saturation channel value.
      * @param l Lightness channel value.
      * @param opacity Optional opacity value, defaults to 1.
      */
    def apply(h: Double, s: Double, l: Double): HSLColor = js.native
    def apply(h: Double, s: Double, l: Double, opacity: Double): HSLColor = js.native
  }
  
  @js.native
  trait LCHColorFactory extends StObject {
    
    def apply(color: ColorCommonInstance): HCLColor = js.native
    /**
      * Converts the provided color instance and returns an HCL color.
      * The color instance is converted to the RGB color space using color.rgb and then converted to HCL.
      * (Colors already in the HCL color space skip the conversion to RGB,
      * and colors in the Lab color space are converted directly to HCL.)
      *
      * @param color A permissible color space instance.
      */
    // tslint:disable-next-line:unified-signatures
    def apply(color: ColorSpaceObject): HCLColor = js.native
    /**
      * Parses the specified CSS Color Module Level 3 specifier string, returning an HCL color.
      * If the specifier was not valid, null is returned.
      *
      * @param cssColorSpecifier A CSS color Module Level 3 specifier string.
      */
    def apply(cssColorSpecifier: String): HCLColor = js.native
    /**
      * Constructs a new HCL color based on the specified channel values and opacity.
      *
      * @param l Luminance channel value typically in the range [0, 100].
      * @param c Chroma channel value typically in [0, 230].
      * @param h Hue channel value typically in [0, 360).
      * @param opacity Optional opacity value, defaults to 1.
      */
    def apply(l: Double, c: Double, h: Double): HCLColor = js.native
    def apply(l: Double, c: Double, h: Double, opacity: Double): HCLColor = js.native
  }
  
  @js.native
  trait LabColor
    extends StObject
       with Color_
       with ColorSpaceObject {
    
    /**
      * Position between red/magenta and green typically in [-160, +160].
      */
    var a: Double = js.native
    
    /**
      * Position between yellow and blue typically in [-160, +160].
      */
    var b: Double = js.native
    
    /**
      * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much brighter the returned color should be.
      */
    def brighter(): this.type = js.native
    def brighter(k: Double): this.type = js.native
    
    /**
      * Returns a copy of this color.
      *
      * @param values If values is specified, any enumerable own properties of values are assigned to the new returned color.
      */
    def copy(): this.type = js.native
    def copy(values: A): this.type = js.native
    
    /**
      * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much darker the returned color should be.
      */
    def darker(): this.type = js.native
    def darker(k: Double): this.type = js.native
    
    /**
      * Lightness typically in the range [0, 100].
      */
    var l: Double = js.native
    
    /**
      * Opacity value
      */
    var opacity: Double = js.native
    
    /**
      * Returns the RGB color equivalent of this color.
      */
    def rgb(): RGBColor = js.native
  }
  
  @js.native
  trait LabColorFactory
    extends js.Function {
    
    def apply(color: ColorCommonInstance): LabColor = js.native
    /**
      * Converts the provided color instance and returns a Lab color.
      * The color instance is converted to the RGB color space using color.rgb and then converted to CIELAB.
      * (Colors already in the Lab color space skip the conversion to RGB,
      * and colors in the HCL color space are converted directly to CIELAB.)
      *
      * @param color A permissible color space instance.
      */
    // tslint:disable-next-line:unified-signatures
    def apply(color: ColorSpaceObject): LabColor = js.native
    /**
      * Parses the specified CSS Color Module Level 3 specifier string, returning a Lab color.
      * If the specifier was not valid, null is returned.
      *
      * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
      */
    def apply(cssColorSpecifier: String): LabColor = js.native
    /**
      * Constructs a new CIELAB color based on the specified channel values and opacity.
      *
      * @param l Lightness typically in the range [0, 100].
      * @param a Position between red/magenta and green typically in [-160, +160].
      * @param b Position between yellow and blue typically in [-160, +160].
      * @param opacity Optional opacity value, defaults to 1.
      */
    def apply(l: Double, a: Double, b: Double): LabColor = js.native
    def apply(l: Double, a: Double, b: Double, opacity: Double): LabColor = js.native
  }
  
  @js.native
  trait RGBColor
    extends StObject
       with Color_
       with ColorSpaceObject {
    
    /**
      * Value of blue channel
      */
    var b: Double = js.native
    
    /**
      * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much brighter the returned color should be.
      */
    def brighter(): this.type = js.native
    def brighter(k: Double): this.type = js.native
    
    /**
      * Returns a new RGB color where the r, g, and b channels are clamped to the range [0, 255] and rounded to the nearest integer value,
      * and the opacity is clamped to the range [0, 1].
      */
    def clamp(): this.type = js.native
    
    /**
      * Returns a copy of this color.
      *
      * @param values If values is specified, any enumerable own properties of values are assigned to the new returned color.
      */
    def copy(): this.type = js.native
    def copy(values: B): this.type = js.native
    
    /**
      * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
      * If k is not specified, it defaults to 1.
      *
      * @param k A color space dependent number to determine, how much darker the returned color should be.
      */
    def darker(): this.type = js.native
    def darker(k: Double): this.type = js.native
    
    /**
      * Value of green channel
      */
    var g: Double = js.native
    
    /**
      * Opacity value
      */
    var opacity: Double = js.native
    
    /**
      * Value of red channel
      */
    var r: Double = js.native
    
    /**
      * Returns the RGB equivalent of this color.
      */
    def rgb(): this.type = js.native
  }
  
  @js.native
  trait RGBColorFactory
    extends js.Function {
    
    def apply(color: ColorCommonInstance): RGBColor = js.native
    /**
      * Converts the provided color instance and returns an RGB color. The color instance is converted to the RGB color space using color.rgb.
      * Note that unlike color.rgb this method always returns a new instance, even if color is already an RGB color.
      *
      * @param color A permissible color space instance.
      */
    // tslint:disable-next-line:unified-signatures
    def apply(color: ColorSpaceObject): RGBColor = js.native
    /**
      * Parses the specified CSS Color Module Level 3 specifier string, returning an RGB color.
      * If the specifier was not valid, null is returned.
      *
      * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
      */
    def apply(cssColorSpecifier: String): RGBColor = js.native
    /**
      * Constructs a new RGB color based on the specified channel values and opacity.
      *
      * @param r Red channel value.
      * @param g Green channel value.
      * @param b Blue channel value.
      * @param opacity Optional opacity value, defaults to 1.
      */
    def apply(r: Double, g: Double, b: Double): RGBColor = js.native
    def apply(r: Double, g: Double, b: Double, opacity: Double): RGBColor = js.native
  }
}
