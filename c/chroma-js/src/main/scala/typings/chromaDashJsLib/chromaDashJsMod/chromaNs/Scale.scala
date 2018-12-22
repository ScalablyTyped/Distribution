package typings
package chromaDashJsLib.chromaDashJsMod.chromaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale[OutType] extends js.Object {
  def apply(c: js.Array[java.lang.String]): Scale[Color] = js.native
  def apply(value: scala.Double): OutType = js.native
  def cache(use: scala.Boolean): scala.Boolean = js.native
  /**
           * If you want the scale function to return a distinct set of colors instead of a continuous gradient, you can
           * use scale.classes. If you pass a number the scale will broken into equi-distant classes.
           * You can also define custom class breaks by passing them as array
           */
  def classes(c: js.Array[scala.Double]): this.type = js.native
  /**
           * If you want the scale function to return a distinct set of colors instead of a continuous gradient, you can
           * use scale.classes. If you pass a number the scale will broken into equi-distant classes.
           * You can also define custom class breaks by passing them as array
           */
  def classes(c: scala.Double): this.type = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  def colors(): js.Array[Color] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  def colors(c: scala.Double): js.Array[Color] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_alpha(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.alpha): js.Array[Color] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_alpha(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.alpha): js.Array[Color] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_brighten(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.brighten): js.Array[Color] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_brighten(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.brighten): js.Array[Color] = js.native
  @JSName("colors")
  def colors_cmyk(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.cmyk): js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_cmyk(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.cmyk): js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_darken(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.darken): js.Array[Color] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_darken(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.darken): js.Array[Color] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_desaturate(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.desaturate): js.Array[Color] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_desaturate(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.desaturate): js.Array[Color] = js.native
  @JSName("colors")
  def colors_gl(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.gl): js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_gl(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.gl): js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_hcl(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.hcl): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_hcl(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.hcl): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_hex(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.hex): js.Array[java.lang.String] = js.native
  @JSName("colors")
  def colors_hex(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.hex): js.Array[java.lang.String] = js.native
  @JSName("colors")
  def colors_hsi(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.hsi): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_hsi(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.hsi): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_hsl(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.hsl): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_hsl(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.hsl): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_hsv(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.hsv): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_hsv(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.hsv): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_lab(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.lab): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_lab(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.lab): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_lch(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.lch): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_lch(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.lch): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_luminance(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.luminance): js.Array[scala.Double] = js.native
  @JSName("colors")
  def colors_luminance(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.luminance): js.Array[scala.Double] = js.native
  @JSName("colors")
  def colors_name(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.name): js.Array[java.lang.String] = js.native
  @JSName("colors")
  def colors_name(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.name): js.Array[java.lang.String] = js.native
  @JSName("colors")
  def colors_rgb(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.rgb): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_rgb(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.rgb): js.Array[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_rgba(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.rgba): js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("colors")
  def colors_rgba(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.rgba): js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_saturate(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.saturate): js.Array[Color] = js.native
  /**
           * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
           * arguments, scale.colors returns the original array of colors used to create the scale.
           */
  @JSName("colors")
  def colors_saturate(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.saturate): js.Array[Color] = js.native
  @JSName("colors")
  def colors_temperature(c: js.UndefOr[scala.Nothing], format: chromaDashJsLib.chromaDashJsLibStrings.temperature): js.Array[scala.Double] = js.native
  @JSName("colors")
  def colors_temperature(c: scala.Double, format: chromaDashJsLib.chromaDashJsLibStrings.temperature): js.Array[scala.Double] = js.native
  def correctLightness(): this.type = js.native
  def correctLightness(enable: scala.Boolean): this.type = js.native
  def domain(): this.type = js.native
  def domain(d: js.Array[scala.Double]): this.type = js.native
  def domain(d: js.Array[scala.Double], n: scala.Double): this.type = js.native
  def domain(d: js.Array[scala.Double], n: scala.Double, mode: java.lang.String): this.type = js.native
  def gamma(g: scala.Double): this.type = js.native
  def mode(mode: InterpolationMode): this.type = js.native
  /**
           * Set out format for scale() call. Passing null will result in a scale which outputs colors.
           */
  def out(): Scale[Color] = js.native
  @JSName("out")
  def out_cmyk(format: chromaDashJsLib.chromaDashJsLibStrings.cmyk): Scale[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("out")
  def out_gl(format: chromaDashJsLib.chromaDashJsLibStrings.gl): Scale[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("out")
  def out_hcl(format: chromaDashJsLib.chromaDashJsLibStrings.hcl): Scale[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("out")
  def out_hex(format: chromaDashJsLib.chromaDashJsLibStrings.hex): Scale[java.lang.String] = js.native
  @JSName("out")
  def out_hsi(format: chromaDashJsLib.chromaDashJsLibStrings.hsi): Scale[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("out")
  def out_hsl(format: chromaDashJsLib.chromaDashJsLibStrings.hsl): Scale[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("out")
  def out_hsv(format: chromaDashJsLib.chromaDashJsLibStrings.hsv): Scale[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("out")
  def out_lab(format: chromaDashJsLib.chromaDashJsLibStrings.lab): Scale[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("out")
  def out_lch(format: chromaDashJsLib.chromaDashJsLibStrings.lch): Scale[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("out")
  def out_rgb(format: chromaDashJsLib.chromaDashJsLibStrings.rgb): Scale[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.native
  @JSName("out")
  def out_rgba(format: chromaDashJsLib.chromaDashJsLibStrings.rgba): Scale[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  def padding(p: js.Array[scala.Double]): this.type = js.native
  def padding(p: scala.Double): this.type = js.native
}

