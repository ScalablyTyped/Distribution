package typings.contentRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentRangeFormatOptions extends js.Object {
  var first: js.UndefOr[Double] = js.undefined
  var last: js.UndefOr[Double] = js.undefined
  var length: Double | Null
  var limit: js.UndefOr[Double] = js.undefined
  var unit: String
}

object ContentRangeFormatOptions {
  @scala.inline
  def apply(
    unit: String,
    first: js.UndefOr[Double] = js.undefined,
    last: js.UndefOr[Double] = js.undefined,
    length: Double = null.asInstanceOf[Double],
    limit: js.UndefOr[Double] = js.undefined
  ): ContentRangeFormatOptions = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.get.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeFormatOptions]
  }
}

