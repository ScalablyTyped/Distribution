package typings.dashjs.mod

import typings.dashjs.dashjsStrings.allTextTracksAdded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTracksAddedEvent
  extends StObject
     with Event {
  
  var enabled: Boolean
  
  var index: Double
  
  var tracks: js.Array[TextTrackInfo]
  
  @JSName("type")
  var type_TextTracksAddedEvent: allTextTracksAdded
}
object TextTracksAddedEvent {
  
  inline def apply(enabled: Boolean, index: Double, tracks: js.Array[TextTrackInfo]): TextTracksAddedEvent = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("allTextTracksAdded")
    __obj.asInstanceOf[TextTracksAddedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextTracksAddedEvent] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: js.Array[TextTrackInfo]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: TextTrackInfo*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setType(value: allTextTracksAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
