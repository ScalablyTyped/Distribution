package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelInfo extends js.Object {
  /**
    * The ARN of the signaling channel.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the signaling channel.
    */
  var ChannelName: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelName] = js.native
  /**
    * Current status of the signaling channel.
    */
  var ChannelStatus: js.UndefOr[Status] = js.native
  /**
    * The type of the signaling channel.
    */
  var ChannelType: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelType] = js.native
  /**
    * The time at which the signaling channel was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * A structure that contains the configuration for the SINGLE_MASTER channel type.
    */
  var SingleMasterConfiguration: js.UndefOr[typings.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.native
  /**
    * The current version of the signaling channel.
    */
  var Version: js.UndefOr[typings.awsSdk.kinesisvideoMod.Version] = js.native
}

object ChannelInfo {
  @scala.inline
  def apply(
    ChannelARN: ResourceARN = null,
    ChannelName: ChannelName = null,
    ChannelStatus: Status = null,
    ChannelType: ChannelType = null,
    CreationTime: Timestamp = null,
    SingleMasterConfiguration: SingleMasterConfiguration = null,
    Version: Version = null
  ): ChannelInfo = {
    val __obj = js.Dynamic.literal()
    if (ChannelARN != null) __obj.updateDynamic("ChannelARN")(ChannelARN.asInstanceOf[js.Any])
    if (ChannelName != null) __obj.updateDynamic("ChannelName")(ChannelName.asInstanceOf[js.Any])
    if (ChannelStatus != null) __obj.updateDynamic("ChannelStatus")(ChannelStatus.asInstanceOf[js.Any])
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (SingleMasterConfiguration != null) __obj.updateDynamic("SingleMasterConfiguration")(SingleMasterConfiguration.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelInfo]
  }
}

