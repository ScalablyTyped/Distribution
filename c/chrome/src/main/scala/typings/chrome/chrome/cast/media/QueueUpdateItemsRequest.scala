package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueUpdateItemsRequest")
@js.native
class QueueUpdateItemsRequest protected () extends js.Object {
  /**
    * @param {!Array<chrome.cast.media.QueueItem>}
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueUpdateItemsRequest
    */
  def this(itemsToUpdate: js.Array[QueueItem]) = this()
  var customData: js.Object = js.native
  var item: js.Array[QueueItem] = js.native
}

