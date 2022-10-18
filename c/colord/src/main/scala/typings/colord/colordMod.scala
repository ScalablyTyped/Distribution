package typings.colord

import typings.colord.pluginsA11yMod.ReadabilityOptions
import typings.colord.pluginsA11yMod.colordColordAugmentingMod.Colord
import typings.colord.pluginsHarmoniesMod.HarmonyType
import typings.colord.pluginsMinifyMod.MinificationOptions
import typings.colord.pluginsNamesMod.ConvertOptions
import typings.colord.typesMod.AnyColor
import typings.colord.typesMod.CmykaColor
import typings.colord.typesMod.HslaColor
import typings.colord.typesMod.HsvaColor
import typings.colord.typesMod.HwbaColor
import typings.colord.typesMod.LabaColor
import typings.colord.typesMod.LchaColor
import typings.colord.typesMod.RgbaColor
import typings.colord.typesMod.XyzaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colordMod {
  
  @JSImport("colord/colord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("colord/colord", "Colord")
  @js.native
  open class Colord_ protected () extends StObject {
    def this(input: AnyColor) = this()
    
    /**
      * Allows to get or change an alpha channel value.
      */
    def alpha(): Double = js.native
    def alpha(value: Double): Colord_ = js.native
    
    /**
      * Returns the brightness of a color (from 0 to 1).
      * The calculation logic is modified from WCAG.
      * https://www.w3.org/TR/AERT/#color-contrast
      */
    def brightness(): Double = js.native
    
    /**
      * Calculates a contrast ratio for a color pair.
      * This luminance difference is expressed as a ratio ranging
      * from 1 (e.g. white on white) to 21 (e.g., black on a white).
      * WCAG requires a ratio of at least 4.5 for normal text and 3 for large text.
      * https://www.w3.org/TR/UNDERSTANDING-WCAG20/visual-audio-contrast-contrast.html
      * https://webaim.org/articles/contrast/
      */
    def contrast(): Double = js.native
    def contrast(color2: Colord): Double = js.native
    def contrast(color2: AnyColor): Double = js.native
    
    /**
      * Increases the HSL lightness of a color by the given amount.
      */
    def darken(): Colord_ = js.native
    def darken(amount: Double): Colord_ = js.native
    
    /**
      * Calculates the perceived color difference for two colors according to
      * [Delta E2000](https://en.wikipedia.org/wiki/Color_difference#CIEDE2000).
      * Returns a value in [0, 1] range.
      */
    def delta(): Double = js.native
    def delta(color: typings.colord.pluginsLabMod.colordColordAugmentingMod.Colord): Double = js.native
    def delta(color: AnyColor): Double = js.native
    
    /**
      * Decreases the HSL saturation of a color by the given amount.
      */
    def desaturate(): Colord_ = js.native
    def desaturate(amount: Double): Colord_ = js.native
    
    /**
      * Makes a gray color with the same lightness as a source color.
      */
    def grayscale(): Colord_ = js.native
    
    /**
      * Returns an array of harmony colors as `Colord` instances.
      */
    def harmonies(): js.Array[typings.colord.pluginsHarmoniesMod.colordColordAugmentingMod.Colord] = js.native
    def harmonies(`type`: HarmonyType): js.Array[typings.colord.pluginsHarmoniesMod.colordColordAugmentingMod.Colord] = js.native
    
    /**
      * Allows to get or change a hue value.
      */
    def hue(): Double = js.native
    def hue(value: Double): Colord_ = js.native
    
    /**
      * Creates a new instance containing an inverted (opposite) version of the color.
      */
    def invert(): Colord_ = js.native
    
    /**
      * Same as calling `brightness() < 0.5`.
      */
    def isDark(): Boolean = js.native
    
    def isEqual(color: Colord_): Boolean = js.native
    /**
      * Determines whether two values are the same color.
      */
    def isEqual(color: AnyColor): Boolean = js.native
    
    /**
      * Same as calling `brightness() >= 0.5`.
      * */
    def isLight(): Boolean = js.native
    
    /**
      * Checks that a background and text color pair conforms to WCAG 2.0 requirements.
      * https://www.w3.org/TR/UNDERSTANDING-WCAG20/visual-audio-contrast-contrast.html
      */
    def isReadable(): Boolean = js.native
    def isReadable(color2: Unit, options: ReadabilityOptions): Boolean = js.native
    def isReadable(color2: Colord): Boolean = js.native
    def isReadable(color2: Colord, options: ReadabilityOptions): Boolean = js.native
    def isReadable(color2: AnyColor): Boolean = js.native
    def isReadable(color2: AnyColor, options: ReadabilityOptions): Boolean = js.native
    
    /**
      * Returns a boolean indicating whether or not an input has been parsed successfully.
      * Note: If parsing is unsuccessful, Colord defaults to black (does not throws an error).
      */
    def isValid(): Boolean = js.native
    
    /**
      * Increases the HSL lightness of a color by the given amount.
      */
    def lighten(): Colord_ = js.native
    def lighten(amount: Double): Colord_ = js.native
    
    /**
      * Returns the relative luminance of a color,
      * normalized to 0 for darkest black and 1 for lightest white.
      * https://www.w3.org/TR/WCAG20/#relativeluminancedef
      * https://developer.mozilla.org/en-US/docs/Web/Accessibility/Understanding_Colors_and_Luminance
      */
    def luminance(): Double = js.native
    
    /** Returns the shortest string representation of the color */
    def minify(): String = js.native
    def minify(options: MinificationOptions): String = js.native
    
    def mix(color2: typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord): typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord = js.native
    def mix(color2: typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord, ratio: Double): typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord = js.native
    /**
      * Produces a mixture of two colors through CIE LAB color space and returns a new Colord instance.
      */
    def mix(color2: AnyColor): typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord = js.native
    def mix(color2: AnyColor, ratio: Double): typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord = js.native
    
    /* private */ val parsed: Any = js.native
    
    val rgba: RgbaColor = js.native
    
    /**
      * Changes the HSL hue of a color by the given amount.
      */
    def rotate(): Colord_ = js.native
    def rotate(amount: Double): Colord_ = js.native
    
    /**
      * Increases the HSL saturation of a color by the given amount.
      */
    def saturate(): Colord_ = js.native
    def saturate(amount: Double): Colord_ = js.native
    
    /**
      * Generates a shades palette based on original color.
      */
    def shades(): js.Array[typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord] = js.native
    def shades(count: Double): js.Array[typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord] = js.native
    
    /**
      * Generates a tints palette based on original color.
      */
    def tints(): js.Array[typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord] = js.native
    def tints(count: Double): js.Array[typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord] = js.native
    
    /**
      * Converts a color to CMYK color space and returns an object.
      * https://drafts.csswg.org/css-color/#cmyk-colors
      * https://lea.verou.me/2009/03/cmyk-colors-in-css-useful-or-useless/
      */
    def toCmyk(): CmykaColor = js.native
    
    /**
      * Converts a color to CMYK color space and returns a string.
      * https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/device-cmyk()
      */
    def toCmykString(): String = js.native
    
    /**
      * Returns the hexadecimal representation of a color.
      * When the alpha channel value of the color is less than 1,
      * it outputs #rrggbbaa format instead of #rrggbb.
      */
    def toHex(): String = js.native
    
    /**
      * Converts a color to HSL color space and returns an object.
      * Always includes an alpha value from 0 to 1.
      */
    def toHsl(): HslaColor = js.native
    
    /**
      * Converts a color to HSL color space and returns a string representation.
      * Always includes an alpha value from 0 to 1.
      */
    def toHslString(): String = js.native
    
    /**
      * Converts a color to HSV color space and returns an object.
      * Always includes an alpha value from 0 to 1.
      */
    def toHsv(): HsvaColor = js.native
    
    /**
      * Converts a color to HWB (Hue-Whiteness-Blackness) color space and returns an object.
      * https://en.wikipedia.org/wiki/HWB_color_model
      */
    def toHwb(): HwbaColor = js.native
    
    /**
      * Converts a color to HWB (Hue-Whiteness-Blackness) color space and returns a string.
      * https://www.w3.org/TR/css-color-4/#the-hwb-notation
      */
    def toHwbString(): String = js.native
    
    /**
      * Converts a color to CIELAB color space and returns an object.
      * The object always includes `alpha` value [0, 1].
      */
    def toLab(): LabaColor = js.native
    
    /**
      * Converts a color to CIELCH (Lightness-Chroma-Hue) color space and returns an object.
      * https://lea.verou.me/2020/04/lch-colors-in-css-what-why-and-how/
      * https://en.wikipedia.org/wiki/CIELAB_color_space#Cylindrical_model
      */
    def toLch(): LchaColor = js.native
    
    /**
      * Converts a color to CIELCH (Lightness-Chroma-Hue) color space and returns a string.
      * https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/lch()
      */
    def toLchString(): String = js.native
    
    /** Finds CSS color keyword that matches with the color value */
    def toName(): js.UndefOr[String] = js.native
    def toName(options: ConvertOptions): js.UndefOr[String] = js.native
    
    /**
      * Converts a color to RGB color space and returns an object.
      * Always includes an alpha value from 0 to 1.
      */
    def toRgb(): RgbaColor = js.native
    
    /**
      * Converts a color to RGB color space and returns a string representation.
      * Outputs an alpha value only if it is less than 1.
      */
    def toRgbString(): String = js.native
    
    def toXyz(): XyzaColor = js.native
    
    /**
      * Generates a tones palette based on original color.
      */
    def tones(): js.Array[typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord] = js.native
    def tones(count: Double): js.Array[typings.colord.pluginsMixMod.colordColordAugmentingMod.Colord] = js.native
  }
  
  inline def colord(input: Colord_): Colord_ = ^.asInstanceOf[js.Dynamic].applyDynamic("colord")(input.asInstanceOf[js.Any]).asInstanceOf[Colord_]
  inline def colord(input: AnyColor): Colord_ = ^.asInstanceOf[js.Dynamic].applyDynamic("colord")(input.asInstanceOf[js.Any]).asInstanceOf[Colord_]
}
