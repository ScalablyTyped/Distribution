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
    at: js.UndefOr[Double] = js.undefined,
    merge: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
  ): CollectionAddOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(at)) __obj.updateDynamic("at")(at.get.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionAddOptions]
  }
}

