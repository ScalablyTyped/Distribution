package typings.carlo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  /**
    * Height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Left offset in pixels.
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * Top offset in pixels.
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    * Width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Height {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

