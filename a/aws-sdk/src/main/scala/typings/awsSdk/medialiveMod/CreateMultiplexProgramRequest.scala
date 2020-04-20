package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMultiplexProgramRequest extends js.Object {
  /**
    * ID of the multiplex where the program is to be created.
    */
  var MultiplexId: string = js.native
  /**
    * The settings for this multiplex program.
    */
  var MultiplexProgramSettings: typings.awsSdk.medialiveMod.MultiplexProgramSettings = js.native
  /**
    * Name of multiplex program.
    */
  var ProgramName: string = js.native
  /**
    * Unique request ID. This prevents retries from creating multiple
  resources.
    */
  var RequestId: string = js.native
}

object CreateMultiplexProgramRequest {
  @scala.inline
  def apply(
    MultiplexId: string,
    MultiplexProgramSettings: MultiplexProgramSettings,
    ProgramName: string,
    RequestId: string
  ): CreateMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], MultiplexProgramSettings = MultiplexProgramSettings.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexProgramRequest]
  }
}

