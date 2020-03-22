package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShow extends js.Object {
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonShow {
  @scala.inline
  def apply(show: js.UndefOr[Boolean] = js.undefined): AnonShow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShow]
  }
}

