package typings.bookshelf.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeOptions extends js.Object {
  var omitPivot: js.UndefOr[Boolean] = js.undefined
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object SerializeOptions {
  @scala.inline
  def apply(omitPivot: js.UndefOr[Boolean] = js.undefined, shallow: js.UndefOr[Boolean] = js.undefined): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(omitPivot)) __obj.updateDynamic("omitPivot")(omitPivot.asInstanceOf[js.Any])
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeOptions]
  }
}

