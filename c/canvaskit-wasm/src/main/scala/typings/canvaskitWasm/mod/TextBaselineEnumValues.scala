package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBaselineEnumValues extends EmbindEnum {
  
  var Alphabetic: TextBaseline = js.native
  
  var Ideographic: TextBaseline = js.native
}
object TextBaselineEnumValues {
  
  @scala.inline
  def apply(Alphabetic: TextBaseline, Ideographic: TextBaseline, values: js.Array[Double]): TextBaselineEnumValues = {
    val __obj = js.Dynamic.literal(Alphabetic = Alphabetic.asInstanceOf[js.Any], Ideographic = Ideographic.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBaselineEnumValues]
  }
  
  @scala.inline
  implicit class TextBaselineEnumValuesOps[Self <: TextBaselineEnumValues] (val x: Self) extends AnyVal {
    
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
    def setAlphabetic(value: TextBaseline): Self = this.set("Alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdeographic(value: TextBaseline): Self = this.set("Ideographic", value.asInstanceOf[js.Any])
  }
}
