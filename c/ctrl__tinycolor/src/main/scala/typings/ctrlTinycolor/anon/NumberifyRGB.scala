package typings.ctrlTinycolor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.Numberify<@ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.RGB> */
@js.native
trait NumberifyRGB extends js.Object {
  
  var b: Double = js.native
  
  var g: Double = js.native
  
  var r: Double = js.native
}
object NumberifyRGB {
  
  @scala.inline
  def apply(b: Double, g: Double, r: Double): NumberifyRGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberifyRGB]
  }
  
  @scala.inline
  implicit class NumberifyRGBOps[Self <: NumberifyRGB] (val x: Self) extends AnyVal {
    
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
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
  }
}
