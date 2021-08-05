package typings.chromaJs

import org.scalablytyped.runtime.Shortcut
import typings.chromaJs.anon.Accent
import typings.chromaJs.anon.Call
import typings.chromaJs.chromaJsStrings.alpha
import typings.chromaJs.chromaJsStrings.auto
import typings.chromaJs.chromaJsStrings.brighten
import typings.chromaJs.chromaJsStrings.burn
import typings.chromaJs.chromaJsStrings.cmyk
import typings.chromaJs.chromaJsStrings.darken
import typings.chromaJs.chromaJsStrings.desaturate
import typings.chromaJs.chromaJsStrings.dodge
import typings.chromaJs.chromaJsStrings.e
import typings.chromaJs.chromaJsStrings.gl
import typings.chromaJs.chromaJsStrings.hcl
import typings.chromaJs.chromaJsStrings.hex
import typings.chromaJs.chromaJsStrings.hsi
import typings.chromaJs.chromaJsStrings.hsl
import typings.chromaJs.chromaJsStrings.hsv
import typings.chromaJs.chromaJsStrings.k
import typings.chromaJs.chromaJsStrings.l
import typings.chromaJs.chromaJsStrings.lab
import typings.chromaJs.chromaJsStrings.lch
import typings.chromaJs.chromaJsStrings.lighten
import typings.chromaJs.chromaJsStrings.luminance
import typings.chromaJs.chromaJsStrings.multiply
import typings.chromaJs.chromaJsStrings.name
import typings.chromaJs.chromaJsStrings.overlay
import typings.chromaJs.chromaJsStrings.q
import typings.chromaJs.chromaJsStrings.rgb
import typings.chromaJs.chromaJsStrings.rgba
import typings.chromaJs.chromaJsStrings.saturate
import typings.chromaJs.chromaJsStrings.screen
import typings.chromaJs.chromaJsStrings.temperature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chroma-js", JSImport.Namespace)
  @js.native
  val ^ : ChromaStatic = js.native
  
  @js.native
  trait ChromaStatic extends StObject {
    
    /**
      * Create a color in the specified color space using a, b and c as values.
      *
      * @param colorSpace The color space to use. Defaults to "rgb".
      * @return the color object.
      */
    def apply(a: Double, b: Double, c: Double): Color = js.native
    def apply(
      a: Double,
      b: Double,
      c: Double,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Color = js.native
    def apply(a: Double, b: Double, c: Double, d: Double): Color = js.native
    def apply(
      a: Double,
      b: Double,
      c: Double,
      d: Double,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Color = js.native
    /**
      * Creates a color from a string representation (as supported in CSS).
      * Creates a color from a number representation [0; 16777215]
      *
      * @param color The string to convert to a color.
      * @return the color object.
      */
    def apply(color: String): Color = js.native
    def apply(color: Double): Color = js.native
    /**
      * Create a color in the specified color space using values.
      *
      * @param values An array of values (e.g. [r, g, b, a?]).
      * @param colorSpace The color space to use. Defaults to "rgb".
      * @return the color object.
      */
    def apply(values: js.Array[Double]): Color = js.native
    def apply(values: js.Array[Double], colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl): Color = js.native
    
    /**
      * Similar to {@link mix}, but accepts more than two colors. Simple averaging of R,G,B components and the alpha
      * channel.
      */
    def average(colors: js.Array[String | Color]): Color = js.native
    def average(colors: js.Array[String | Color], colorSpace: Unit, weights: js.Array[Double]): Color = js.native
    def average(colors: js.Array[String | Color], colorSpace: InterpolationMode): Color = js.native
    def average(colors: js.Array[String | Color], colorSpace: InterpolationMode, weights: js.Array[Double]): Color = js.native
    
    /**
      * Returns a function that
      * [bezier-interpolates]{@link https://www.vis4.net/blog/posts/mastering-multi-hued-color-scales/} between
      * colors in Lab space. The input range of the function is [0..1].
      * You can convert it to a scale instance by calling <code>chroma.bezier(...).scale()</code>
      */
    def bezier(colors: js.Array[String]): Call = js.native
    
    @JSName("blend")
    def blend_burn(color1: String, color2: String, blendMode: burn): Color = js.native
    @JSName("blend")
    def blend_burn(color1: String, color2: Color, blendMode: burn): Color = js.native
    @JSName("blend")
    def blend_burn(color1: Color, color2: String, blendMode: burn): Color = js.native
    @JSName("blend")
    def blend_burn(color1: Color, color2: Color, blendMode: burn): Color = js.native
    @JSName("blend")
    def blend_darken(color1: String, color2: String, blendMode: darken): Color = js.native
    @JSName("blend")
    def blend_darken(color1: String, color2: Color, blendMode: darken): Color = js.native
    @JSName("blend")
    def blend_darken(color1: Color, color2: String, blendMode: darken): Color = js.native
    @JSName("blend")
    def blend_darken(color1: Color, color2: Color, blendMode: darken): Color = js.native
    @JSName("blend")
    def blend_dodge(color1: String, color2: String, blendMode: dodge): Color = js.native
    @JSName("blend")
    def blend_dodge(color1: String, color2: Color, blendMode: dodge): Color = js.native
    @JSName("blend")
    def blend_dodge(color1: Color, color2: String, blendMode: dodge): Color = js.native
    @JSName("blend")
    def blend_dodge(color1: Color, color2: Color, blendMode: dodge): Color = js.native
    @JSName("blend")
    def blend_lighten(color1: String, color2: String, blendMode: lighten): Color = js.native
    @JSName("blend")
    def blend_lighten(color1: String, color2: Color, blendMode: lighten): Color = js.native
    @JSName("blend")
    def blend_lighten(color1: Color, color2: String, blendMode: lighten): Color = js.native
    @JSName("blend")
    def blend_lighten(color1: Color, color2: Color, blendMode: lighten): Color = js.native
    /**
      * Blends two colors using RGB channel-wise blend functions.
      */
    @JSName("blend")
    def blend_multiply(color1: String, color2: String, blendMode: multiply): Color = js.native
    @JSName("blend")
    def blend_multiply(color1: String, color2: Color, blendMode: multiply): Color = js.native
    @JSName("blend")
    def blend_multiply(color1: Color, color2: String, blendMode: multiply): Color = js.native
    @JSName("blend")
    def blend_multiply(color1: Color, color2: Color, blendMode: multiply): Color = js.native
    @JSName("blend")
    def blend_overlay(color1: String, color2: String, blendMode: overlay): Color = js.native
    @JSName("blend")
    def blend_overlay(color1: String, color2: Color, blendMode: overlay): Color = js.native
    @JSName("blend")
    def blend_overlay(color1: Color, color2: String, blendMode: overlay): Color = js.native
    @JSName("blend")
    def blend_overlay(color1: Color, color2: Color, blendMode: overlay): Color = js.native
    @JSName("blend")
    def blend_screen(color1: String, color2: String, blendMode: screen): Color = js.native
    @JSName("blend")
    def blend_screen(color1: String, color2: Color, blendMode: screen): Color = js.native
    @JSName("blend")
    def blend_screen(color1: Color, color2: String, blendMode: screen): Color = js.native
    @JSName("blend")
    def blend_screen(color1: Color, color2: Color, blendMode: screen): Color = js.native
    
    /**
      * chroma.brewer is an map of ColorBrewer scales that are included in chroma.js for convenience.
      * chroma.scale uses the colors to construct.
      */
    var brewer: Accent = js.native
    
    def cmyk(c: Double, m: Double, y: Double, k: Double): Color = js.native
    
    /**
      * Computes the WCAG contrast ratio between two colors.
      * A minimum contrast of 4.5:1 is recommended {@link https://www.w3.org/TR/WCAG20-TECHS/G18.html}
      * to ensure that text is still readable against a background color.
      */
    def contrast(color1: String, color2: String): Double = js.native
    def contrast(color1: String, color2: Color): Double = js.native
    def contrast(color1: Color, color2: String): Double = js.native
    def contrast(color1: Color, color2: Color): Double = js.native
    
    def css(col: String): Color = js.native
    
    def cubehelix(): Cubehelix = js.native
    
    /**
      * Computes color difference {@link https://en.wikipedia.org/wiki/Color_difference#CMC_l:c_.281984.29} as
      * developed by the Colour Measurement Committee of the Society of Dyers and Colourists (CMC) in 1984.
      * The implementation is adapted from Bruce Lindbloom.
      * {@link https://web.archive.org/web/20160306044036/http://www.brucelindbloom.com/javascript/ColorDiff.js}
      * The parameters L (default 1) and C (default 1) are weighting factors for lightness and chromacity.
      */
    def deltaE(color1: String, color2: String): Double = js.native
    def deltaE(color1: String, color2: String, L: Double): Double = js.native
    def deltaE(color1: String, color2: String, L: Double, C: Double): Double = js.native
    def deltaE(color1: String, color2: String, L: Unit, C: Double): Double = js.native
    def deltaE(color1: String, color2: Color): Double = js.native
    def deltaE(color1: String, color2: Color, L: Double): Double = js.native
    def deltaE(color1: String, color2: Color, L: Double, C: Double): Double = js.native
    def deltaE(color1: String, color2: Color, L: Unit, C: Double): Double = js.native
    def deltaE(color1: Color, color2: String): Double = js.native
    def deltaE(color1: Color, color2: String, L: Double): Double = js.native
    def deltaE(color1: Color, color2: String, L: Double, C: Double): Double = js.native
    def deltaE(color1: Color, color2: String, L: Unit, C: Double): Double = js.native
    def deltaE(color1: Color, color2: Color): Double = js.native
    def deltaE(color1: Color, color2: Color, L: Double): Double = js.native
    def deltaE(color1: Color, color2: Color, L: Double, C: Double): Double = js.native
    def deltaE(color1: Color, color2: Color, L: Unit, C: Double): Double = js.native
    
    /**
      * Computes the eucledian distance between two colors in a given color space (default is 'lab').
      * {@link https://en.wikipedia.org/wiki/Euclidean_distance#Three_dimensions}
      */
    def distance(color1: String, color2: String): Double = js.native
    def distance(
      color1: String,
      color2: String,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Double = js.native
    def distance(color1: String, color2: Color): Double = js.native
    def distance(
      color1: String,
      color2: Color,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Double = js.native
    def distance(color1: Color, color2: String): Double = js.native
    def distance(
      color1: Color,
      color2: String,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Double = js.native
    def distance(color1: Color, color2: Color): Double = js.native
    def distance(
      color1: Color,
      color2: Color,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Double = js.native
    
    /**
      * GL is a variant of RGB(A), with the only difference that the components are normalized to the range of 0..1.
      */
    def gl(red: Double, green: Double, blue: Double): Color = js.native
    def gl(red: Double, green: Double, blue: Double, alpha: Double): Color = js.native
    
    /**
      * Create a color from a hex or string representation (as supported in CSS).
      *
      * This is an alias of chroma.css().
      *
      * @param color The string to convert to a color.
      * @return the color object.
      */
    def hex(color: String): Color = js.native
    
    def hsl(h: Double, s: Double, l: Double): Color = js.native
    
    def hsv(h: Double, s: Double, v: Double): Color = js.native
    
    /**
      * Alias for {@see mix}.
      */
    def interpolate(color1: String, color2: String): Color = js.native
    def interpolate(color1: String, color2: String, f: Double): Color = js.native
    def interpolate(color1: String, color2: String, f: Double, colorSpace: InterpolationMode): Color = js.native
    def interpolate(color1: String, color2: String, f: Unit, colorSpace: InterpolationMode): Color = js.native
    def interpolate(color1: String, color2: Color): Color = js.native
    def interpolate(color1: String, color2: Color, f: Double): Color = js.native
    def interpolate(color1: String, color2: Color, f: Double, colorSpace: InterpolationMode): Color = js.native
    def interpolate(color1: String, color2: Color, f: Unit, colorSpace: InterpolationMode): Color = js.native
    def interpolate(color1: Color, color2: String): Color = js.native
    def interpolate(color1: Color, color2: String, f: Double): Color = js.native
    def interpolate(color1: Color, color2: String, f: Double, colorSpace: InterpolationMode): Color = js.native
    def interpolate(color1: Color, color2: String, f: Unit, colorSpace: InterpolationMode): Color = js.native
    def interpolate(color1: Color, color2: Color): Color = js.native
    def interpolate(color1: Color, color2: Color, f: Double): Color = js.native
    def interpolate(color1: Color, color2: Color, f: Double, colorSpace: InterpolationMode): Color = js.native
    def interpolate(color1: Color, color2: Color, f: Unit, colorSpace: InterpolationMode): Color = js.native
    
    def lab(lightness: Double, a: Double, b: Double): Color = js.native
    def lab(lightness: Double, a: Double, b: Double, alpha: Double): Color = js.native
    
    def lch(l: Double, c: Double, h: Double): Color = js.native
    
    /**
      * Helper function that computes class breaks based on data.
      * Mode:
      *  <li>equidistant <code>'e'</code> breaks are computed by dividing the total range of the data into n groups
      *  of equal size.
      *  <li>quantile <code>'q'</code> input domain is divided by quantile ranges.
      *  <li>logarithmic <code>'l'</code> breaks are equidistant breaks but on a logarithmic scale.
      *  <li>k-means <code>'k'</code> breaks use the 1-dimensional
      *  [k-means clustering algorithm]{@link https://en.wikipedia.org/wiki/K-means_clustering} to find (roughly) n
      *  groups of "similar" values. Note that this k-means implementation does not guarantee to find exactly n groups.
      */
    @JSName("limits")
    def limits_e(data: js.Array[Double], mode: e, c: Double): js.Array[Double] = js.native
    @JSName("limits")
    def limits_k(data: js.Array[Double], mode: k, c: Double): js.Array[Double] = js.native
    @JSName("limits")
    def limits_l(data: js.Array[Double], mode: l, c: Double): js.Array[Double] = js.native
    @JSName("limits")
    def limits_q(data: js.Array[Double], mode: q, c: Double): js.Array[Double] = js.native
    
    /**
      * Mixes two colors. The mix ratio is a value between 0 and 1.
      * The color mixing produces different results based the color space used for interpolation. Defaults to LRGB.
      * @example chroma.mix('red', 'blue', 0.25) // => #bf0040
      * @example chroma.mix('red', 'blue', 0.5, 'hsl') // => #ff00ff
      */
    def mix(color1: String, color2: String): Color = js.native
    def mix(color1: String, color2: String, f: Double): Color = js.native
    def mix(color1: String, color2: String, f: Double, colorSpace: InterpolationMode): Color = js.native
    def mix(color1: String, color2: String, f: Unit, colorSpace: InterpolationMode): Color = js.native
    def mix(color1: String, color2: Color): Color = js.native
    def mix(color1: String, color2: Color, f: Double): Color = js.native
    def mix(color1: String, color2: Color, f: Double, colorSpace: InterpolationMode): Color = js.native
    def mix(color1: String, color2: Color, f: Unit, colorSpace: InterpolationMode): Color = js.native
    def mix(color1: Color, color2: String): Color = js.native
    def mix(color1: Color, color2: String, f: Double): Color = js.native
    def mix(color1: Color, color2: String, f: Double, colorSpace: InterpolationMode): Color = js.native
    def mix(color1: Color, color2: String, f: Unit, colorSpace: InterpolationMode): Color = js.native
    def mix(color1: Color, color2: Color): Color = js.native
    def mix(color1: Color, color2: Color, f: Double): Color = js.native
    def mix(color1: Color, color2: Color, f: Double, colorSpace: InterpolationMode): Color = js.native
    def mix(color1: Color, color2: Color, f: Unit, colorSpace: InterpolationMode): Color = js.native
    
    /**
      * Returns a random color.
      */
    def random(): Color = js.native
    
    def rgb(r: Double, g: Double, b: Double): Color = js.native
    
    def scale(): Scale[Color] = js.native
    def scale(colors: js.Array[String | Color]): Scale[Color] = js.native
    def scale(name: String): Scale[Color] = js.native
    def scale(name: Color): Scale[Color] = js.native
    
    /**
      * Returns a color from the color temperature scale.
      * light 2000K, bright sunlight 6000K.
      * Based on Neil Bartlett's implementation.
      * https://github.com/neilbartlett/color-temperature
      */
    def temperature(t: Double): Color = js.native
    
    def valid(color: js.Any): Boolean = js.native
    def valid(color: js.Any, mode: String): Boolean = js.native
  }
  
  @js.native
  trait Color extends StObject {
    
    def alpha(): Double = js.native
    /**
      * Get and set the color opacity.
      */
    def alpha(a: Double): Color = js.native
    
    def brighten(): Color = js.native
    def brighten(f: Double): Color = js.native
    
    /**
      * Just like color.rgb but adds the alpha channel to the returned
      * array.
      *
      * @example
      * chroma('orange').rgba() === [255,165,0,1]
      * chroma('hsla(20, 100%, 40%, 0.5)').rgba() === [204,68,0,0.5]
      */
    def cmyk(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    /**
      * Returns a RGB() or HSL() string representation that can be used as CSS-color definition.
      * mode defaults to <code>'rgb'</code>
      */
    def css(): String = js.native
    @JSName("css")
    def css_hsl(mode: hsl): String = js.native
    
    def darken(): Color = js.native
    def darken(f: Double): Color = js.native
    
    /**
      * Similar to saturate, but the opposite direction.
      */
    def desaturate(): Color = js.native
    def desaturate(s: Double): Color = js.native
    
    /**
      * Returns a single channel value.
      * Also @see set
      */
    def get(modechan: String): Double = js.native
    
    /**
      * Returns an array with the cyan, magenta, yellow, and key (black)
      * components, each as a normalized value between 0 and 1.
      *
      * @example
      * chroma('33cc00').gl() === [0.2,0.8,0,1]
      */
    def gl(): js.Tuple4[Double, Double, Double, Double] = js.native
    
    /**
      * Alias of [lch](#color-lch), but with the components in reverse
      * order.
      *
      * @example
      * chroma('skyblue').hcl() === [235.11,25.94,79.21]
      */
    def hcl(): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Get color as hexadecimal string.
      *
      * @param mode `auto` - string will include alpha channel only if it's less than 1.
      *             `rgb`  - string will not include alpha channel.
      *             `rgba` - string will include alpha channel.
      *
      * @example
      * chroma('orange').hex() === '#ffa500'
      * chroma('orange').alpha(0.5).hex() === '#ffa50080'
      * chroma('orange').alpha(0.5).hex('rgb') === '#ffa500'
      */
    def hex(): String = js.native
    @JSName("hex")
    def hex_auto(mode: auto): String = js.native
    @JSName("hex")
    def hex_rgb(mode: rgb): String = js.native
    @JSName("hex")
    def hex_rgba(mode: rgba): String = js.native
    
    /**
      * Returns an array with the `hue`, `saturation`, and `intensity`
      * components, each as number between 0 and 255. Note that for hue-less
      *  colors (black, white, and grays), the hue component will be NaN.
      *
      * @example
      * chroma('orange').hsi() === [39.64,1,0.55]
      * chroma('white').hsi() === [NaN,0,1]
      */
    def hsi(): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Returns an array with the `hue`, `saturation`, and `lightness`
      * component. Hue is the color angle in degree (`0..360`), saturation
      * and lightness are within `0..1`. Note that for hue-less colors
      * (black, white, and grays), the hue component will be NaN.
      *
      * @example
      * chroma('orange').hsl() === [38.82,1,0.5,1]
      * chroma('white').hsl() === [NaN,0,1,1]
      */
    def hsl(): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Returns an array with the `hue`, `saturation`, and `value`
      * components. Hue is the color angle in degree (`0..360`),
      * saturation and value are within `0..1`. Note that for hue-less
      * colors (black, white, and grays), the hue component will be NaN.
      *
      * @example
      * chroma('orange').hsv() === [38.82,1,1]
      * chroma('white').hsv() === [NaN,0,1]
      */
    def hsv(): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Returns an array with the **L**, **a**, and **b** components.
      *
      * @example
      * chroma('orange').lab() === [74.94,23.93,78.95]
      */
    def lab(): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Returns an array with the **Lightness**, **chroma**, and **hue**
      * components.
      *
      * @example
      * chroma('skyblue').lch() === [79.21,25.94,235.11]
      */
    def lch(): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Relative brightness, according to the
      * [WCAG]{@link http://www.w3.org/TR/2008/REC-WCAG20-20081211/#relativeluminancedef} definition. Normalized to
      * 0 for darkest black and 1 for lightest white.
      */
    def luminance(): Double = js.native
    /**
      * Set luminance of color. The source color will be interpolated with black or white until the correct luminance is found.
      * The color space used defaults to RGB.
      */
    def luminance(l: Double): Color = js.native
    def luminance(l: Double, colorSpace: InterpolationMode): Color = js.native
    
    def mix(targetColor: String): Color = js.native
    def mix(targetColor: String, f: Double): Color = js.native
    def mix(
      targetColor: String,
      f: Double,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Color = js.native
    def mix(
      targetColor: String,
      f: Unit,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Color = js.native
    def mix(targetColor: Color): Color = js.native
    def mix(targetColor: Color, f: Double): Color = js.native
    def mix(
      targetColor: Color,
      f: Double,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Color = js.native
    def mix(
      targetColor: Color,
      f: Unit,
      colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
    ): Color = js.native
    
    /**
      * Returns the named color. Falls back to hexadecimal RGB string, if the color isn't present.
      */
    def name(): String = js.native
    
    /**
      * Returns the numeric representation of the hexadecimal RGB color.
      *
      * @example
      * chroma('#000000').num() === 0
      * chroma('#0000ff').num() === 255
      * chroma('#00ff00').num() === 65280
      * chroma('#ff0000').num() === 16711680
      */
    def num(): Double = js.native
    
    /**
      * Returns an array with the red, green, and blue component, each as
      * number within the range 0..255. Chroma internally stores RGB
      * channels as floats but rounds the numbers before returning them.
      * You can pass false to prevent the rounding.
      *
      * @example
      * chroma('orange').rgb() === [255,165,0]
      * chroma('orange').darken().rgb() === [198,118,0]
      * chroma('orange').darken().rgb(false) === [198.05,118.11,0]
      */
    def rgb(): js.Tuple3[Double, Double, Double] = js.native
    def rgb(round: Boolean): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Just like color.rgb but adds the alpha channel to the returned array.
      *
      * @example
      * chroma('orange').rgba() === [255,165,0,1]
      * chroma('hsla(20, 100%, 40%, 0.5)').rgba() === [204,68,0,0.5]
      */
    def rgba(): js.Tuple4[Double, Double, Double, Double] = js.native
    def rgba(round: Boolean): js.Tuple4[Double, Double, Double, Double] = js.native
    
    /**
      * Changes the saturation of a color by manipulating the Lch chromacity.
      */
    def saturate(): Color = js.native
    def saturate(s: Double): Color = js.native
    
    def set(modechan: String, v: String): Color = js.native
    /**
      * Changes a single channel and returns the result a new chroma object.
      * @example
      * // half Lab lightness
      * chroma('orangered').set('lab.l', '*0.5')
      * @example
      * // double Lch saturation
      * chroma('darkseagreen').set('lch.c', '*2')
      */
    def set(modechan: String, v: Double): Color = js.native
    
    /**
      * Estimate the temperature in Kelvin of any given color, though this makes the only sense for colors from the
      * [temperature gradient]{@link ChromaStatic.temperature} above.
      */
    def temperature(): Double = js.native
  }
  
  trait ColorSpaces extends StObject {
    
    var cmyk: js.Tuple4[Double, Double, Double, Double]
    
    var gl: js.Tuple4[Double, Double, Double, Double]
    
    var hcl: js.Tuple3[Double, Double, Double]
    
    var hsi: js.Tuple3[Double, Double, Double]
    
    var hsl: js.Tuple3[Double, Double, Double]
    
    var hsv: js.Tuple3[Double, Double, Double]
    
    var lab: js.Tuple3[Double, Double, Double]
    
    var lch: js.Tuple3[Double, Double, Double]
    
    var rgb: js.Tuple3[Double, Double, Double]
    
    var rgba: js.Tuple4[Double, Double, Double, Double]
  }
  object ColorSpaces {
    
    inline def apply(
      cmyk: js.Tuple4[Double, Double, Double, Double],
      gl: js.Tuple4[Double, Double, Double, Double],
      hcl: js.Tuple3[Double, Double, Double],
      hsi: js.Tuple3[Double, Double, Double],
      hsl: js.Tuple3[Double, Double, Double],
      hsv: js.Tuple3[Double, Double, Double],
      lab: js.Tuple3[Double, Double, Double],
      lch: js.Tuple3[Double, Double, Double],
      rgb: js.Tuple3[Double, Double, Double],
      rgba: js.Tuple4[Double, Double, Double, Double]
    ): ColorSpaces = {
      val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], hcl = hcl.asInstanceOf[js.Any], hsi = hsi.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], lch = lch.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSpaces]
    }
    
    extension [Self <: ColorSpaces](x: Self) {
      
      inline def setCmyk(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "cmyk", value.asInstanceOf[js.Any])
      
      inline def setGl(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      inline def setHcl(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "hcl", value.asInstanceOf[js.Any])
      
      inline def setHsi(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "hsi", value.asInstanceOf[js.Any])
      
      inline def setHsl(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      inline def setHsv(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "hsv", value.asInstanceOf[js.Any])
      
      inline def setLab(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "lab", value.asInstanceOf[js.Any])
      
      inline def setLch(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "lch", value.asInstanceOf[js.Any])
      
      inline def setRgb(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
      
      inline def setRgba(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cubehelix extends StObject {
    
    /**
      * gamma factor can be used to emphasise low or high intensity values, default=1
      */
    def gamma(g: Double): Cubehelix
    
    /**
      * lightness range: default: [0,1] (black -> white)
      */
    def lightness(l: js.Array[Double]): Cubehelix
    
    /**
      * number (and direction) of hue rotations (e.g. 1=360°, 1.5=`540°``), default=-1.5
      */
    def rotations(r: Double): Cubehelix
    
    /**
      * You can call cubehelix.scale() to use the cube-helix through the chroma.scale interface.
      */
    def scale(): Scale[Color]
    
    /**
      * Set start color for hue rotation, default=300
      */
    def start(s: Double): Cubehelix
  }
  object Cubehelix {
    
    inline def apply(
      gamma: Double => Cubehelix,
      lightness: js.Array[Double] => Cubehelix,
      rotations: Double => Cubehelix,
      scale: () => Scale[Color],
      start: Double => Cubehelix
    ): Cubehelix = {
      val __obj = js.Dynamic.literal(gamma = js.Any.fromFunction1(gamma), lightness = js.Any.fromFunction1(lightness), rotations = js.Any.fromFunction1(rotations), scale = js.Any.fromFunction0(scale), start = js.Any.fromFunction1(start))
      __obj.asInstanceOf[Cubehelix]
    }
    
    extension [Self <: Cubehelix](x: Self) {
      
      inline def setGamma(value: Double => Cubehelix): Self = StObject.set(x, "gamma", js.Any.fromFunction1(value))
      
      inline def setLightness(value: js.Array[Double] => Cubehelix): Self = StObject.set(x, "lightness", js.Any.fromFunction1(value))
      
      inline def setRotations(value: Double => Cubehelix): Self = StObject.set(x, "rotations", js.Any.fromFunction1(value))
      
      inline def setScale(value: () => Scale[Color]): Self = StObject.set(x, "scale", js.Any.fromFunction0(value))
      
      inline def setStart(value: Double => Cubehelix): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromaJs.chromaJsStrings.rgb
    - typings.chromaJs.chromaJsStrings.hsl
    - typings.chromaJs.chromaJsStrings.hsv
    - typings.chromaJs.chromaJsStrings.hsi
    - typings.chromaJs.chromaJsStrings.lab
    - typings.chromaJs.chromaJsStrings.lch
    - typings.chromaJs.chromaJsStrings.hcl
    - typings.chromaJs.chromaJsStrings.lrgb
  */
  trait InterpolationMode extends StObject
  object InterpolationMode {
    
    inline def hcl: typings.chromaJs.chromaJsStrings.hcl = "hcl".asInstanceOf[typings.chromaJs.chromaJsStrings.hcl]
    
    inline def hsi: typings.chromaJs.chromaJsStrings.hsi = "hsi".asInstanceOf[typings.chromaJs.chromaJsStrings.hsi]
    
    inline def hsl: typings.chromaJs.chromaJsStrings.hsl = "hsl".asInstanceOf[typings.chromaJs.chromaJsStrings.hsl]
    
    inline def hsv: typings.chromaJs.chromaJsStrings.hsv = "hsv".asInstanceOf[typings.chromaJs.chromaJsStrings.hsv]
    
    inline def lab: typings.chromaJs.chromaJsStrings.lab = "lab".asInstanceOf[typings.chromaJs.chromaJsStrings.lab]
    
    inline def lch: typings.chromaJs.chromaJsStrings.lch = "lch".asInstanceOf[typings.chromaJs.chromaJsStrings.lch]
    
    inline def lrgb: typings.chromaJs.chromaJsStrings.lrgb = "lrgb".asInstanceOf[typings.chromaJs.chromaJsStrings.lrgb]
    
    inline def rgb: typings.chromaJs.chromaJsStrings.rgb = "rgb".asInstanceOf[typings.chromaJs.chromaJsStrings.rgb]
  }
  
  @js.native
  trait Scale[OutType] extends StObject {
    
    def apply(): OutType = js.native
    def apply(c: js.Array[String]): Scale[Color] = js.native
    def apply(value: Double): OutType = js.native
    
    def cache(use: Boolean): Boolean = js.native
    
    def classes(c: js.Array[Double]): this.type = js.native
    /**
      * If you want the scale function to return a distinct set of colors instead of a continuous gradient, you can
      * use scale.classes. If you pass a number the scale will broken into equi-distant classes.
      * You can also define custom class breaks by passing them as array
      */
    def classes(c: Double): this.type = js.native
    
    /**
      * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
      * arguments, scale.colors returns the original array of colors used to create the scale.
      */
    def colors(): js.Array[Color] = js.native
    def colors(c: Double): js.Array[Color] = js.native
    @JSName("colors")
    def colors_alpha(c: Double, format: alpha): js.Array[Color] = js.native
    @JSName("colors")
    def colors_alpha(c: Unit, format: alpha): js.Array[Color] = js.native
    @JSName("colors")
    def colors_brighten(c: Double, format: brighten): js.Array[Color] = js.native
    @JSName("colors")
    def colors_brighten(c: Unit, format: brighten): js.Array[Color] = js.native
    @JSName("colors")
    def colors_cmyk(c: Double, format: cmyk): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_cmyk(c: Unit, format: cmyk): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_darken(c: Double, format: darken): js.Array[Color] = js.native
    @JSName("colors")
    def colors_darken(c: Unit, format: darken): js.Array[Color] = js.native
    @JSName("colors")
    def colors_desaturate(c: Double, format: desaturate): js.Array[Color] = js.native
    @JSName("colors")
    def colors_desaturate(c: Unit, format: desaturate): js.Array[Color] = js.native
    @JSName("colors")
    def colors_gl(c: Double, format: gl): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_gl(c: Unit, format: gl): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_hcl(c: Double, format: hcl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_hcl(c: Unit, format: hcl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_hex(c: Double, format: hex): js.Array[String] = js.native
    @JSName("colors")
    def colors_hex(c: Unit, format: hex): js.Array[String] = js.native
    @JSName("colors")
    def colors_hsi(c: Double, format: hsi): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_hsi(c: Unit, format: hsi): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_hsl(c: Double, format: hsl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_hsl(c: Unit, format: hsl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_hsv(c: Double, format: hsv): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_hsv(c: Unit, format: hsv): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_lab(c: Double, format: lab): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_lab(c: Unit, format: lab): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_lch(c: Double, format: lch): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_lch(c: Unit, format: lch): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_luminance(c: Double, format: luminance): js.Array[Double] = js.native
    @JSName("colors")
    def colors_luminance(c: Unit, format: luminance): js.Array[Double] = js.native
    @JSName("colors")
    def colors_name(c: Double, format: name): js.Array[String] = js.native
    @JSName("colors")
    def colors_name(c: Unit, format: name): js.Array[String] = js.native
    @JSName("colors")
    def colors_rgb(c: Double, format: rgb): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_rgb(c: Unit, format: rgb): js.Array[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_rgba(c: Double, format: rgba): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_rgba(c: Unit, format: rgba): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
    @JSName("colors")
    def colors_saturate(c: Double, format: saturate): js.Array[Color] = js.native
    @JSName("colors")
    def colors_saturate(c: Unit, format: saturate): js.Array[Color] = js.native
    @JSName("colors")
    def colors_temperature(c: Double, format: temperature): js.Array[Double] = js.native
    @JSName("colors")
    def colors_temperature(c: Unit, format: temperature): js.Array[Double] = js.native
    
    def correctLightness(): this.type = js.native
    def correctLightness(enable: Boolean): this.type = js.native
    
    def domain(): this.type = js.native
    def domain(d: js.Array[Double]): this.type = js.native
    def domain(d: js.Array[Double], n: Double): this.type = js.native
    def domain(d: js.Array[Double], n: Double, mode: String): this.type = js.native
    def domain(d: js.Array[Double], n: Unit, mode: String): this.type = js.native
    def domain(d: Unit, n: Double): this.type = js.native
    def domain(d: Unit, n: Double, mode: String): this.type = js.native
    def domain(d: Unit, n: Unit, mode: String): this.type = js.native
    
    def gamma(g: Double): this.type = js.native
    
    def mode(mode: InterpolationMode): this.type = js.native
    
    /**
      * Set out format for scale() call. Passing null will result in a scale which outputs colors.
      */
    def out(format: Null): Scale[Color] = js.native
    @JSName("out")
    def out_cmyk(format: cmyk): Scale[js.Tuple4[Double, Double, Double, Double]] = js.native
    @JSName("out")
    def out_gl(format: gl): Scale[js.Tuple4[Double, Double, Double, Double]] = js.native
    @JSName("out")
    def out_hcl(format: hcl): Scale[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("out")
    def out_hex(format: hex): Scale[String] = js.native
    @JSName("out")
    def out_hsi(format: hsi): Scale[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("out")
    def out_hsl(format: hsl): Scale[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("out")
    def out_hsv(format: hsv): Scale[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("out")
    def out_lab(format: lab): Scale[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("out")
    def out_lch(format: lch): Scale[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("out")
    def out_rgb(format: rgb): Scale[js.Tuple3[Double, Double, Double]] = js.native
    @JSName("out")
    def out_rgba(format: rgba): Scale[js.Tuple4[Double, Double, Double, Double]] = js.native
    
    def padding(p: js.Array[Double]): this.type = js.native
    def padding(p: Double): this.type = js.native
  }
  
  type _To = ChromaStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChromaStatic = ^
}
