package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOptions extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var transacting: js.UndefOr[knexLib.knexMod.Transaction[_]] = js.undefined
  var withSchema: js.UndefOr[java.lang.String] = js.undefined
}

object SyncOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    transacting: knexLib.knexMod.Transaction[_] = null,
    withSchema: java.lang.String = null
  ): SyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema)
    __obj.asInstanceOf[SyncOptions]
  }
}

