package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Track extends js.Object {
  
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
  implicit class TrackOps[Self <: Track] (val x: Self) extends AnyVal {
    
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
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(value: TextTrackType): Self = this.set("subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackContentId(value: String): Self = this.set("trackContentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackContentType(value: String): Self = this.set("trackContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackId(value: Double): Self = this.set("trackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TrackType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
