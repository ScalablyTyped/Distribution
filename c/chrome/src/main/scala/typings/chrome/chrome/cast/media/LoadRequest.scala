package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadRequest extends js.Object {
  
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
  implicit class LoadRequestOps[Self <: LoadRequest] (val x: Self) extends AnyVal {
    
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
    def setActiveTrackIdsVarargs(value: Double*): Self = this.set("activeTrackIds", js.Array(value :_*))
    
    @scala.inline
    def setActiveTrackIds(value: js.Array[Double]): Self = this.set("activeTrackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: MediaInfo): Self = this.set("media", value.asInstanceOf[js.Any])
  }
}
