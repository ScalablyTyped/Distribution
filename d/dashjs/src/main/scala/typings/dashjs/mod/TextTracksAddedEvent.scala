package typings.dashjs.mod

import typings.dashjs.dashjsStrings.allTextTracksAdded
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
  implicit class TextTracksAddedEventOps[Self <: TextTracksAddedEvent] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksVarargs(value: TextTrackInfo*): Self = this.set("tracks", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[TextTrackInfo]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: allTextTracksAdded): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
