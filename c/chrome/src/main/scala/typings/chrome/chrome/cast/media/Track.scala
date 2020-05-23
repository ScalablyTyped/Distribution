package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Track extends js.Object {
  var customData: js.Object
  var language: String
  var name: String
  var subtype: TextTrackType
  var trackContentId: String
  var trackContentType: String
  var trackId: Double
  var `type`: TrackType
}

object Track {
  @scala.inline
  def apply(
    customData: js.Object,
    language: String,
    name: String,
    subtype: TextTrackType,
    trackContentId: String,
    trackContentType: String,
    trackId: Double,
    `type`: TrackType
  ): Track = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], trackContentId = trackContentId.asInstanceOf[js.Any], trackContentType = trackContentType.asInstanceOf[js.Any], trackId = trackId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
}

