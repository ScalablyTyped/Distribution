package typings.bootstrapGrowlIfightcrime.BootstrapGrowlIfightcrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetOption extends js.Object {
  /**
    * Offset amount
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * Position: top or bottom
    */
  var from: js.UndefOr[OffsetPositionType] = js.undefined
}

object OffsetOption {
  @scala.inline
  def apply(amount: js.UndefOr[Double] = js.undefined, from: OffsetPositionType = null): OffsetOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetOption]
  }
}

