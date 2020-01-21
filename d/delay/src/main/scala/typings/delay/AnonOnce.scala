package typings.delay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnce extends js.Object {
  var once: js.UndefOr[Boolean] = js.undefined
}

object AnonOnce {
  @scala.inline
  def apply(once: js.UndefOr[Boolean] = js.undefined): AnonOnce = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnce]
  }
}

