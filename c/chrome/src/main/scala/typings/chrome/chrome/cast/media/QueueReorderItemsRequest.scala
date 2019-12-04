package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueReorderItemsRequest")
@js.native
class QueueReorderItemsRequest protected () extends js.Object {
  /**
    * @param {!Array<number>}
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueReorderItemsRequest
    */
  def this(itemIdsToReorder: js.Array[Double]) = this()
  var customData: js.Object = js.native
  var insertBefore: Double = js.native
  var itemIds: js.Array[Double] = js.native
}

