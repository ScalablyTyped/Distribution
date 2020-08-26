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
  def apply(ChannelARN: ResourceARN, CurrentVersion: Version): UpdateSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSignalingChannelInput]
  }
  @scala.inline
  implicit class UpdateSignalingChannelInputOps[Self <: UpdateSignalingChannelInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannelARN(value: ResourceARN): Self = this.set("ChannelARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentVersion(value: Version): Self = this.set("CurrentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleMasterConfiguration(value: SingleMasterConfiguration): Self = this.set("SingleMasterConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleMasterConfiguration: Self = this.set("SingleMasterConfiguration", js.undefined)
  }
  
}

