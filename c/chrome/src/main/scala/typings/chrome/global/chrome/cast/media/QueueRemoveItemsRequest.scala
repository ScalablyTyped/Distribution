package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueRemoveItemsRequest")
@js.native
class QueueRemoveItemsRequest protected ()
  extends typings.chrome.chrome.cast.media.QueueRemoveItemsRequest {
  /**
    * @param {!Array<number>}
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueRemoveItemsRequest
    */
  def this(itemIdsToRemove: js.Array[Double]) = this()
  /* CompleteClass */
  override var customData: js.Object = js.native
  /* CompleteClass */
  override var itemIds: js.Array[Double] = js.native
}

