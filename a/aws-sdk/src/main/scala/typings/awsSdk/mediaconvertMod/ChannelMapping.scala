package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMapping extends js.Object {
  /**
    * List of output channels
    */
  var OutputChannels: js.UndefOr[listOfOutputChannelMapping] = js.native
}

object ChannelMapping {
  @scala.inline
  def apply(OutputChannels: listOfOutputChannelMapping = null): ChannelMapping = {
    val __obj = js.Dynamic.literal()
    if (OutputChannels != null) __obj.updateDynamic("OutputChannels")(OutputChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMapping]
  }
}

