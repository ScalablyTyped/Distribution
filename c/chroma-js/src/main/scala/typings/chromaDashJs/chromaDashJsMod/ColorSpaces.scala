package typings.chromaDashJs.chromaDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSpaces extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(cmyk = cmyk, gl = gl, hcl = hcl, hsi = hsi, hsl = hsl, hsv = hsv, lab = lab, lch = lch, rgb = rgb, rgba = rgba)
  
    __obj.asInstanceOf[ColorSpaces]
  }
}

