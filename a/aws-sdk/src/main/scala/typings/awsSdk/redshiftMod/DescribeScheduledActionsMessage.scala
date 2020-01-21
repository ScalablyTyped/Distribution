package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledActionsMessage extends js.Object {
  /**
    * If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions. 
    */
  var Active: js.UndefOr[BooleanOptional] = js.native
  /**
    * The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have invocations before this time are retrieved.
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  /**
    * List of scheduled action filters. 
    */
  var Filters: js.UndefOr[ScheduledActionFilterList] = js.native
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeScheduledActions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The name of the scheduled action to retrieve. 
    */
  var ScheduledActionName: js.UndefOr[String] = js.native
  /**
    * The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have invocations after this time are retrieved.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  /**
    * The type of the scheduled actions to retrieve. 
    */
  var TargetActionType: js.UndefOr[ScheduledActionTypeValues] = js.native
}

object DescribeScheduledActionsMessage {
  @scala.inline
  def apply(
    Active: js.UndefOr[scala.Boolean] = js.undefined,
    EndTime: TStamp = null,
    Filters: ScheduledActionFilterList = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    ScheduledActionName: String = null,
    StartTime: TStamp = null,
    TargetActionType: ScheduledActionTypeValues = null
  ): DescribeScheduledActionsMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (ScheduledActionName != null) __obj.updateDynamic("ScheduledActionName")(ScheduledActionName.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (TargetActionType != null) __obj.updateDynamic("TargetActionType")(TargetActionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledActionsMessage]
  }
}

