package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.Volume")
@js.native
/**
  * @param {?number=} opt_level
  * @param {?boolean=} opt_muted
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Volume
  */
class Volume () extends js.Object {
  def this(level: Double) = this()
  def this(level: Double, muted: Boolean) = this()
  var level: js.UndefOr[Double] = js.native
  var muted: js.UndefOr[Boolean] = js.native
}

