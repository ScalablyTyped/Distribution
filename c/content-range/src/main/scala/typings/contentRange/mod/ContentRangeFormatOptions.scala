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
    first: Int | Double = null,
    last: Int | Double = null,
    length: Int | Double = null,
    limit: Int | Double = null
  ): ContentRangeFormatOptions = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeFormatOptions]
  }
}

