package typings.dashjs.mod

import typings.dashjs.dashjsStrings.qualityChangeRendered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QualityChangeRenderedEvent
  extends StObject
     with Event {
  
  var mediaType: MediaType
  
  var newQuality: Double
  
  var oldQuality: Double
  
  @JSName("type")
  var type_QualityChangeRenderedEvent: qualityChangeRendered
}
object QualityChangeRenderedEvent {
  
  inline def apply(mediaType: MediaType, newQuality: Double, oldQuality: Double): QualityChangeRenderedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], newQuality = newQuality.asInstanceOf[js.Any], oldQuality = oldQuality.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("qualityChangeRendered")
    __obj.asInstanceOf[QualityChangeRenderedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QualityChangeRenderedEvent] (val x: Self) extends AnyVal {
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setNewQuality(value: Double): Self = StObject.set(x, "newQuality", value.asInstanceOf[js.Any])
    
    inline def setOldQuality(value: Double): Self = StObject.set(x, "oldQuality", value.asInstanceOf[js.Any])
    
    inline def setType(value: qualityChangeRendered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
