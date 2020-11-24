package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectWidthStyleEnumValues extends EmbindEnum {
  
  var Max: RectWidthStyle = js.native
  
  var Tight: RectWidthStyle = js.native
}
object RectWidthStyleEnumValues {
  
  @scala.inline
  def apply(Max: RectWidthStyle, Tight: RectWidthStyle, values: js.Array[Double]): RectWidthStyleEnumValues = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Tight = Tight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectWidthStyleEnumValues]
  }
  
  @scala.inline
  implicit class RectWidthStyleEnumValuesOps[Self <: RectWidthStyleEnumValues] (val x: Self) extends AnyVal {
    
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
    def setMax(value: RectWidthStyle): Self = this.set("Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTight(value: RectWidthStyle): Self = this.set("Tight", value.asInstanceOf[js.Any])
  }
}
