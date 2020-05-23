package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSignalingChannelInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the signaling channel that you want to update.
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * The current version of the signaling channel that you want to update.
    */
  var CurrentVersion: Version = js.native
  /**
    * The structure containing the configuration for the SINGLE_MASTER type of the signaling channel that you want to update. 
    */
  var SingleMasterConfiguration: js.UndefOr[typings.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.native
}

object UpdateSignalingChannelInput {
  @scala.inline
  def apply(
    ChannelARN: ResourceARN,
    CurrentVersion: Version,
    SingleMasterConfiguration: SingleMasterConfiguration = null
  ): UpdateSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    if (SingleMasterConfiguration != null) __obj.updateDynamic("SingleMasterConfiguration")(SingleMasterConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSignalingChannelInput]
  }
}

