package typings.bookshelf.bookshelfMod

import typings.knex.knexMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyOptions extends SyncOptions {
  var require: js.UndefOr[Boolean] = js.undefined
}

object DestroyOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    require: js.UndefOr[Boolean] = js.undefined,
    transacting: Transaction[_, _] = null,
    withSchema: String = null
  ): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema)
    __obj.asInstanceOf[DestroyOptions]
  }
}

