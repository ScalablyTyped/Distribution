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
  def apply(MultiplexProgram: MultiplexProgram = null): CreateMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    if (MultiplexProgram != null) __obj.updateDynamic("MultiplexProgram")(MultiplexProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexProgramResponse]
  }
}

