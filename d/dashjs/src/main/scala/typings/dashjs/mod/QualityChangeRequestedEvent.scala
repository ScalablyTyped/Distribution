package typings.dashjs.mod

import typings.dashjs.anon.DroppedFrames
import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.qualityChangeRequested
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
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
  implicit class QualityChangeRequestedEventMutableBuilder[Self <: QualityChangeRequestedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewQuality(value: Double): Self = StObject.set(x, "newQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldQuality(value: Double): Self = StObject.set(x, "oldQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: DroppedFrames): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNull: Self = StObject.set(x, "reason", null)
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamInfoNull: Self = StObject.set(x, "streamInfo", null)
    
    @scala.inline
    def setType(value: qualityChangeRequested): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
