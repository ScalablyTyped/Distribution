package typings.cordovaPluginCanvascamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightWidth extends js.Object {
  /**
    * Number, optional, default: 288, output canvas height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Number, optional, default: 352, output canvas width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AnonHeightWidth {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): AnonHeightWidth = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightWidth]
  }
}

