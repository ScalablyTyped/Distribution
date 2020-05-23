package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRange extends js.Object {
  /**
    * A date range unit for the date filter.
    */
  var Unit: js.UndefOr[DateRangeUnit] = js.native
  /**
    * A date range value for the date filter.
    */
  var Value: js.UndefOr[Integer] = js.native
}

object DateRange {
  @scala.inline
  def apply(Unit: DateRangeUnit = null, Value: js.UndefOr[Integer] = js.undefined): DateRange = {
    val __obj = js.Dynamic.literal()
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRange]
  }
}

