package typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicOptions extends js.Object {
  var contain: js.UndefOr[Boolean] = js.undefined
  var cover: js.UndefOr[Boolean] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var noRevoke: js.UndefOr[Boolean] = js.undefined
}

object BasicOptions {
  @scala.inline
  def apply(
    contain: js.UndefOr[Boolean] = js.undefined,
    cover: js.UndefOr[Boolean] = js.undefined,
    crossOrigin: String = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    noRevoke: js.UndefOr[Boolean] = js.undefined
  ): BasicOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contain)) __obj.updateDynamic("contain")(contain)
    if (!js.isUndefined(cover)) __obj.updateDynamic("cover")(cover)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noRevoke)) __obj.updateDynamic("noRevoke")(noRevoke)
    __obj.asInstanceOf[BasicOptions]
  }
}

