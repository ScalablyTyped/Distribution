package typings.bookshelf.mod

import typings.knex.mod.Transaction
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
    val __obj = js.Dynamic.literal(withRelated = withRelated.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (transacting != null) __obj.updateDynamic("transacting")(transacting.asInstanceOf[js.Any])
    if (withSchema != null) __obj.updateDynamic("withSchema")(withSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOptions]
  }
}

