package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterQualityEnumValues
  extends StObject
     with EmbindEnum {
  
  var High: FilterQuality
  
  var Low: FilterQuality
  
  var Medium: FilterQuality
  
  var None: FilterQuality
}
object FilterQualityEnumValues {
  
  inline def apply(
    High: FilterQuality,
    Low: FilterQuality,
    Medium: FilterQuality,
    None: FilterQuality,
    values: js.Array[Double]
  ): FilterQualityEnumValues = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterQualityEnumValues]
  }
  
  extension [Self <: FilterQualityEnumValues](x: Self) {
    
    inline def setHigh(value: FilterQuality): Self = StObject.set(x, "High", value.asInstanceOf[js.Any])
    
    inline def setLow(value: FilterQuality): Self = StObject.set(x, "Low", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: FilterQuality): Self = StObject.set(x, "Medium", value.asInstanceOf[js.Any])
    
    inline def setNone(value: FilterQuality): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
  }
}
