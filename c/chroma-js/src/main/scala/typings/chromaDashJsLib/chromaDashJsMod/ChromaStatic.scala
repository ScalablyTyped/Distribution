package typings
package chromaDashJsLib.chromaDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromaStatic extends js.Object {
  /**
    * chroma.brewer is an map of ColorBrewer scales that are included in chroma.js for convenience.
    * chroma.scale uses the colors to construct.
    */
  var brewer: chromaDashJsLib.Anon_Accent = js.native
  /**
    * Create a color in the specified color space using a, b and c as values.
    *
    * @param colorSpace The color space to use. Defaults to "rgb".
    * @return the color object.
    */
  def apply(a: scala.Double, b: scala.Double, c: scala.Double): Color = js.native
  def apply(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  def apply(a: scala.Double, b: scala.Double, c: scala.Double, d: scala.Double): Color = js.native
  def apply(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  /**
    * Creates a color from a string representation (as supported in CSS).
    * Creates a color from a number representation [0; 16777215]
    *
    * @param color The string to convert to a color.
    * @return the color object.
    */
  def apply(color: java.lang.String): Color = js.native
  def apply(color: scala.Double): Color = js.native
  /**
    * Create a color in the specified color space using values.
    *
    * @param values An array of values (e.g. [r, g, b, a?]).
    * @param colorSpace The color space to use. Defaults to "rgb".
    * @return the color object.
    */
  def apply(values: js.Array[scala.Double]): Color = js.native
  def apply(
    values: js.Array[scala.Double],
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  /**
    * Similar to {@link mix}, but accepts more than two colors. Simple averaging of R,G,B components and the alpha
    * channel.
    */
  def average(colors: js.Array[java.lang.String | Color]): Color = js.native
  def average(
    colors: js.Array[java.lang.String | Color],
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  /**
    * Returns a function that
    * [bezier-interpolates]{@link https://www.vis4.net/blog/posts/mastering-multi-hued-color-scales/} between
    * colors in Lab space. The input range of the function is [0..1].
    * You can convert it to a scale instance by calling <code>chroma.bezier(...).scale()</code>
    */
  def bezier(colors: js.Array[java.lang.String]): chromaDashJsLib.Anon_Scale = js.native
  /**
    * Blends two colors using RGB channel-wise blend functions.
    */
  def blend(
    color1: java.lang.String | Color,
    color2: java.lang.String | Color,
    blendMode: chromaDashJsLib.chromaDashJsLibStrings.multiply | chromaDashJsLib.chromaDashJsLibStrings.darken | chromaDashJsLib.chromaDashJsLibStrings.lighten | chromaDashJsLib.chromaDashJsLibStrings.screen | chromaDashJsLib.chromaDashJsLibStrings.overlay | chromaDashJsLib.chromaDashJsLibStrings.burn | chromaDashJsLib.chromaDashJsLibStrings.dodge
  ): Color = js.native
  def cmyk(c: scala.Double, m: scala.Double, y: scala.Double, k: scala.Double): Color = js.native
  def contrast(color1: Color, color2: Color): scala.Double = js.native
  def contrast(color1: Color, color2: java.lang.String): scala.Double = js.native
  def contrast(color1: java.lang.String, color2: Color): scala.Double = js.native
  /**
    * Computes the WCAG contrast ratio between two colors.
    * A minimum contrast of 4.5:1 is recommended {@link https://www.w3.org/TR/WCAG20-TECHS/G18.html}
    * to ensure that text is still readable against a background color.
    */
  def contrast(color1: java.lang.String, color2: java.lang.String): scala.Double = js.native
  def css(col: java.lang.String): Color = js.native
  def cubehelix(): Cubehelix = js.native
  def deltaE(color1: Color, color2: Color): scala.Double = js.native
  def deltaE(color1: Color, color2: Color, L: scala.Double): scala.Double = js.native
  def deltaE(color1: Color, color2: Color, L: scala.Double, C: scala.Double): scala.Double = js.native
  def deltaE(color1: Color, color2: java.lang.String): scala.Double = js.native
  def deltaE(color1: Color, color2: java.lang.String, L: scala.Double): scala.Double = js.native
  def deltaE(color1: Color, color2: java.lang.String, L: scala.Double, C: scala.Double): scala.Double = js.native
  def deltaE(color1: java.lang.String, color2: Color): scala.Double = js.native
  def deltaE(color1: java.lang.String, color2: Color, L: scala.Double): scala.Double = js.native
  def deltaE(color1: java.lang.String, color2: Color, L: scala.Double, C: scala.Double): scala.Double = js.native
  /**
    * Computes color difference {@link https://en.wikipedia.org/wiki/Color_difference#CMC_l:c_.281984.29} as
    * developed by the Colour Measurement Committee of the Society of Dyers and Colourists (CMC) in 1984.
    * The implementation is adapted from Bruce Lindbloom.
    * {@link https://web.archive.org/web/20160306044036/http://www.brucelindbloom.com/javascript/ColorDiff.js}
    * The parameters L (default 1) and C (default 1) are weighting factors for lightness and chromacity.
    */
  def deltaE(color1: java.lang.String, color2: java.lang.String): scala.Double = js.native
  def deltaE(color1: java.lang.String, color2: java.lang.String, L: scala.Double): scala.Double = js.native
  def deltaE(color1: java.lang.String, color2: java.lang.String, L: scala.Double, C: scala.Double): scala.Double = js.native
  def distance(color1: Color, color2: Color): scala.Double = js.native
  def distance(
    color1: Color,
    color2: Color,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): scala.Double = js.native
  def distance(color1: Color, color2: java.lang.String): scala.Double = js.native
  def distance(
    color1: Color,
    color2: java.lang.String,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): scala.Double = js.native
  def distance(color1: java.lang.String, color2: Color): scala.Double = js.native
  def distance(
    color1: java.lang.String,
    color2: Color,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): scala.Double = js.native
  /**
    * Computes the eucledian distance between two colors in a given color space (default is 'lab').
    * {@link https://en.wikipedia.org/wiki/Euclidean_distance#Three_dimensions}
    */
  def distance(color1: java.lang.String, color2: java.lang.String): scala.Double = js.native
  def distance(
    color1: java.lang.String,
    color2: java.lang.String,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): scala.Double = js.native
  /**
    * GL is a variant of RGB(A), with the only difference that the components are normalized to the range of 0..1.
    */
  def gl(red: scala.Double, green: scala.Double, blue: scala.Double): Color = js.native
  def gl(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): Color = js.native
  /**
    * Create a color from a hex or string representation (as supported in CSS).
    *
    * This is an alias of chroma.css().
    *
    * @param color The string to convert to a color.
    * @return the color object.
    */
  def hex(color: java.lang.String): Color = js.native
  def hsl(h: scala.Double, s: scala.Double, l: scala.Double): Color = js.native
  def hsv(h: scala.Double, s: scala.Double, v: scala.Double): Color = js.native
  def interpolate(color1: Color, color2: Color): Color = js.native
  def interpolate(color1: Color, color2: Color, f: scala.Double): Color = js.native
  def interpolate(
    color1: Color,
    color2: Color,
    f: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  def interpolate(color1: Color, color2: java.lang.String): Color = js.native
  def interpolate(color1: Color, color2: java.lang.String, f: scala.Double): Color = js.native
  def interpolate(
    color1: Color,
    color2: java.lang.String,
    f: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  def interpolate(color1: java.lang.String, color2: Color): Color = js.native
  def interpolate(color1: java.lang.String, color2: Color, f: scala.Double): Color = js.native
  def interpolate(
    color1: java.lang.String,
    color2: Color,
    f: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  /**
    * Alias for {@see mix}.
    */
  def interpolate(color1: java.lang.String, color2: java.lang.String): Color = js.native
  def interpolate(color1: java.lang.String, color2: java.lang.String, f: scala.Double): Color = js.native
  def interpolate(
    color1: java.lang.String,
    color2: java.lang.String,
    f: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  def lab(lightness: scala.Double, a: scala.Double, b: scala.Double): Color = js.native
  def lab(lightness: scala.Double, a: scala.Double, b: scala.Double, alpha: scala.Double): Color = js.native
  def lch(l: scala.Double, c: scala.Double, h: scala.Double): Color = js.native
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
  def limits_e(data: js.Array[scala.Double], mode: chromaDashJsLib.chromaDashJsLibStrings.e, c: scala.Double): js.Array[scala.Double] = js.native
  @JSName("limits")
  def limits_k(data: js.Array[scala.Double], mode: chromaDashJsLib.chromaDashJsLibStrings.k, c: scala.Double): js.Array[scala.Double] = js.native
  @JSName("limits")
  def limits_l(data: js.Array[scala.Double], mode: chromaDashJsLib.chromaDashJsLibStrings.l, c: scala.Double): js.Array[scala.Double] = js.native
  @JSName("limits")
  def limits_q(data: js.Array[scala.Double], mode: chromaDashJsLib.chromaDashJsLibStrings.q, c: scala.Double): js.Array[scala.Double] = js.native
  def mix(color1: Color, color2: Color): Color = js.native
  def mix(color1: Color, color2: Color, f: scala.Double): Color = js.native
  def mix(
    color1: Color,
    color2: Color,
    f: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  def mix(color1: Color, color2: java.lang.String): Color = js.native
  def mix(color1: Color, color2: java.lang.String, f: scala.Double): Color = js.native
  def mix(
    color1: Color,
    color2: java.lang.String,
    f: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  def mix(color1: java.lang.String, color2: Color): Color = js.native
  def mix(color1: java.lang.String, color2: Color, f: scala.Double): Color = js.native
  def mix(
    color1: java.lang.String,
    color2: Color,
    f: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  /**
    * Mixes two colors. The mix ratio is a value between 0 and 1.
    * The color mixing produces different results based the color space used for interpolation.
    * @example chroma.mix('red', 'blue', 0.25) // => #bf0040
    * @example chroma.mix('red', 'blue', 0.5, 'hsl') // => #ff00ff
    */
  def mix(color1: java.lang.String, color2: java.lang.String): Color = js.native
  def mix(color1: java.lang.String, color2: java.lang.String, f: scala.Double): Color = js.native
  def mix(
    color1: java.lang.String,
    color2: java.lang.String,
    f: scala.Double,
    colorSpace: chromaDashJsLib.chromaDashJsLibStrings.rgb | chromaDashJsLib.chromaDashJsLibStrings.rgba | chromaDashJsLib.chromaDashJsLibStrings.hsl | chromaDashJsLib.chromaDashJsLibStrings.hsv | chromaDashJsLib.chromaDashJsLibStrings.hsi | chromaDashJsLib.chromaDashJsLibStrings.lab | chromaDashJsLib.chromaDashJsLibStrings.lch | chromaDashJsLib.chromaDashJsLibStrings.hcl | chromaDashJsLib.chromaDashJsLibStrings.cmyk | chromaDashJsLib.chromaDashJsLibStrings.gl
  ): Color = js.native
  /**
    * Returns a random color.
    */
  def random(): Color = js.native
  def rgb(r: scala.Double, g: scala.Double, b: scala.Double): Color = js.native
  def scale(): Scale[Color] = js.native
  def scale(colors: js.Array[java.lang.String | Color]): Scale[Color] = js.native
  def scale(name: Color): Scale[Color] = js.native
  def scale(name: java.lang.String): Scale[Color] = js.native
  /**
    * Returns a color from the color temperature scale.
    * light 2000K, bright sunlight 6000K.
    * Based on Neil Bartlett's implementation.
    * https://github.com/neilbartlett/color-temperature
    */
  def temperature(t: scala.Double): Color = js.native
}

