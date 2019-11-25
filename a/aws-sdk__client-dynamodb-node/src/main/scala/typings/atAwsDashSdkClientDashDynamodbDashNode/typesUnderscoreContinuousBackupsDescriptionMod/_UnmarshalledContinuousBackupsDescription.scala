package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreContinuousBackupsDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.DISABLED
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ENABLED
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscorePointInTimeRecoveryDescriptionMod._UnmarshalledPointInTimeRecoveryDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledContinuousBackupsDescription extends _ContinuousBackupsDescription {
  /**
    * <p>The description of the point in time recovery settings applied to the table.</p>
    */
  @JSName("PointInTimeRecoveryDescription")
  var PointInTimeRecoveryDescription__UnmarshalledContinuousBackupsDescription: js.UndefOr[_UnmarshalledPointInTimeRecoveryDescription] = js.undefined
}

object _UnmarshalledContinuousBackupsDescription {
  @scala.inline
  def apply(
    ContinuousBackupsStatus: ENABLED | DISABLED | String,
    PointInTimeRecoveryDescription: _UnmarshalledPointInTimeRecoveryDescription = null
  ): _UnmarshalledContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    if (PointInTimeRecoveryDescription != null) __obj.updateDynamic("PointInTimeRecoveryDescription")(PointInTimeRecoveryDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledContinuousBackupsDescription]
  }
}

