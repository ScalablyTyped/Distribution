package typings
package chromeLib.chromeNs.castNs

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
  def this(url: java.lang.String) = this()
  var height: js.UndefOr[scala.Double] = js.native
  var url: java.lang.String = js.native
  var width: js.UndefOr[scala.Double] = js.native
}

