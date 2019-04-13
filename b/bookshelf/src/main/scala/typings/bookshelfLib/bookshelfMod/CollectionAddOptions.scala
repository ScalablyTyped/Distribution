package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionAddOptions extends EventOptions {
  var at: js.UndefOr[scala.Double] = js.undefined
  var merge: js.UndefOr[scala.Boolean] = js.undefined
}

object CollectionAddOptions {
  @scala.inline
  def apply(
    at: scala.Int | scala.Double = null,
    merge: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): CollectionAddOptions = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[CollectionAddOptions]
  }
}

