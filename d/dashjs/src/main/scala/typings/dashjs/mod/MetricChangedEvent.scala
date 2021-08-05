package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.metricChanged
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricChangedEvent
  extends StObject
     with Event {
  
  var mediaType: video | audio | fragmentedText
  
  @JSName("type")
  var type_MetricChangedEvent: metricChanged
}
object MetricChangedEvent {
  
  inline def apply(mediaType: video | audio | fragmentedText): MetricChangedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("metricChanged")
    __obj.asInstanceOf[MetricChangedEvent]
  }
  
  extension [Self <: MetricChangedEvent](x: Self) {
    
    inline def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setType(value: metricChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
