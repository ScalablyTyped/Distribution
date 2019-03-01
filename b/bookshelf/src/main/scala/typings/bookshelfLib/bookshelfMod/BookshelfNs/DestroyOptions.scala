package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyOptions extends SyncOptions {
  var require: js.UndefOr[scala.Boolean] = js.undefined
}

object DestroyOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    require: js.UndefOr[scala.Boolean] = js.undefined,
    transacting: knexLib.knexMod.KnexNs.Transaction = null
  ): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    __obj.asInstanceOf[DestroyOptions]
  }
}

