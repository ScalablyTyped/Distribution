package typings.bookshelf.mod

import typings.knex.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var transacting: js.UndefOr[Transaction[_, _]] = js.undefined
  var withSchema: js.UndefOr[String] = js.undefined
}

object SyncOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    transacting: Transaction[_, _] = null,
    withSchema: String = null
  ): SyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (transacting != null) __obj.updateDynamic("transacting")(transacting.asInstanceOf[js.Any])
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncOptions]
  }
}

