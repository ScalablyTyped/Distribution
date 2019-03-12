package typings
package bookshelfLib.bookshelfMod.BookshelfNs

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
    at: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    defaults: java.lang.String = null,
    hasTimestamps: js.UndefOr[scala.Boolean] = js.undefined,
    merge: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    parse: js.UndefOr[scala.Boolean] = js.undefined,
    patch: js.UndefOr[scala.Boolean] = js.undefined,
    require: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    tableName: java.lang.String = null,
    transacting: knexLib.knexMod.KnexNs.Transaction = null,
    withSchema: java.lang.String = null
  ): CollectionCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(hasTimestamps)) __obj.updateDynamic("hasTimestamps")(hasTimestamps)
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch)
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema)
    __obj.asInstanceOf[CollectionCreateOptions]
  }
}

