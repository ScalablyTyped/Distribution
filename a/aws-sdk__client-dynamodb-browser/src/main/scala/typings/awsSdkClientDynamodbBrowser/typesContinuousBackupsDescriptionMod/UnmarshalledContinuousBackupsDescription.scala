package typings.awsSdkClientDynamodbBrowser.typesContinuousBackupsDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryDescriptionMod.UnmarshalledPointInTimeRecoveryDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledContinuousBackupsDescription extends ContinuousBackupsDescription {
  /**
    * <p>The description of the point in time recovery settings applied to the table.</p>
    */
  @JSName("PointInTimeRecoveryDescription")
  var PointInTimeRecoveryDescription_UnmarshalledContinuousBackupsDescription: js.UndefOr[UnmarshalledPointInTimeRecoveryDescription] = js.undefined
}

object UnmarshalledContinuousBackupsDescription {
  @scala.inline
  def apply(
    ContinuousBackupsStatus: ENABLED | DISABLED | String,
    PointInTimeRecoveryDescription: UnmarshalledPointInTimeRecoveryDescription = null
  ): UnmarshalledContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    if (PointInTimeRecoveryDescription != null) __obj.updateDynamic("PointInTimeRecoveryDescription")(PointInTimeRecoveryDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledContinuousBackupsDescription]
  }
}

