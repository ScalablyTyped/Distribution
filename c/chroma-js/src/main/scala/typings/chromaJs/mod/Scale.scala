package typings.chromaJs.mod

import typings.chromaJs.chromaJsStrings.alpha
import typings.chromaJs.chromaJsStrings.brighten
import typings.chromaJs.chromaJsStrings.cmyk
import typings.chromaJs.chromaJsStrings.darken
import typings.chromaJs.chromaJsStrings.desaturate
import typings.chromaJs.chromaJsStrings.gl
import typings.chromaJs.chromaJsStrings.hcl
import typings.chromaJs.chromaJsStrings.hex
import typings.chromaJs.chromaJsStrings.hsi
import typings.chromaJs.chromaJsStrings.hsl
import typings.chromaJs.chromaJsStrings.hsv
import typings.chromaJs.chromaJsStrings.lab
import typings.chromaJs.chromaJsStrings.lch
import typings.chromaJs.chromaJsStrings.luminance
import typings.chromaJs.chromaJsStrings.name
import typings.chromaJs.chromaJsStrings.rgb
import typings.chromaJs.chromaJsStrings.rgba
import typings.chromaJs.chromaJsStrings.saturate
import typings.chromaJs.chromaJsStrings.temperature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scale[OutType] extends js.Object {
  
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
  def colors_alpha(c: js.UndefOr[scala.Nothing], format: alpha): js.Array[Color] = js.native
  @JSName("colors")
  def colors_alpha(c: Double, format: alpha): js.Array[Color] = js.native
  @JSName("colors")
  def colors_brighten(c: js.UndefOr[scala.Nothing], format: brighten): js.Array[Color] = js.native
  @JSName("colors")
  def colors_brighten(c: Double, format: brighten): js.Array[Color] = js.native
  @JSName("colors")
  def colors_cmyk(c: js.UndefOr[scala.Nothing], format: cmyk): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_cmyk(c: Double, format: cmyk): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_darken(c: js.UndefOr[scala.Nothing], format: darken): js.Array[Color] = js.native
  @JSName("colors")
  def colors_darken(c: Double, format: darken): js.Array[Color] = js.native
  @JSName("colors")
  def colors_desaturate(c: js.UndefOr[scala.Nothing], format: desaturate): js.Array[Color] = js.native
  @JSName("colors")
  def colors_desaturate(c: Double, format: desaturate): js.Array[Color] = js.native
  @JSName("colors")
  def colors_gl(c: js.UndefOr[scala.Nothing], format: gl): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_gl(c: Double, format: gl): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hcl(c: js.UndefOr[scala.Nothing], format: hcl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hcl(c: Double, format: hcl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hex(c: js.UndefOr[scala.Nothing], format: hex): js.Array[String] = js.native
  @JSName("colors")
  def colors_hex(c: Double, format: hex): js.Array[String] = js.native
  @JSName("colors")
  def colors_hsi(c: js.UndefOr[scala.Nothing], format: hsi): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hsi(c: Double, format: hsi): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hsl(c: js.UndefOr[scala.Nothing], format: hsl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hsl(c: Double, format: hsl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hsv(c: js.UndefOr[scala.Nothing], format: hsv): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hsv(c: Double, format: hsv): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_lab(c: js.UndefOr[scala.Nothing], format: lab): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_lab(c: Double, format: lab): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_lch(c: js.UndefOr[scala.Nothing], format: lch): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_lch(c: Double, format: lch): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_luminance(c: js.UndefOr[scala.Nothing], format: luminance): js.Array[Double] = js.native
  @JSName("colors")
  def colors_luminance(c: Double, format: luminance): js.Array[Double] = js.native
  @JSName("colors")
  def colors_name(c: js.UndefOr[scala.Nothing], format: name): js.Array[String] = js.native
  @JSName("colors")
  def colors_name(c: Double, format: name): js.Array[String] = js.native
  @JSName("colors")
  def colors_rgb(c: js.UndefOr[scala.Nothing], format: rgb): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_rgb(c: Double, format: rgb): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_rgba(c: js.UndefOr[scala.Nothing], format: rgba): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_rgba(c: Double, format: rgba): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_saturate(c: js.UndefOr[scala.Nothing], format: saturate): js.Array[Color] = js.native
  @JSName("colors")
  def colors_saturate(c: Double, format: saturate): js.Array[Color] = js.native
  @JSName("colors")
  def colors_temperature(c: js.UndefOr[scala.Nothing], format: temperature): js.Array[Double] = js.native
  @JSName("colors")
  def colors_temperature(c: Double, format: temperature): js.Array[Double] = js.native
  
  def correctLightness(): this.type = js.native
  def correctLightness(enable: Boolean): this.type = js.native
  
  def domain(): this.type = js.native
  def domain(d: js.UndefOr[scala.Nothing], n: js.UndefOr[scala.Nothing], mode: String): this.type = js.native
  def domain(d: js.UndefOr[scala.Nothing], n: Double): this.type = js.native
  def domain(d: js.UndefOr[scala.Nothing], n: Double, mode: String): this.type = js.native
  def domain(d: js.Array[Double]): this.type = js.native
  def domain(d: js.Array[Double], n: js.UndefOr[scala.Nothing], mode: String): this.type = js.native
  def domain(d: js.Array[Double], n: Double): this.type = js.native
  def domain(d: js.Array[Double], n: Double, mode: String): this.type = js.native
  
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
