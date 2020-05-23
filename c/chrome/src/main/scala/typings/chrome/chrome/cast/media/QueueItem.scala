package typings.chrome.chrome.cast.media

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var activeTrackIds: js.Array[Number]
  var autoplay: Boolean
  var customData: js.Object
  var itemId: Double
  var media: MediaInfo
  var preloadTime: Double
  var startTime: Double
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
}

