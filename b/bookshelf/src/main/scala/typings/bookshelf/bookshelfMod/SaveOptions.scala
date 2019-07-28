package typings.bookshelf.bookshelfMod

import typings.knex.knexMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions extends SyncOptions {
  var defaults: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var patch: js.UndefOr[Boolean] = js.undefined
  var require: js.UndefOr[Boolean] = js.undefined
}

object SaveOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    defaults: String = null,
    method: String = null,
    patch: js.UndefOr[Boolean] = js.undefined,
    require: js.UndefOr[Boolean] = js.undefined,
    transacting: Transaction[_, _] = null,
    withSchema: String = null
  ): SaveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch)
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema)
    __obj.asInstanceOf[SaveOptions]
  }
}

