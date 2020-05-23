package typings.cordovaPluginCanvascamera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  /**
    * Number, optional, default: 288, output canvas height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Number, optional, default: 352, output canvas width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Height {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): Height = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

