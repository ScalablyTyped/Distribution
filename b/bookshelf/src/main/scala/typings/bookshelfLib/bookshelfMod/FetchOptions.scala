package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends SyncOptions {
  var columns: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var require: js.UndefOr[scala.Boolean] = js.undefined
  var withRelated: js.UndefOr[js.Array[java.lang.String | WithRelatedQuery]] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    columns: java.lang.String | js.Array[java.lang.String] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    require: js.UndefOr[scala.Boolean] = js.undefined,
    transacting: knexLib.knexMod.Transaction[_] = null,
    withRelated: js.Array[java.lang.String | WithRelatedQuery] = null,
    withSchema: java.lang.String = null
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    if (withRelated != null) __obj.updateDynamic("withRelated")(withRelated)
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema)
    __obj.asInstanceOf[FetchOptions]
  }
}

