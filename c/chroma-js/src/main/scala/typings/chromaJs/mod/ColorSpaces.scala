package typings.chromaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSpaces extends js.Object {
  
  var cmyk: js.Tuple4[Double, Double, Double, Double] = js.native
  
  var gl: js.Tuple4[Double, Double, Double, Double] = js.native
  
  var hcl: js.Tuple3[Double, Double, Double] = js.native
  
  var hsi: js.Tuple3[Double, Double, Double] = js.native
  
  var hsl: js.Tuple3[Double, Double, Double] = js.native
  
  var hsv: js.Tuple3[Double, Double, Double] = js.native
  
  var lab: js.Tuple3[Double, Double, Double] = js.native
  
  var lch: js.Tuple3[Double, Double, Double] = js.native
  
  var rgb: js.Tuple3[Double, Double, Double] = js.native
  
  var rgba: js.Tuple4[Double, Double, Double, Double] = js.native
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
    val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], hcl = hcl.asInstanceOf[js.Any], hsi = hsi.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], lch = lch.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSpaces]
  }
  
  @scala.inline
  implicit class ColorSpacesOps[Self <: ColorSpaces] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCmyk(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("cmyk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGl(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHcl(value: js.Tuple3[Double, Double, Double]): Self = this.set("hcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsi(value: js.Tuple3[Double, Double, Double]): Self = this.set("hsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsl(value: js.Tuple3[Double, Double, Double]): Self = this.set("hsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsv(value: js.Tuple3[Double, Double, Double]): Self = this.set("hsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLab(value: js.Tuple3[Double, Double, Double]): Self = this.set("lab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLch(value: js.Tuple3[Double, Double, Double]): Self = this.set("lch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgb(value: js.Tuple3[Double, Double, Double]): Self = this.set("rgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgba(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("rgba", value.asInstanceOf[js.Any])
  }
}
