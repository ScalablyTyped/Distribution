package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataIsStartIncluded extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var isStartIncluded: js.UndefOr[scala.Boolean] = js.undefined
  var isStopIncluded: js.UndefOr[scala.Boolean] = js.undefined
  var iso8601: java.lang.String
}

object Anon_DataIsStartIncluded {
  @scala.inline
  def apply(
    iso8601: java.lang.String,
    data: js.Any = null,
    isStartIncluded: js.UndefOr[scala.Boolean] = js.undefined,
    isStopIncluded: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DataIsStartIncluded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iso8601")(iso8601)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(isStartIncluded)) __obj.updateDynamic("isStartIncluded")(isStartIncluded)
    if (!js.isUndefined(isStopIncluded)) __obj.updateDynamic("isStopIncluded")(isStopIncluded)
    __obj.asInstanceOf[Anon_DataIsStartIncluded]
  }
}

