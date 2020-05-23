package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditTracksInfoRequest extends js.Object {
  var activeTrackIds: js.Array[Double]
  var textTrackStyle: TextTrackStyle
}

object EditTracksInfoRequest {
  @scala.inline
  def apply(activeTrackIds: js.Array[Double], textTrackStyle: TextTrackStyle): EditTracksInfoRequest = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], textTrackStyle = textTrackStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditTracksInfoRequest]
  }
}

