package typings.bookshelf.bookshelfMod

import typings.knex.knexMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionCreateOptions
  extends CollectionAddOptions
     with ModelOptions
     with SaveOptions

object CollectionCreateOptions {
  @scala.inline
  def apply(
    at: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaults: String = null,
    hasTimestamps: js.UndefOr[Boolean] = js.undefined,
    merge: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    parse: js.UndefOr[Boolean] = js.undefined,
    patch: js.UndefOr[Boolean] = js.undefined,
    require: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    tableName: String = null,
    transacting: Transaction[_, _] = null,
    withSchema: String = null
  ): CollectionCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTimestamps)) __obj.updateDynamic("hasTimestamps")(hasTimestamps.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (transacting != null) __obj.updateDynamic("transacting")(transacting.asInstanceOf[js.Any])
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionCreateOptions]
  }
}

