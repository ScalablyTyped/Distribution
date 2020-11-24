package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.media.QueueUpdateItemsRequest")
@js.native
class QueueUpdateItemsRequest protected ()
  extends typings.chrome.chrome.cast.media.QueueUpdateItemsRequest {
  /**
    * @param {!Array<chrome.cast.media.QueueItem>}
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueUpdateItemsRequest
    */
  def this(itemsToUpdate: js.Array[typings.chrome.chrome.cast.media.QueueItem]) = this()
}
