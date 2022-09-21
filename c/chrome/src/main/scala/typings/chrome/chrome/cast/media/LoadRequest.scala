package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadRequest extends StObject {
  
  var activeTrackIds: js.Array[Double]
  
  var autoplay: Boolean
  
  var currentTime: Double
  
  var customData: js.Object
  
  var media: MediaInfo
  
  var playbackRate: js.UndefOr[Double] = js.undefined
}
object LoadRequest {
  
  inline def apply(
    activeTrackIds: js.Array[Double],
    autoplay: Boolean,
    currentTime: Double,
    customData: js.Object,
    media: MediaInfo
  ): LoadRequest = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadRequest]
  }
  
  extension [Self <: LoadRequest](x: Self) {
    
    inline def setActiveTrackIds(value: js.Array[Double]): Self = StObject.set(x, "activeTrackIds", value.asInstanceOf[js.Any])
    
    inline def setActiveTrackIdsVarargs(value: Double*): Self = StObject.set(x, "activeTrackIds", js.Array(value*))
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: MediaInfo): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
  }
}
