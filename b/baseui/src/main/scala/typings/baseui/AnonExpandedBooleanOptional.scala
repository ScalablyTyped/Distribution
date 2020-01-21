package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpandedBooleanOptional extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.undefined
}

object AnonExpandedBooleanOptional {
  @scala.inline
  def apply(expanded: js.UndefOr[Boolean] = js.undefined): AnonExpandedBooleanOptional = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpandedBooleanOptional]
  }
}

