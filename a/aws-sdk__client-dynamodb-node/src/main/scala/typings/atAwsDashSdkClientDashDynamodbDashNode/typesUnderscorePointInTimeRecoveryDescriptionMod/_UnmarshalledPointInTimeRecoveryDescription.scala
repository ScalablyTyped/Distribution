package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscorePointInTimeRecoveryDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.DISABLED
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ENABLED
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledPointInTimeRecoveryDescription extends _PointInTimeRecoveryDescription {
  /**
    * <p>Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. </p>
    */
  @JSName("EarliestRestorableDateTime")
  var EarliestRestorableDateTime__UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[Date] = js.undefined
  /**
    * <p> <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
    */
  @JSName("LatestRestorableDateTime")
  var LatestRestorableDateTime__UnmarshalledPointInTimeRecoveryDescription: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledPointInTimeRecoveryDescription {
  @scala.inline
  def apply(
    EarliestRestorableDateTime: Date = null,
    LatestRestorableDateTime: Date = null,
    PointInTimeRecoveryStatus: ENABLED | DISABLED | String = null
  ): _UnmarshalledPointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    if (EarliestRestorableDateTime != null) __obj.updateDynamic("EarliestRestorableDateTime")(EarliestRestorableDateTime)
    if (LatestRestorableDateTime != null) __obj.updateDynamic("LatestRestorableDateTime")(LatestRestorableDateTime)
    if (PointInTimeRecoveryStatus != null) __obj.updateDynamic("PointInTimeRecoveryStatus")(PointInTimeRecoveryStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledPointInTimeRecoveryDescription]
  }
}

