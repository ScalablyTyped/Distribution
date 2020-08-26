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
  def apply(): ListMultiplexProgramsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultiplexProgramsResponse]
  }
  @scala.inline
  implicit class ListMultiplexProgramsResponseOps[Self <: ListMultiplexProgramsResponse] (val x: Self) extends AnyVal {
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
    def setMultiplexProgramsVarargs(value: MultiplexProgramSummary*): Self = this.set("MultiplexPrograms", js.Array(value :_*))
    @scala.inline
    def setMultiplexPrograms(value: listOfMultiplexProgramSummary): Self = this.set("MultiplexPrograms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplexPrograms: Self = this.set("MultiplexPrograms", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

