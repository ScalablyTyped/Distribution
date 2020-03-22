package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPositionShow extends js.Object {
  var position: js.UndefOr[AnonTop] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
}

object AnonPositionShow {
  @scala.inline
  def apply(position: AnonTop = null, show: js.UndefOr[Boolean] = js.undefined, x: Int | Double = null): AnonPositionShow = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPositionShow]
  }
}

