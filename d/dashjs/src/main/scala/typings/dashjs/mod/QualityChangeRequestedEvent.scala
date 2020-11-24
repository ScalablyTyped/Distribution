package typings.dashjs.mod

import typings.dashjs.anon.DroppedFrames
import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.qualityChangeRequested
import typings.dashjs.dashjsStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualityChangeRequestedEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  var newQuality: Double = js.native
  
  var oldQuality: Double = js.native
  
  var reason: DroppedFrames | Null = js.native
  
  var streamInfo: StreamInfo | Null = js.native
  
  @JSName("type")
  var type_QualityChangeRequestedEvent: qualityChangeRequested = js.native
}
object QualityChangeRequestedEvent {
  
  @scala.inline
  def apply(
    mediaType: video | audio | fragmentedText,
    newQuality: Double,
    oldQuality: Double,
    `type`: qualityChangeRequested
  ): QualityChangeRequestedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], newQuality = newQuality.asInstanceOf[js.Any], oldQuality = oldQuality.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualityChangeRequestedEvent]
  }
  
  @scala.inline
  implicit class QualityChangeRequestedEventOps[Self <: QualityChangeRequestedEvent] (val x: Self) extends AnyVal {
    
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
    def setNewQuality(value: Double): Self = this.set("newQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldQuality(value: Double): Self = this.set("oldQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: qualityChangeRequested): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: DroppedFrames): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNull: Self = this.set("reason", null)
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = this.set("streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamInfoNull: Self = this.set("streamInfo", null)
  }
}
