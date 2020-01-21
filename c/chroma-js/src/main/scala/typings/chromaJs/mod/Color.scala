package typings.chromaJs.mod

import typings.chromaJs.chromaJsStrings.auto
import typings.chromaJs.chromaJsStrings.cmyk
import typings.chromaJs.chromaJsStrings.gl
import typings.chromaJs.chromaJsStrings.hcl
import typings.chromaJs.chromaJsStrings.hsi
import typings.chromaJs.chromaJsStrings.hsl
import typings.chromaJs.chromaJsStrings.hsv
import typings.chromaJs.chromaJsStrings.lab
import typings.chromaJs.chromaJsStrings.lch
import typings.chromaJs.chromaJsStrings.rgb
import typings.chromaJs.chromaJsStrings.rgba
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
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
    * @see set
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
  def luminance(l: Double, colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl): Color = js.native
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

