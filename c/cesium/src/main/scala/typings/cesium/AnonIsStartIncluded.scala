package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsStartIncluded extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var isStartIncluded: js.UndefOr[Boolean] = js.undefined
  var isStopIncluded: js.UndefOr[Boolean] = js.undefined
  var iso8601: String
}

object AnonIsStartIncluded {
  @scala.inline
  def apply(
    iso8601: String,
    data: js.Any = null,
    isStartIncluded: js.UndefOr[Boolean] = js.undefined,
    isStopIncluded: js.UndefOr[Boolean] = js.undefined
  ): AnonIsStartIncluded = {
    val __obj = js.Dynamic.literal(iso8601 = iso8601.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(isStartIncluded)) __obj.updateDynamic("isStartIncluded")(isStartIncluded.asInstanceOf[js.Any])
    if (!js.isUndefined(isStopIncluded)) __obj.updateDynamic("isStopIncluded")(isStopIncluded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsStartIncluded]
  }
}

