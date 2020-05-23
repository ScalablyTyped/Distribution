package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledInstanceAvailabilityRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    availability-zone - The Availability Zone (for example, us-west-2a).    instance-type - The instance type (for example, c4.large).    network-platform - The network platform (EC2-Classic or EC2-VPC).    platform - The platform (Linux/UNIX or Windows).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The time period for the first schedule to start.
    */
  var FirstSlotStartTimeRange: SlotDateTimeRangeRequest = js.native
  /**
    * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value is 300. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[DescribeScheduledInstanceAvailabilityMaxResults] = js.native
  /**
    * The maximum available duration, in hours. This value must be greater than MinSlotDurationInHours and less than 1,720.
    */
  var MaxSlotDurationInHours: js.UndefOr[Integer] = js.native
  /**
    * The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is 100 hours.
    */
  var MinSlotDurationInHours: js.UndefOr[Integer] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The schedule recurrence.
    */
  var Recurrence: ScheduledInstanceRecurrenceRequest = js.native
}

object DescribeScheduledInstanceAvailabilityRequest {
  @scala.inline
  def apply(
    FirstSlotStartTimeRange: SlotDateTimeRangeRequest,
    Recurrence: ScheduledInstanceRecurrenceRequest,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[DescribeScheduledInstanceAvailabilityMaxResults] = js.undefined,
    MaxSlotDurationInHours: js.UndefOr[Integer] = js.undefined,
    MinSlotDurationInHours: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null
  ): DescribeScheduledInstanceAvailabilityRequest = {
    val __obj = js.Dynamic.literal(FirstSlotStartTimeRange = FirstSlotStartTimeRange.asInstanceOf[js.Any], Recurrence = Recurrence.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxSlotDurationInHours)) __obj.updateDynamic("MaxSlotDurationInHours")(MaxSlotDurationInHours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinSlotDurationInHours)) __obj.updateDynamic("MinSlotDurationInHours")(MinSlotDurationInHours.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledInstanceAvailabilityRequest]
  }
}

