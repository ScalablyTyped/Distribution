package typings.awsSdkClientDynamodbNode.typesContinuousBackupsDescriptionMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DISABLED
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ENABLED
import typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousBackupsDescription extends js.Object {
  /**
    * <p> <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED</p>
    */
  var ContinuousBackupsStatus: ENABLED | DISABLED | String
  /**
    * <p>The description of the point in time recovery settings applied to the table.</p>
    */
  var PointInTimeRecoveryDescription: js.UndefOr[
    typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryDescriptionMod.PointInTimeRecoveryDescription
  ] = js.undefined
}

object ContinuousBackupsDescription {
  @scala.inline
  def apply(
    ContinuousBackupsStatus: ENABLED | DISABLED | String,
    PointInTimeRecoveryDescription: PointInTimeRecoveryDescription = null
  ): ContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    if (PointInTimeRecoveryDescription != null) __obj.updateDynamic("PointInTimeRecoveryDescription")(PointInTimeRecoveryDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousBackupsDescription]
  }
}

