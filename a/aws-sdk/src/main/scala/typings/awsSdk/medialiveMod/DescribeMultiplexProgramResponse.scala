package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMultiplexProgramResponse extends js.Object {
  /**
    * The MediaLive channel associated with the program.
    */
  var ChannelId: js.UndefOr[string] = js.native
  /**
    * The settings for this multiplex program.
    */
  var MultiplexProgramSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexProgramSettings] = js.native
  /**
    * The packet identifier map for this multiplex program.
    */
  var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap] = js.native
  /**
    * The name of the multiplex program.
    */
  var ProgramName: js.UndefOr[string] = js.native
}

object DescribeMultiplexProgramResponse {
  @scala.inline
  def apply(
    ChannelId: string = null,
    MultiplexProgramSettings: MultiplexProgramSettings = null,
    PacketIdentifiersMap: MultiplexProgramPacketIdentifiersMap = null,
    ProgramName: string = null
  ): DescribeMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId.asInstanceOf[js.Any])
    if (MultiplexProgramSettings != null) __obj.updateDynamic("MultiplexProgramSettings")(MultiplexProgramSettings.asInstanceOf[js.Any])
    if (PacketIdentifiersMap != null) __obj.updateDynamic("PacketIdentifiersMap")(PacketIdentifiersMap.asInstanceOf[js.Any])
    if (ProgramName != null) __obj.updateDynamic("ProgramName")(ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMultiplexProgramResponse]
  }
}

