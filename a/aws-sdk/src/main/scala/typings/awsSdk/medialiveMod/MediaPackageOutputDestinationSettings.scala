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
  def apply(ChannelId: stringMin1 = null): MediaPackageOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPackageOutputDestinationSettings]
  }
}

