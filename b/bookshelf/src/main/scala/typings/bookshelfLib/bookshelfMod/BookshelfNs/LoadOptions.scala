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
    transacting: knexLib.knexMod.KnexNs.Transaction = null,
    withSchema: java.lang.String = null
  ): LoadOptions = {
    val __obj = js.Dynamic.literal(withRelated = withRelated)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema)
    __obj.asInstanceOf[LoadOptions]
  }
}

