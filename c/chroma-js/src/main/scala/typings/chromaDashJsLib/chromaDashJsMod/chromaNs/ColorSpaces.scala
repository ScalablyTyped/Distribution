package typings
package chromaDashJsLib.chromaDashJsMod.chromaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSpaces extends js.Object {
  var cmyk: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var gl: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var hcl: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var hsi: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var hsl: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var hsv: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var lab: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var lch: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var rgb: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var rgba: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
}

object ColorSpaces {
  @scala.inline
  def apply(
    cmyk: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    gl: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    hcl: js.Tuple3[scala.Double, scala.Double, scala.Double],
    hsi: js.Tuple3[scala.Double, scala.Double, scala.Double],
    hsl: js.Tuple3[scala.Double, scala.Double, scala.Double],
    hsv: js.Tuple3[scala.Double, scala.Double, scala.Double],
    lab: js.Tuple3[scala.Double, scala.Double, scala.Double],
    lch: js.Tuple3[scala.Double, scala.Double, scala.Double],
    rgb: js.Tuple3[scala.Double, scala.Double, scala.Double],
    rgba: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  ): ColorSpaces = {
    val __obj = js.Dynamic.literal(cmyk = cmyk, gl = gl, hcl = hcl, hsi = hsi, hsl = hsl, hsv = hsv, lab = lab, lch = lch, rgb = rgb, rgba = rgba)
  
    __obj.asInstanceOf[ColorSpaces]
  }
}

