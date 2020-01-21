package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousBackupsDescription extends js.Object {
  /**
    *  ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
    */
  var ContinuousBackupsStatus: typings.awsSdk.documentClientMod.DocumentClient.ContinuousBackupsStatus = js.native
  /**
    * The description of the point in time recovery settings applied to the table.
    */
  var PointInTimeRecoveryDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.PointInTimeRecoveryDescription] = js.native
}

object ContinuousBackupsDescription {
  @scala.inline
  def apply(
    ContinuousBackupsStatus: ContinuousBackupsStatus,
    PointInTimeRecoveryDescription: PointInTimeRecoveryDescription = null
  ): ContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    if (PointInTimeRecoveryDescription != null) __obj.updateDynamic("PointInTimeRecoveryDescription")(PointInTimeRecoveryDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousBackupsDescription]
  }
}

