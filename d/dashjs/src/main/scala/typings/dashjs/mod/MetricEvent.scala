package typings.dashjs.mod

import typings.dashjs.dashjsStrings.metricAdded
import typings.dashjs.dashjsStrings.metricUpdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricEvent
  extends StObject
     with Event {
  
  var mediaType: MediaType
  
  var metric: MetricType
  
  @JSName("type")
  var type_MetricEvent: metricAdded | metricUpdated
  
  var value: js.Object
}
object MetricEvent {
  
  inline def apply(mediaType: MediaType, metric: MetricType, `type`: metricAdded | metricUpdated, value: js.Object): MetricEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricEvent] (val x: Self) extends AnyVal {
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: MetricType): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setType(value: metricAdded | metricUpdated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
