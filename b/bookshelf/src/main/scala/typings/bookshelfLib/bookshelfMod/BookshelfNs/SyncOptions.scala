package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOptions extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var transacting: js.UndefOr[knexLib.knexMod.KnexNs.Transaction] = js.undefined
}

object SyncOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    transacting: knexLib.knexMod.KnexNs.Transaction = null
  ): SyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    __obj.asInstanceOf[SyncOptions]
  }
}

