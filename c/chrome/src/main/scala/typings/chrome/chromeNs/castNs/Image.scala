package typings.chrome.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.Image")
@js.native
class Image protected () extends js.Object {
  /**
    * @param {string} url
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Image
    */
  def this(url: String) = this()
  var height: js.UndefOr[Double] = js.native
  var url: String = js.native
  var width: js.UndefOr[Double] = js.native
}

