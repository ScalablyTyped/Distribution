package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaInfo extends StObject {
  
  var contentId: String
  
  var contentType: String
  
  var customData: js.Object
  
  var duration: Double
  
  var metadata: Any
  
  var streamType: StreamType
  
  var textTrackStyle: TextTrackStyle
  
  var tracks: js.Array[Track]
}
object MediaInfo {
  
  inline def apply(
    contentId: String,
    contentType: String,
    customData: js.Object,
    duration: Double,
    metadata: Any,
    streamType: StreamType,
    textTrackStyle: TextTrackStyle,
    tracks: js.Array[Track]
  ): MediaInfo = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any], textTrackStyle = textTrackStyle.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInfo]
  }
  
  extension [Self <: MediaInfo](x: Self) {
    
    inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setStreamType(value: StreamType): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
    
    inline def setTextTrackStyle(value: TextTrackStyle): Self = StObject.set(x, "textTrackStyle", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: js.Array[Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: Track*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
