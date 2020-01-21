package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointInTimeRecoveryDescription extends js.Object {
  /**
    * Specifies the earliest point in time you can restore your table to. You can restore your table to any point in time during the last 35 days. 
    */
  var EarliestRestorableDateTime: js.UndefOr[Date] = js.native
  /**
    *  LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var LatestRestorableDateTime: js.UndefOr[Date] = js.native
  /**
    * The current state of point in time recovery:    ENABLING - Point in time recovery is being enabled.    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
    */
  var PointInTimeRecoveryStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.PointInTimeRecoveryStatus] = js.native
}

object PointInTimeRecoveryDescription {
  @scala.inline
  def apply(
    EarliestRestorableDateTime: Date = null,
    LatestRestorableDateTime: Date = null,
    PointInTimeRecoveryStatus: PointInTimeRecoveryStatus = null
  ): PointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    if (EarliestRestorableDateTime != null) __obj.updateDynamic("EarliestRestorableDateTime")(EarliestRestorableDateTime.asInstanceOf[js.Any])
    if (LatestRestorableDateTime != null) __obj.updateDynamic("LatestRestorableDateTime")(LatestRestorableDateTime.asInstanceOf[js.Any])
    if (PointInTimeRecoveryStatus != null) __obj.updateDynamic("PointInTimeRecoveryStatus")(PointInTimeRecoveryStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoveryDescription]
  }
}

