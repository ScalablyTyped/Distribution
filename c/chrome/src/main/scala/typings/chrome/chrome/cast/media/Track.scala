package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Track extends StObject {
  
  var customData: js.Object = js.native
  
  var language: String = js.native
  
  var name: String = js.native
  
  var subtype: TextTrackType = js.native
  
  var trackContentId: String = js.native
  
  var trackContentType: String = js.native
  
  var trackId: Double = js.native
  
  var `type`: TrackType = js.native
}
object Track {
  
  @scala.inline
  def apply(
    customData: js.Object,
    language: String,
    name: String,
    subtype: TextTrackType,
    trackContentId: String,
    trackContentType: String,
    trackId: Double,
    `type`: TrackType
  ): Track = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], trackContentId = trackContentId.asInstanceOf[js.Any], trackContentType = trackContentType.asInstanceOf[js.Any], trackId = trackId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit class TrackMutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(value: TextTrackType): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackContentId(value: String): Self = StObject.set(x, "trackContentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackContentType(value: String): Self = StObject.set(x, "trackContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackId(value: Double): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TrackType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
