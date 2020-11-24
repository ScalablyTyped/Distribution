package typings.chrome.chrome.cast.media

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueItem extends js.Object {
  
  var activeTrackIds: js.Array[Number] = js.native
  
  var autoplay: Boolean = js.native
  
  var customData: js.Object = js.native
  
  var itemId: Double = js.native
  
  var media: MediaInfo = js.native
  
  var preloadTime: Double = js.native
  
  var startTime: Double = js.native
}
object QueueItem {
  
  @scala.inline
  def apply(
    activeTrackIds: js.Array[Number],
    autoplay: Boolean,
    customData: js.Object,
    itemId: Double,
    media: MediaInfo,
    preloadTime: Double,
    startTime: Double
  ): QueueItem = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], preloadTime = preloadTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
    
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
    def setActiveTrackIdsVarargs(value: Number*): Self = this.set("activeTrackIds", js.Array(value :_*))
    
    @scala.inline
    def setActiveTrackIds(value: js.Array[Number]): Self = this.set("activeTrackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: Double): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: MediaInfo): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadTime(value: Double): Self = this.set("preloadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
}
