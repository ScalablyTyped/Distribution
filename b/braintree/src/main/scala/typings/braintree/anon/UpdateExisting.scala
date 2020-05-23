package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateExisting extends js.Object {
  var updateExisting: js.UndefOr[Boolean] = js.undefined
}

object UpdateExisting {
  @scala.inline
  def apply(updateExisting: js.UndefOr[Boolean] = js.undefined): UpdateExisting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateExisting)) __obj.updateDynamic("updateExisting")(updateExisting.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExisting]
  }
}

