package typings.carlo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOptions extends js.Object {
  /**
    * Background color using hex notation, defaults to '#ffffff'.
    */
  var bgcolor: js.UndefOr[String] = js.undefined
  /**
    * App window height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * App window left offset in pixels.
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * App window top offset in pixels.
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    * App window width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    bgcolor: String = null,
    height: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): WindowOptions = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

