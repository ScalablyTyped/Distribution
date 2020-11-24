package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaInfo extends js.Object {
  
  var contentId: String = js.native
  
  var contentType: String = js.native
  
  var customData: js.Object = js.native
  
  var duration: Double = js.native
  
  var metadata: js.Any = js.native
  
  var streamType: StreamType = js.native
  
  var textTrackStyle: TextTrackStyle = js.native
  
  var tracks: js.Array[Track] = js.native
}
object MediaInfo {
  
  @scala.inline
  def apply(
    contentId: String,
    contentType: String,
    customData: js.Object,
    duration: Double,
    metadata: js.Any,
    streamType: StreamType,
    textTrackStyle: TextTrackStyle,
    tracks: js.Array[Track]
  ): MediaInfo = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any], textTrackStyle = textTrackStyle.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInfo]
  }
  
  @scala.inline
  implicit class MediaInfoOps[Self <: MediaInfo] (val x: Self) extends AnyVal {
    
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
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamType(value: StreamType): Self = this.set("streamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTrackStyle(value: TextTrackStyle): Self = this.set("textTrackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksVarargs(value: Track*): Self = this.set("tracks", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[Track]): Self = this.set("tracks", value.asInstanceOf[js.Any])
  }
}
