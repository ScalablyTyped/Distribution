package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFilter extends js.Object {
  /**
    * A date range for the date filter.
    */
  var DateRange: js.UndefOr[typings.awsSdk.securityhubMod.DateRange] = js.native
  /**
    * An end date for the date filter.
    */
  var End: js.UndefOr[NonEmptyString] = js.native
  /**
    * A start date for the date filter.
    */
  var Start: js.UndefOr[NonEmptyString] = js.native
}

object DateFilter {
  @scala.inline
  def apply(): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFilter]
  }
  @scala.inline
  implicit class DateFilterOps[Self <: DateFilter] (val x: Self) extends AnyVal {
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
    def setDateRange(value: DateRange): Self = this.set("DateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRange: Self = this.set("DateRange", js.undefined)
    @scala.inline
    def setEnd(value: NonEmptyString): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    @scala.inline
    def setStart(value: NonEmptyString): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
  }
  
}

