package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataRetentionInput extends js.Object {
  /**
    * The version of the stream whose retention period you want to change. To get the version, call either the DescribeStream or the ListStreams API.
    */
  var CurrentVersion: Version = js.native
  /**
    * The retention period, in hours. The value you specify replaces the current value. The maximum value for this parameter is 87600 (ten years).
    */
  var DataRetentionChangeInHours: typings.awsSdk.kinesisvideoMod.DataRetentionChangeInHours = js.native
  /**
    * Indicates whether you want to increase or decrease the retention period.
    */
  var Operation: UpdateDataRetentionOperation = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream whose retention period you want to change.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.native
}

object UpdateDataRetentionInput {
  @scala.inline
  def apply(
    CurrentVersion: Version,
    DataRetentionChangeInHours: DataRetentionChangeInHours,
    Operation: UpdateDataRetentionOperation,
    StreamARN: ResourceARN = null,
    StreamName: StreamName = null
  ): UpdateDataRetentionInput = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any], DataRetentionChangeInHours = DataRetentionChangeInHours.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataRetentionInput]
  }
}

