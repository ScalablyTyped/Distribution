package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramSummary extends js.Object {
  /**
    * The MediaLive Channel associated with the program.
    */
  var ChannelId: js.UndefOr[string] = js.native
  /**
    * The name of the multiplex program.
    */
  var ProgramName: js.UndefOr[string] = js.native
}

object MultiplexProgramSummary {
  @scala.inline
  def apply(ChannelId: string = null, ProgramName: string = null): MultiplexProgramSummary = {
    val __obj = js.Dynamic.literal()
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId.asInstanceOf[js.Any])
    if (ProgramName != null) __obj.updateDynamic("ProgramName")(ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramSummary]
  }
}

