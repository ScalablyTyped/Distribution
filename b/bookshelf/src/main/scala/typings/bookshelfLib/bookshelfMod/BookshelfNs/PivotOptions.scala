package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotOptions extends js.Object {
  var query: js.UndefOr[js.Function | js.Any] = js.undefined
  var require: js.UndefOr[scala.Boolean] = js.undefined
}

object PivotOptions {
  @scala.inline
  def apply(query: js.Function | js.Any = null, require: js.UndefOr[scala.Boolean] = js.undefined): PivotOptions = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require)
    __obj.asInstanceOf[PivotOptions]
  }
}

