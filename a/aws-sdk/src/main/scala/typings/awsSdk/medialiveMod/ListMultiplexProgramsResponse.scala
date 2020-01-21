package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultiplexProgramsResponse extends js.Object {
  /**
    * List of multiplex programs.
    */
  var MultiplexPrograms: js.UndefOr[listOfMultiplexProgramSummary] = js.native
  /**
    * Token for the next ListMultiplexProgram request.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListMultiplexProgramsResponse {
  @scala.inline
  def apply(MultiplexPrograms: listOfMultiplexProgramSummary = null, NextToken: string = null): ListMultiplexProgramsResponse = {
    val __obj = js.Dynamic.literal()
    if (MultiplexPrograms != null) __obj.updateDynamic("MultiplexPrograms")(MultiplexPrograms.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultiplexProgramsResponse]
  }
}

