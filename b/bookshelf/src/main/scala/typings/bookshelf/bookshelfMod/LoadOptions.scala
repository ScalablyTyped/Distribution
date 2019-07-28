package typings.bookshelf.bookshelfMod

import typings.knex.knexMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends SyncOptions {
  var withRelated: js.Array[String | WithRelatedQuery]
}

object LoadOptions {
  @scala.inline
  def apply(
    withRelated: js.Array[String | WithRelatedQuery],
    debug: js.UndefOr[Boolean] = js.undefined,
    transacting: Transaction[_, _] = null,
    withSchema: String = null
  ): LoadOptions = {
    val __obj = js.Dynamic.literal(withRelated = withRelated)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (transacting != null) __obj.updateDynamic("transacting")(transacting)
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema)
    __obj.asInstanceOf[LoadOptions]
  }
}

