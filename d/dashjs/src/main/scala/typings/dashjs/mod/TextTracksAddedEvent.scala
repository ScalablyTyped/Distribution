package typings.dashjs.mod

import typings.dashjs.dashjsStrings.allTextTracksAdded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTracksAddedEvent extends Event {
  
  var enabled: Boolean = js.native
  
  var index: Double = js.native
  
  var tracks: js.Array[TextTrackInfo] = js.native
  
  @JSName("type")
  var type_TextTracksAddedEvent: allTextTracksAdded = js.native
}
object TextTracksAddedEvent {
  
  @scala.inline
  def apply(enabled: Boolean, index: Double, tracks: js.Array[TextTrackInfo], `type`: allTextTracksAdded): TextTracksAddedEvent = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTracksAddedEvent]
  }
  
  @scala.inline
  implicit class TextTracksAddedEventMutableBuilder[Self <: TextTracksAddedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracks(value: js.Array[TextTrackInfo]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksVarargs(value: TextTrackInfo*): Self = StObject.set(x, "tracks", js.Array(value :_*))
    
    @scala.inline
    def setType(value: allTextTracksAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
