package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSignalingChannelInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the signaling channel that you want to delete.
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * The current version of the signaling channel that you want to delete. You can obtain the current version by invoking the DescribeSignalingChannel or ListSignalingChannels API operations.
    */
  var CurrentVersion: js.UndefOr[Version] = js.native
}

object DeleteSignalingChannelInput {
  @scala.inline
  def apply(ChannelARN: ResourceARN, CurrentVersion: Version = null): DeleteSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    if (CurrentVersion != null) __obj.updateDynamic("CurrentVersion")(CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSignalingChannelInput]
  }
}

