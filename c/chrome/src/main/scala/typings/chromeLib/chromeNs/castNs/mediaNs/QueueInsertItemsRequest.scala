package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueInsertItemsRequest")
@js.native
class QueueInsertItemsRequest protected () extends js.Object {
  /**
           * @param {!Array<chrome.cast.media.QueueItem>}
           * @constructor
           * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueInsertItemsRequest
           */
  def this(itemsToInsert: js.Array[QueueItem]) = this()
  var customData: js.Object = js.native
  var insertBefore: scala.Double = js.native
  var items: js.Array[QueueItem] = js.native
}

