package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPackageOutputDestinationSettings extends js.Object {
  /**
    * ID of the channel in MediaPackage that is the destination for this output group. You do not need to specify the individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive pipelines to the two MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the same region.
    */
  var ChannelId: js.UndefOr[stringMin1] = js.native
}

object MediaPackageOutputDestinationSettings {
  @scala.inline
  def apply(): MediaPackageOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPackageOutputDestinationSettings]
  }
  @scala.inline
  implicit class MediaPackageOutputDestinationSettingsOps[Self <: MediaPackageOutputDestinationSettings] (val x: Self) extends AnyVal {
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
    def setChannelId(value: stringMin1): Self = this.set("ChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("ChannelId", js.undefined)
  }
  
}

