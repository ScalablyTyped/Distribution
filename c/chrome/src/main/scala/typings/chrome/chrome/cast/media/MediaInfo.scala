package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaInfo extends js.Object {
  var contentId: String
  var contentType: String
  var customData: js.Object
  var duration: Double
  var metadata: js.Any
  var streamType: StreamType
  var textTrackStyle: TextTrackStyle
  var tracks: js.Array[Track]
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
}

