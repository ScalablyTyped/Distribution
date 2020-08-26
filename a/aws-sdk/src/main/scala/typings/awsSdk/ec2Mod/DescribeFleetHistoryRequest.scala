package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetHistoryRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The type of events to describe. By default, all events are described.
    */
  var EventType: js.UndefOr[FleetEventType] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: typings.awsSdk.ec2Mod.FleetId = js.native
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The start date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: DateTime = js.native
}

object DescribeFleetHistoryRequest {
  @scala.inline
  def apply(FleetId: FleetId, StartTime: DateTime): DescribeFleetHistoryRequest = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetHistoryRequest]
  }
  @scala.inline
  implicit class DescribeFleetHistoryRequestOps[Self <: DescribeFleetHistoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setEventType(value: FleetEventType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

