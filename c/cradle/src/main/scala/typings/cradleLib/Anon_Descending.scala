package typings
package cradleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Descending extends js.Object {
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  var endkey: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[scala.Boolean] = js.undefined
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var reduce: js.UndefOr[scala.Boolean] = js.undefined
  var startkey: js.UndefOr[js.Any] = js.undefined
}

object Anon_Descending {
  @scala.inline
  def apply(
    descending: js.UndefOr[scala.Boolean] = js.undefined,
    endkey: js.Any = null,
    group: js.UndefOr[scala.Boolean] = js.undefined,
    include_docs: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    reduce: js.UndefOr[scala.Boolean] = js.undefined,
    startkey: js.Any = null
  ): Anon_Descending = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (endkey != null) __obj.updateDynamic("endkey")(endkey)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (key != null) __obj.updateDynamic("key")(key)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce)) __obj.updateDynamic("reduce")(reduce)
    if (startkey != null) __obj.updateDynamic("startkey")(startkey)
    __obj.asInstanceOf[Anon_Descending]
  }
}

