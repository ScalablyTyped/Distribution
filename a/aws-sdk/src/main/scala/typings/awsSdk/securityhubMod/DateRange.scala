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
  def apply(): DateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRange]
  }
  @scala.inline
  implicit class DateRangeOps[Self <: DateRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUnit(value: DateRangeUnit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
    @scala.inline
    def setValue(value: Integer): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

