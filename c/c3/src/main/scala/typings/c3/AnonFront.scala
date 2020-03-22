package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFront extends js.Object {
  var front: js.UndefOr[Boolean] = js.undefined
}

object AnonFront {
  @scala.inline
  def apply(front: js.UndefOr[Boolean] = js.undefined): AnonFront = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(front)) __obj.updateDynamic("front")(front.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFront]
  }
}

