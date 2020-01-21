package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMultiplexProgramRequest extends js.Object {
  /**
    * The ID of the multiplex that the program belongs to.
    */
  var MultiplexId: string = js.native
  /**
    * The name of the program.
    */
  var ProgramName: string = js.native
}

object DescribeMultiplexProgramRequest {
  @scala.inline
  def apply(MultiplexId: string, ProgramName: string): DescribeMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeMultiplexProgramRequest]
  }
}

