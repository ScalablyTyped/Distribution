package typings.blueimpLoadImage.mod

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
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    noRevoke: js.UndefOr[Boolean] = js.undefined
  ): BasicOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contain)) __obj.updateDynamic("contain")(contain.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cover)) __obj.updateDynamic("cover")(cover.get.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noRevoke)) __obj.updateDynamic("noRevoke")(noRevoke.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicOptions]
  }
}

