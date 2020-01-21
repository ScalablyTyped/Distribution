package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemixSettings extends js.Object {
  /**
    * Mapping of input channels to output channels, with appropriate gain adjustments.
    */
  var ChannelMappings: listOfAudioChannelMapping = js.native
  /**
    * Number of input channels to be used.
    */
  var ChannelsIn: js.UndefOr[integerMin1Max16] = js.native
  /**
    * Number of output channels to be produced.
  Valid values: 1, 2, 4, 6, 8
    */
  var ChannelsOut: js.UndefOr[integerMin1Max8] = js.native
}

object RemixSettings {
  @scala.inline
  def apply(
    ChannelMappings: listOfAudioChannelMapping,
    ChannelsIn: Int | Double = null,
    ChannelsOut: Int | Double = null
  ): RemixSettings = {
    val __obj = js.Dynamic.literal(ChannelMappings = ChannelMappings.asInstanceOf[js.Any])
    if (ChannelsIn != null) __obj.updateDynamic("ChannelsIn")(ChannelsIn.asInstanceOf[js.Any])
    if (ChannelsOut != null) __obj.updateDynamic("ChannelsOut")(ChannelsOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemixSettings]
  }
}

