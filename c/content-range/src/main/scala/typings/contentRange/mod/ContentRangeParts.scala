package typings.contentRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentRangeParts extends js.Object {
  var first: Double | Null
  var last: Double | Null
  var length: Double | Null
  var unit: String
}

object ContentRangeParts {
  @scala.inline
  def apply(
    unit: String,
    first: Double = null.asInstanceOf[Double],
    last: Double = null.asInstanceOf[Double],
    length: Double = null.asInstanceOf[Double]
  ): ContentRangeParts = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeParts]
  }
}

