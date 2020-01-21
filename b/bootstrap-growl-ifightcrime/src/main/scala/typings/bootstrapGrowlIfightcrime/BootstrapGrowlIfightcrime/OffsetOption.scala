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
  def apply(amount: Int | Double = null, from: OffsetPositionType = null): OffsetOption = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetOption]
  }
}

