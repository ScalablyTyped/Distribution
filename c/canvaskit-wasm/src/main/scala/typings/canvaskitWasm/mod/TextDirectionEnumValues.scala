package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDirectionEnumValues extends EmbindEnum {
  
  var LTR: TextDirection = js.native
  
  var RTL: TextDirection = js.native
}
object TextDirectionEnumValues {
  
  @scala.inline
  def apply(LTR: TextDirection, RTL: TextDirection, values: js.Array[Double]): TextDirectionEnumValues = {
    val __obj = js.Dynamic.literal(LTR = LTR.asInstanceOf[js.Any], RTL = RTL.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDirectionEnumValues]
  }
  
  @scala.inline
  implicit class TextDirectionEnumValuesOps[Self <: TextDirectionEnumValues] (val x: Self) extends AnyVal {
    
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
    def setLTR(value: TextDirection): Self = this.set("LTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTL(value: TextDirection): Self = this.set("RTL", value.asInstanceOf[js.Any])
  }
}
