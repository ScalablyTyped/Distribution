package typings.ctrlTinycolor.randomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorBound extends js.Object {
  
  var hueRange: (js.Tuple2[Double, Double]) | Null = js.native
  
  var lowerBounds: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var name: String = js.native
}
object ColorBound {
  
  @scala.inline
  def apply(lowerBounds: js.Array[js.Tuple2[Double, Double]], name: String): ColorBound = {
    val __obj = js.Dynamic.literal(lowerBounds = lowerBounds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorBound]
  }
  
  @scala.inline
  implicit class ColorBoundOps[Self <: ColorBound] (val x: Self) extends AnyVal {
    
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
    def setLowerBoundsVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("lowerBounds", js.Array(value :_*))
    
    @scala.inline
    def setLowerBounds(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("lowerBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHueRange(value: js.Tuple2[Double, Double]): Self = this.set("hueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHueRangeNull: Self = this.set("hueRange", null)
  }
}
