package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreContinuousBackupsDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.DISABLED
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ENABLED
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscorePointInTimeRecoveryDescriptionMod._PointInTimeRecoveryDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ContinuousBackupsDescription extends js.Object {
  /**
    * <p> <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED</p>
    */
  var ContinuousBackupsStatus: ENABLED | DISABLED | String
  /**
    * <p>The description of the point in time recovery settings applied to the table.</p>
    */
  var PointInTimeRecoveryDescription: js.UndefOr[_PointInTimeRecoveryDescription] = js.undefined
}

object _ContinuousBackupsDescription {
  @scala.inline
  def apply(
    ContinuousBackupsStatus: ENABLED | DISABLED | String,
    PointInTimeRecoveryDescription: _PointInTimeRecoveryDescription = null
  ): _ContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    if (PointInTimeRecoveryDescription != null) __obj.updateDynamic("PointInTimeRecoveryDescription")(PointInTimeRecoveryDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ContinuousBackupsDescription]
  }
}

