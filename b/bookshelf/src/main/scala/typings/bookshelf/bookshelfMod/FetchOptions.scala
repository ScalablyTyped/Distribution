package typings.bookshelf.bookshelfMod

import typings.knex.knexMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends SyncOptions {
  var columns: js.UndefOr[String | js.Array[String]] = js.undefined
  var require: js.UndefOr[Boolean] = js.undefined
  var withRelated: js.UndefOr[js.Array[String | WithRelatedQuery]] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    columns: String | js.Array[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    require: js.UndefOr[Boolean] = js.undefined,
    transacting: Transaction[_, _] = null,
    withRelated: js.Array[String | WithRelatedQuery] = null,
    withSchema: String = null
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

