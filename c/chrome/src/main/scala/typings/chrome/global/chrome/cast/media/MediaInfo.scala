package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.MediaInfo")
@js.native
class MediaInfo protected ()
  extends typings.chrome.chrome.cast.media.MediaInfo {
  /**
    * @param {string} contentId
    * @param {string} contentType
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MediaInfo
    */
  def this(contentId: String, contentType: String) = this()
  /* CompleteClass */
  override var contentId: String = js.native
  /* CompleteClass */
  override var contentType: String = js.native
  /* CompleteClass */
  override var customData: js.Object = js.native
  /* CompleteClass */
  override var duration: Double = js.native
  /* CompleteClass */
  override var metadata: js.Any = js.native
  /* CompleteClass */
  override var streamType: typings.chrome.chrome.cast.media.StreamType = js.native
  /* CompleteClass */
  override var textTrackStyle: typings.chrome.chrome.cast.media.TextTrackStyle = js.native
  /* CompleteClass */
  override var tracks: js.Array[typings.chrome.chrome.cast.media.Track] = js.native
}

