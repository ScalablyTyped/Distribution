package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFontSizeSpacing extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.undefined
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object BaseFontSizeSpacing {
  @scala.inline
  def apply(baseFontSize: js.UndefOr[Double] = js.undefined, spacing: js.Object = null): BaseFontSizeSpacing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseFontSize)) __obj.updateDynamic("baseFontSize")(baseFontSize.get.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFontSizeSpacing]
  }
}

