package typings.chrome.chrome.cast.media

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueItem extends StObject {
  
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
  implicit class QueueItemMutableBuilder[Self <: QueueItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTrackIds(value: js.Array[Number]): Self = StObject.set(x, "activeTrackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTrackIdsVarargs(value: Number*): Self = StObject.set(x, "activeTrackIds", js.Array(value :_*))
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: Double): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: MediaInfo): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadTime(value: Double): Self = StObject.set(x, "preloadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
