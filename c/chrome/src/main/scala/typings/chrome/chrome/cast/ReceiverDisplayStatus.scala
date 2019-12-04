package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.ReceiverDisplayStatus")
@js.native
class ReceiverDisplayStatus protected () extends js.Object {
  /**
    * @param {string} statusText
    * @param {!Array<chrome.cast.Image>} appImages
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.ReceiverDisplayStatus
    */
  def this(statusText: String, appImages: js.Array[Image]) = this()
  var appImages: js.Array[Image] = js.native
  var statusText: String = js.native
}

