package typings
package chromaDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Alpha extends js.Object {
  /**
           * Get and set the color opacity.
           */
  def alpha(): js.Object = js.native
  /**
           * Get and set the color opacity.
           */
  def alpha(a: scala.Double): js.Object = js.native
  def brighten(): js.Object = js.native
  def brighten(f: scala.Double): js.Object = js.native
  /**
           * Returns a RGB() or HSL() string representation that can be used as CSS-color definition.
           * mode defaults to <code>'rgb'</code>
           */
  def css(): java.lang.String = js.native
  /**
           * Returns a RGB() or HSL() string representation that can be used as CSS-color definition.
           * mode defaults to <code>'rgb'</code>
           */
  @JSName("css")
  def css_hsl(mode: chromaDashJsLib.chromaDashJsLibStrings.hsl): java.lang.String = js.native
  def darken(): js.Object = js.native
  def darken(f: scala.Double): js.Object = js.native
  /**
           * Similar to saturate, but the opposite direction.
           */
  def desaturate(): js.Object = js.native
  /**
           * Similar to saturate, but the opposite direction.
           */
  def desaturate(s: scala.Double): js.Object = js.native
  /**
           * Returns a single channel value.
           * @see set
           */
  def get(modechan: java.lang.String): scala.Double = js.native
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
  def hex(): java.lang.String = js.native
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
  @JSName("hex")
  def hex_auto(mode: chromaDashJsLib.chromaDashJsLibStrings.auto): java.lang.String = js.native
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
  @JSName("hex")
  def hex_rgb(mode: chromaDashJsLib.chromaDashJsLibStrings.rgb): java.lang.String = js.native
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
  @JSName("hex")
  def hex_rgba(mode: chromaDashJsLib.chromaDashJsLibStrings.rgba): java.lang.String = js.native
  /**
           * Relative brightness, according to the
           * [WCAG]{@link http://www.w3.org/TR/2008/REC-WCAG20-20081211/#relativeluminancedef} definition. Normalized to
           * 0 for darkest black and 1 for lightest white.
           */
  def luminance(): scala.Double = js.native
  /**
           * Set luminance of color. The source color will be interpolated with black or white until the correct luminance is found.
           * The color space used defaults to RGB.
           */
  def luminance(l: scala.Double): js.Object = js.native
  /**
           * Set luminance of color. The source color will be interpolated with black or white until the correct luminance is found.
           * The color space used defaults to RGB.
           */
  def luminance(
    l: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): js.Object = js.native
  /**
           * Returns the named color. Falls back to hexadecimal RGB string, if the color isn't present.
           */
  def name(): java.lang.String = js.native
  /**
           * Returns the numeric representation of the hexadecimal RGB color.
           *
           * @example
           * chroma('#000000').num() === 0
           * chroma('#0000ff').num() === 255
           * chroma('#00ff00').num() === 65280
           * chroma('#ff0000').num() === 16711680
           */
  def num(): scala.Double = js.native
  /**
           * Changes the saturation of a color by manipulating the Lch chromacity.
           */
  def saturate(): js.Object = js.native
  /**
           * Changes the saturation of a color by manipulating the Lch chromacity.
           */
  def saturate(s: scala.Double): js.Object = js.native
  /**
           * Changes a single channel and returns the result a new chroma object.
           * @example
           * // half Lab lightness
           * chroma('orangered').set('lab.l', '*0.5')
           * @example
           * // double Lch saturation
           * chroma('darkseagreen').set('lch.c', '*2')
           */
  def set(modechan: java.lang.String, v: java.lang.String): js.Object = js.native
  /**
           * Changes a single channel and returns the result a new chroma object.
           * @example
           * // half Lab lightness
           * chroma('orangered').set('lab.l', '*0.5')
           * @example
           * // double Lch saturation
           * chroma('darkseagreen').set('lch.c', '*2')
           */
  def set(modechan: java.lang.String, v: scala.Double): js.Object = js.native
  /**
           * Estimate the temperature in Kelvin of any given color, though this makes the only sense for colors from the
           * [temperature gradient]{@link ChromaStatic.temperature} above.
           */
  def temperature(): scala.Double = js.native
}

