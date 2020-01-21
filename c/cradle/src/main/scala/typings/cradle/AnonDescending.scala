package typings.cradle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescending extends js.Object {
  var descending: js.UndefOr[Boolean] = js.undefined
  var endkey: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[Boolean] = js.undefined
  var include_docs: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var reduce: js.UndefOr[Boolean] = js.undefined
  var startkey: js.UndefOr[js.Any] = js.undefined
}

object AnonDescending {
  @scala.inline
  def apply(
    descending: js.UndefOr[Boolean] = js.undefined,
    endkey: js.Any = null,
    group: js.UndefOr[Boolean] = js.undefined,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    limit: Int | Double = null,
    reduce: js.UndefOr[Boolean] = js.undefined,
    startkey: js.Any = null
  ): AnonDescending = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending.asInstanceOf[js.Any])
    if (endkey != null) __obj.updateDynamic("endkey")(endkey.asInstanceOf[js.Any])
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce)) __obj.updateDynamic("reduce")(reduce.asInstanceOf[js.Any])
    if (startkey != null) __obj.updateDynamic("startkey")(startkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescending]
  }
}

