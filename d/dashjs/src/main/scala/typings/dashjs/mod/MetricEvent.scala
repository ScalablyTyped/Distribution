package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.metricAdded
import typings.dashjs.dashjsStrings.metricUpdated
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  var metric: MetricType = js.native
  
  @JSName("type")
  var type_MetricEvent: metricAdded | metricUpdated = js.native
  
  var value: js.Object = js.native
}
object MetricEvent {
  
  @scala.inline
  def apply(
    mediaType: video | audio | fragmentedText,
    metric: MetricType,
    `type`: metricAdded | metricUpdated,
    value: js.Object
  ): MetricEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricEvent]
  }
  
  @scala.inline
  implicit class MetricEventMutableBuilder[Self <: MetricEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: MetricType): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: metricAdded | metricUpdated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
