package typings.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInclusive extends js.Object {
  var inclusive: js.UndefOr[Boolean] = js.undefined
}

object AnonInclusive {
  @scala.inline
  def apply(inclusive: js.UndefOr[Boolean] = js.undefined): AnonInclusive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inclusive)) __obj.updateDynamic("inclusive")(inclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInclusive]
  }
}

