package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadRequest extends js.Object {
  var activeTrackIds: js.Array[Double]
  var autoplay: Boolean
  var currentTime: Double
  var customData: js.Object
  var media: MediaInfo
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
}

