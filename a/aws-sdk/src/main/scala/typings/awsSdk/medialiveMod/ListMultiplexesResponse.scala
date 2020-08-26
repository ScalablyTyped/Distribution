package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultiplexesResponse extends js.Object {
  /**
    * List of multiplexes.
    */
  var Multiplexes: js.UndefOr[listOfMultiplexSummary] = js.native
  /**
    * Token for the next ListMultiplexes request.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListMultiplexesResponse {
  @scala.inline
  def apply(): ListMultiplexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultiplexesResponse]
  }
  @scala.inline
  implicit class ListMultiplexesResponseOps[Self <: ListMultiplexesResponse] (val x: Self) extends AnyVal {
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
    def setMultiplexesVarargs(value: MultiplexSummary*): Self = this.set("Multiplexes", js.Array(value :_*))
    @scala.inline
    def setMultiplexes(value: listOfMultiplexSummary): Self = this.set("Multiplexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplexes: Self = this.set("Multiplexes", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

