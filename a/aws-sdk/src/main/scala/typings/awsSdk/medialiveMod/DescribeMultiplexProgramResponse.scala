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
  def apply(): DescribeMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMultiplexProgramResponse]
  }
  @scala.inline
  implicit class DescribeMultiplexProgramResponseOps[Self <: DescribeMultiplexProgramResponse] (val x: Self) extends AnyVal {
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
    def setChannelId(value: string): Self = this.set("ChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("ChannelId", js.undefined)
    @scala.inline
    def setMultiplexProgramSettings(value: MultiplexProgramSettings): Self = this.set("MultiplexProgramSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplexProgramSettings: Self = this.set("MultiplexProgramSettings", js.undefined)
    @scala.inline
    def setPacketIdentifiersMap(value: MultiplexProgramPacketIdentifiersMap): Self = this.set("PacketIdentifiersMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketIdentifiersMap: Self = this.set("PacketIdentifiersMap", js.undefined)
    @scala.inline
    def setProgramName(value: string): Self = this.set("ProgramName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramName: Self = this.set("ProgramName", js.undefined)
  }
  
}

