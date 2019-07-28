package typings.chrome.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.LoadRequest")
@js.native
class LoadRequest protected () extends js.Object {
  /**
    * @param {!chrome.cast.media.MediaInfo} mediaInfo
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.LoadRequest
    */
  def this(mediaInfo: MediaInfo) = this()
  var activeTrackIds: js.Array[Double] = js.native
  var autoplay: Boolean = js.native
  var currentTime: Double = js.native
  var customData: js.Object = js.native
  var media: MediaInfo = js.native
}

