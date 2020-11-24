package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.metricAdded
import typings.dashjs.dashjsStrings.metricUpdated
import typings.dashjs.dashjsStrings.video
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
  implicit class MetricEventOps[Self <: MetricEvent] (val x: Self) extends AnyVal {
    
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
    def setMediaType(value: video | audio | fragmentedText): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: MetricType): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: metricAdded | metricUpdated): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Object): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
