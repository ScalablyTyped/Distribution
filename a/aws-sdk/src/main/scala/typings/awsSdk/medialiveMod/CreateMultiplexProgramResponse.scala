package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMultiplexProgramResponse extends js.Object {
  /**
    * The newly created multiplex program.
    */
  var MultiplexProgram: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexProgram] = js.native
}

object CreateMultiplexProgramResponse {
  @scala.inline
  def apply(): CreateMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMultiplexProgramResponse]
  }
  @scala.inline
  implicit class CreateMultiplexProgramResponseOps[Self <: CreateMultiplexProgramResponse] (val x: Self) extends AnyVal {
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
    def setMultiplexProgram(value: MultiplexProgram): Self = this.set("MultiplexProgram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplexProgram: Self = this.set("MultiplexProgram", js.undefined)
  }
  
}

