package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadRequest extends StObject {
  
  var activeTrackIds: js.Array[Double] = js.native
  
  var autoplay: Boolean = js.native
  
  var currentTime: Double = js.native
  
  var customData: js.Object = js.native
  
  var media: MediaInfo = js.native
}
object LoadRequest {
  
  @scala.inline
  def apply(
    activeTrackIds: js.Array[Double],
    autoplay: Boolean,
    currentTime: Double,
    customData: js.Object,
    media: MediaInfo
  ): LoadRequest = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadRequest]
  }
  
  @scala.inline
  implicit class LoadRequestMutableBuilder[Self <: LoadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTrackIds(value: js.Array[Double]): Self = StObject.set(x, "activeTrackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTrackIdsVarargs(value: Double*): Self = StObject.set(x, "activeTrackIds", js.Array(value :_*))
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: MediaInfo): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
