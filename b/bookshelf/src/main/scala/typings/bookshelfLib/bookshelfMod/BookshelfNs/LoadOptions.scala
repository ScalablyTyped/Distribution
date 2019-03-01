package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends SyncOptions {
  var withRelated: js.Array[java.lang.String | WithRelatedQuery]
}

object LoadOptions {
  @scala.inline
  def apply(
    withRelated: js.Array[java.lang.String | WithRelatedQuery],
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    transacting: knexLib.knexMod.KnexNs.Transaction = null
  ): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withRelated")(withRelated)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    __obj.asInstanceOf[LoadOptions]
  }
}

