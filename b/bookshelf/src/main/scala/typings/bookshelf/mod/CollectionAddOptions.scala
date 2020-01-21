package typings.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionAddOptions extends EventOptions {
  var at: js.UndefOr[Double] = js.undefined
  var merge: js.UndefOr[Boolean] = js.undefined
}

object CollectionAddOptions {
  @scala.inline
  def apply(
    at: Int | Double = null,
    merge: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
  ): CollectionAddOptions = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAddOptions]
  }
}

