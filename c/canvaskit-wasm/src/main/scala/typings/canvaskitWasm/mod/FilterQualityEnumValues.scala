package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterQualityEnumValues extends EmbindEnum {
  
  var High: FilterQuality = js.native
  
  var Low: FilterQuality = js.native
  
  var Medium: FilterQuality = js.native
  
  var None: FilterQuality = js.native
}
object FilterQualityEnumValues {
  
  @scala.inline
  def apply(
    High: FilterQuality,
    Low: FilterQuality,
    Medium: FilterQuality,
    None: FilterQuality,
    values: js.Array[Double]
  ): FilterQualityEnumValues = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterQualityEnumValues]
  }
  
  @scala.inline
  implicit class FilterQualityEnumValuesOps[Self <: FilterQualityEnumValues] (val x: Self) extends AnyVal {
    
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
    def setHigh(value: FilterQuality): Self = this.set("High", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: FilterQuality): Self = this.set("Low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: FilterQuality): Self = this.set("Medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: FilterQuality): Self = this.set("None", value.asInstanceOf[js.Any])
  }
}
