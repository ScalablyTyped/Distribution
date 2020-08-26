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
  def apply(): MultiplexProgramSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramSummary]
  }
  @scala.inline
  implicit class MultiplexProgramSummaryOps[Self <: MultiplexProgramSummary] (val x: Self) extends AnyVal {
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
    def setProgramName(value: string): Self = this.set("ProgramName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramName: Self = this.set("ProgramName", js.undefined)
  }
  
}

