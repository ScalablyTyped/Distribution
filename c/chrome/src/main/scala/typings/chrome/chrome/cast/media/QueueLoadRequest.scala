package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueLoadRequest")
@js.native
class QueueLoadRequest protected () extends js.Object {
  /**
    * @param {!Array<chrome.cast.media.QueueItem>} items
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueLoadRequest
    */
  def this(items: js.Array[QueueItem]) = this()
  var customData: js.Object = js.native
  var items: js.Array[QueueItem] = js.native
  var repeatMode: RepeatMode = js.native
  var startIndex: Double = js.native
}

