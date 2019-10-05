package typings.chrome.chrome.cast.media

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueItem")
@js.native
class QueueItem protected () extends js.Object {
  /**
    * @param {!chrome.cast.media.MediaInfo} mediaInfo
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueItem
    */
  def this(mediaInfo: MediaInfo) = this()
  var activeTrackIds: js.Array[Number] = js.native
  var autoplay: Boolean = js.native
  var customData: js.Object = js.native
  var itemId: Double = js.native
  var media: MediaInfo = js.native
  var preloadTime: Double = js.native
  var startTime: Double = js.native
}

