package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.fragmentedText
import typings.dashjs.dashjsStrings.qualityChangeRendered
import typings.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualityChangeRenderedEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  var newQuality: Double = js.native
  
  var oldQuality: Double = js.native
  
  @JSName("type")
  var type_QualityChangeRenderedEvent: qualityChangeRendered = js.native
}
object QualityChangeRenderedEvent {
  
  @scala.inline
  def apply(
    mediaType: video | audio | fragmentedText,
    newQuality: Double,
    oldQuality: Double,
    `type`: qualityChangeRendered
  ): QualityChangeRenderedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], newQuality = newQuality.asInstanceOf[js.Any], oldQuality = oldQuality.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualityChangeRenderedEvent]
  }
  
  @scala.inline
  implicit class QualityChangeRenderedEventMutableBuilder[Self <: QualityChangeRenderedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewQuality(value: Double): Self = StObject.set(x, "newQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldQuality(value: Double): Self = StObject.set(x, "oldQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: qualityChangeRendered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
