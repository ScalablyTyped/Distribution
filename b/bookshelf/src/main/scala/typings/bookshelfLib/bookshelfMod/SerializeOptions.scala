package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeOptions extends js.Object {
  var omitPivot: js.UndefOr[scala.Boolean] = js.undefined
  var shallow: js.UndefOr[scala.Boolean] = js.undefined
}

object SerializeOptions {
  @scala.inline
  def apply(
    omitPivot: js.UndefOr[scala.Boolean] = js.undefined,
    shallow: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(omitPivot)) __obj.updateDynamic("omitPivot")(omitPivot)
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    __obj.asInstanceOf[SerializeOptions]
  }
}

