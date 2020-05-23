package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinWidth extends js.Object {
  /**
    * Defaults to `5`.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
}

object MinWidth {
  @scala.inline
  def apply(minWidth: js.UndefOr[Double] = js.undefined): MinWidth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinWidth]
  }
}

