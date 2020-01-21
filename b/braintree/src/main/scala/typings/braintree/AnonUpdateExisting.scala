package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdateExisting extends js.Object {
  var updateExisting: js.UndefOr[Boolean] = js.undefined
}

object AnonUpdateExisting {
  @scala.inline
  def apply(updateExisting: js.UndefOr[Boolean] = js.undefined): AnonUpdateExisting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateExisting)) __obj.updateDynamic("updateExisting")(updateExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUpdateExisting]
  }
}

