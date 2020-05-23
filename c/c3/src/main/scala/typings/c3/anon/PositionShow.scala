package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionShow extends js.Object {
  var position: js.UndefOr[Top] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
}

object PositionShow {
  @scala.inline
  def apply(
    position: Top = null,
    show: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined
  ): PositionShow = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionShow]
  }
}

