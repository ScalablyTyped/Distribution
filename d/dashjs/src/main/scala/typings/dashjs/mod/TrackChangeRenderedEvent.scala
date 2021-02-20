package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.trackChangeRendered
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackChangeRenderedEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  var newMediaInfo: MediaInfo = js.native
  
  var oldMediaInfo: MediaInfo = js.native
  
  @JSName("type")
  var type_TrackChangeRenderedEvent: trackChangeRendered = js.native
}
object TrackChangeRenderedEvent {
  
  @scala.inline
  def apply(
    mediaType: video | audio | fragmentedText,
    newMediaInfo: MediaInfo,
    oldMediaInfo: MediaInfo,
    `type`: trackChangeRendered
  ): TrackChangeRenderedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], newMediaInfo = newMediaInfo.asInstanceOf[js.Any], oldMediaInfo = oldMediaInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackChangeRenderedEvent]
  }
  
  @scala.inline
  implicit class TrackChangeRenderedEventMutableBuilder[Self <: TrackChangeRenderedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewMediaInfo(value: MediaInfo): Self = StObject.set(x, "newMediaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldMediaInfo(value: MediaInfo): Self = StObject.set(x, "oldMediaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: trackChangeRendered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
