package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.trackChangeRendered
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackChangeRenderedEvent
  extends StObject
     with Event {
  
  var mediaType: video | audio | fragmentedText
  
  var newMediaInfo: MediaInfo
  
  var oldMediaInfo: MediaInfo
  
  @JSName("type")
  var type_TrackChangeRenderedEvent: trackChangeRendered
}
object TrackChangeRenderedEvent {
  
  inline def apply(mediaType: video | audio | fragmentedText, newMediaInfo: MediaInfo, oldMediaInfo: MediaInfo): TrackChangeRenderedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], newMediaInfo = newMediaInfo.asInstanceOf[js.Any], oldMediaInfo = oldMediaInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("trackChangeRendered")
    __obj.asInstanceOf[TrackChangeRenderedEvent]
  }
  
  extension [Self <: TrackChangeRenderedEvent](x: Self) {
    
    inline def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setNewMediaInfo(value: MediaInfo): Self = StObject.set(x, "newMediaInfo", value.asInstanceOf[js.Any])
    
    inline def setOldMediaInfo(value: MediaInfo): Self = StObject.set(x, "oldMediaInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: trackChangeRendered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
