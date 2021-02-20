package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
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
  implicit class FilterQualityEnumValuesMutableBuilder[Self <: FilterQualityEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigh(value: FilterQuality): Self = StObject.set(x, "High", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: FilterQuality): Self = StObject.set(x, "Low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: FilterQuality): Self = StObject.set(x, "Medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: FilterQuality): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
  }
}
