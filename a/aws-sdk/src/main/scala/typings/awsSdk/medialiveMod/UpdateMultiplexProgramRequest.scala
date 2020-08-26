package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMultiplexProgramRequest extends js.Object {
  /**
    * The ID of the multiplex of the program to update.
    */
  var MultiplexId: string = js.native
  /**
    * The new settings for a multiplex program.
    */
  var MultiplexProgramSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexProgramSettings] = js.native
  /**
    * The name of the program to update.
    */
  var ProgramName: string = js.native
}

object UpdateMultiplexProgramRequest {
  @scala.inline
  def apply(MultiplexId: string, ProgramName: string): UpdateMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexProgramRequest]
  }
  @scala.inline
  implicit class UpdateMultiplexProgramRequestOps[Self <: UpdateMultiplexProgramRequest] (val x: Self) extends AnyVal {
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
    def setMultiplexId(value: string): Self = this.set("MultiplexId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgramName(value: string): Self = this.set("ProgramName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiplexProgramSettings(value: MultiplexProgramSettings): Self = this.set("MultiplexProgramSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplexProgramSettings: Self = this.set("MultiplexProgramSettings", js.undefined)
  }
  
}

