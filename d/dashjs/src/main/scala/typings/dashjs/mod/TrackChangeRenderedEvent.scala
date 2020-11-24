package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.trackChangeRendered
import typings.dashjs.dashjsStrings.video
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
  implicit class TrackChangeRenderedEventOps[Self <: TrackChangeRenderedEvent] (val x: Self) extends AnyVal {
    
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
    def setNewMediaInfo(value: MediaInfo): Self = this.set("newMediaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldMediaInfo(value: MediaInfo): Self = this.set("oldMediaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: trackChangeRendered): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
