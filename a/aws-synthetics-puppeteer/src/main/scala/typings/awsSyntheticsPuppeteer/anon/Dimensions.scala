package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  var Dimensions: js.Array[Name]
  
  var MetricName: Any
  
  var Timestamp: Any
  
  var Unit: Any
  
  var Value: Any
}
object Dimensions {
  
  inline def apply(Dimensions: js.Array[Name], MetricName: Any, Timestamp: Any, Unit: Any, Value: Any): Dimensions = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: js.Array[Name]): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsVarargs(value: Name*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMetricName(value: Any): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Any): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: Any): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
