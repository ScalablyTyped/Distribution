package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueRemoveItemsRequest")
@js.native
class QueueRemoveItemsRequest protected () extends js.Object {
  /**
    * @param {!Array<number>}
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueRemoveItemsRequest
    */
  def this(itemIdsToRemove: js.Array[Double]) = this()
  var customData: js.Object = js.native
  var itemIds: js.Array[Double] = js.native
}

