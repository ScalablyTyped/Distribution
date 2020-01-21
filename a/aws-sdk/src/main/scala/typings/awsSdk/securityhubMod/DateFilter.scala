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
  def apply(DateRange: DateRange = null, End: NonEmptyString = null, Start: NonEmptyString = null): DateFilter = {
    val __obj = js.Dynamic.literal()
    if (DateRange != null) __obj.updateDynamic("DateRange")(DateRange.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilter]
  }
}

