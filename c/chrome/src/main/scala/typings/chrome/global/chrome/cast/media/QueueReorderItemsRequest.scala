package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueReorderItemsRequest")
@js.native
class QueueReorderItemsRequest protected ()
  extends typings.chrome.chrome.cast.media.QueueReorderItemsRequest {
  /**
    * @param {!Array<number>}
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueReorderItemsRequest
    */
  def this(itemIdsToReorder: js.Array[Double]) = this()
  /* CompleteClass */
  override var customData: js.Object = js.native
  /* CompleteClass */
  override var insertBefore: Double = js.native
  /* CompleteClass */
  override var itemIds: js.Array[Double] = js.native
}

