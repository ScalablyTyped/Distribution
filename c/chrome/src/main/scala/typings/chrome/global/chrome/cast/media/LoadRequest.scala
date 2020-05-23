package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.LoadRequest")
@js.native
class LoadRequest protected ()
  extends typings.chrome.chrome.cast.media.LoadRequest {
  /**
    * @param {!chrome.cast.media.MediaInfo} mediaInfo
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.LoadRequest
    */
  def this(mediaInfo: typings.chrome.chrome.cast.media.MediaInfo) = this()
  /* CompleteClass */
  override var activeTrackIds: js.Array[Double] = js.native
  /* CompleteClass */
  override var autoplay: Boolean = js.native
  /* CompleteClass */
  override var currentTime: Double = js.native
  /* CompleteClass */
  override var customData: js.Object = js.native
  /* CompleteClass */
  override var media: typings.chrome.chrome.cast.media.MediaInfo = js.native
}

