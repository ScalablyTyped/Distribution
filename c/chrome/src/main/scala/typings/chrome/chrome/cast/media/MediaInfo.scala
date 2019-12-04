package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.MediaInfo")
@js.native
class MediaInfo protected () extends js.Object {
  /**
    * @param {string} contentId
    * @param {string} contentType
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MediaInfo
    */
  def this(contentId: String, contentType: String) = this()
  var contentId: String = js.native
  var contentType: String = js.native
  var customData: js.Object = js.native
  var duration: Double = js.native
  var metadata: js.Object = js.native
  var streamType: StreamType = js.native
  var textTrackStyle: TextTrackStyle = js.native
  var tracks: js.Array[Track] = js.native
}

