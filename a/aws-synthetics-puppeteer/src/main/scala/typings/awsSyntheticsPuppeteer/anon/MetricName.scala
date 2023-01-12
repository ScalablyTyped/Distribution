package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricName extends StObject {
  
  var MetricName: Any
  
  var Timestamp: Any
  
  var Unit: Any
  
  var Value: Any
}
object MetricName {
  
  inline def apply(MetricName: Any, Timestamp: Any, Unit: Any, Value: Any): MetricName = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricName] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: Any): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Any): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: Any): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
