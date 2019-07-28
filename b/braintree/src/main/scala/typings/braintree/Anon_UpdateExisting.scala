package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UpdateExisting extends js.Object {
  var updateExisting: js.UndefOr[Boolean] = js.undefined
}

object Anon_UpdateExisting {
  @scala.inline
  def apply(updateExisting: js.UndefOr[Boolean] = js.undefined): Anon_UpdateExisting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateExisting)) __obj.updateDynamic("updateExisting")(updateExisting)
    __obj.asInstanceOf[Anon_UpdateExisting]
  }
}

