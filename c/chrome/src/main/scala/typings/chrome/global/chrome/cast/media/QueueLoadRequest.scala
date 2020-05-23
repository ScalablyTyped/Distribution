package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueLoadRequest")
@js.native
class QueueLoadRequest protected ()
  extends typings.chrome.chrome.cast.media.QueueLoadRequest {
  /**
    * @param {!Array<chrome.cast.media.QueueItem>} items
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueLoadRequest
    */
  def this(items: js.Array[typings.chrome.chrome.cast.media.QueueItem]) = this()
  /* CompleteClass */
  override var customData: js.Object = js.native
  /* CompleteClass */
  override var items: js.Array[typings.chrome.chrome.cast.media.QueueItem] = js.native
  /* CompleteClass */
  override var repeatMode: typings.chrome.chrome.cast.media.RepeatMode = js.native
  /* CompleteClass */
  override var startIndex: Double = js.native
}

