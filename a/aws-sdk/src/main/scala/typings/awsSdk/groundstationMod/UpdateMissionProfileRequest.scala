package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMissionProfileRequest extends js.Object {
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  /**
    * A list of lists of ARNs. Each list of ARNs is an edge, with a from Config and a to Config.
    */
  var dataflowEdges: js.UndefOr[DataflowEdgeList] = js.native
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String = js.native
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[SafeName] = js.native
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: js.UndefOr[ConfigArn] = js.native
}

object UpdateMissionProfileRequest {
  @scala.inline
  def apply(
    missionProfileId: String,
    contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
    contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
    dataflowEdges: DataflowEdgeList = null,
    minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
    name: SafeName = null,
    trackingConfigArn: ConfigArn = null
  ): UpdateMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    if (!js.isUndefined(contactPostPassDurationSeconds)) __obj.updateDynamic("contactPostPassDurationSeconds")(contactPostPassDurationSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contactPrePassDurationSeconds)) __obj.updateDynamic("contactPrePassDurationSeconds")(contactPrePassDurationSeconds.get.asInstanceOf[js.Any])
    if (dataflowEdges != null) __obj.updateDynamic("dataflowEdges")(dataflowEdges.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumViableContactDurationSeconds)) __obj.updateDynamic("minimumViableContactDurationSeconds")(minimumViableContactDurationSeconds.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (trackingConfigArn != null) __obj.updateDynamic("trackingConfigArn")(trackingConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMissionProfileRequest]
  }
}

