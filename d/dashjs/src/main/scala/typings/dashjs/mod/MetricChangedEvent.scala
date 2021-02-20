package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.metricChanged
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricChangedEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  @JSName("type")
  var type_MetricChangedEvent: metricChanged = js.native
}
object MetricChangedEvent {
  
  @scala.inline
  def apply(mediaType: video | audio | fragmentedText, `type`: metricChanged): MetricChangedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricChangedEvent]
  }
  
  @scala.inline
  implicit class MetricChangedEventMutableBuilder[Self <: MetricChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: metricChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
