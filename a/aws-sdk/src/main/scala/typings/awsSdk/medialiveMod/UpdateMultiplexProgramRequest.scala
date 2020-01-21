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
  def apply(
    MultiplexId: string,
    ProgramName: string,
    MultiplexProgramSettings: MultiplexProgramSettings = null
  ): UpdateMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    if (MultiplexProgramSettings != null) __obj.updateDynamic("MultiplexProgramSettings")(MultiplexProgramSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexProgramRequest]
  }
}

