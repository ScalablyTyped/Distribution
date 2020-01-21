package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMultiplexProgramResponse extends js.Object {
  /**
    * The updated multiplex program.
    */
  var MultiplexProgram: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexProgram] = js.native
}

object UpdateMultiplexProgramResponse {
  @scala.inline
  def apply(MultiplexProgram: MultiplexProgram = null): UpdateMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    if (MultiplexProgram != null) __obj.updateDynamic("MultiplexProgram")(MultiplexProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexProgramResponse]
  }
}

