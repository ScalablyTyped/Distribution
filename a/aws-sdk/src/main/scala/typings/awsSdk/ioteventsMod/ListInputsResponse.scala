package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputsResponse extends js.Object {
  /**
    * Summary information about the inputs.
    */
  var inputSummaries: js.UndefOr[InputSummaries] = js.native
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListInputsResponse {
  @scala.inline
  def apply(): ListInputsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputsResponse]
  }
  @scala.inline
  implicit class ListInputsResponseOps[Self <: ListInputsResponse] (val x: Self) extends AnyVal {
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
    def setInputSummariesVarargs(value: InputSummary*): Self = this.set("inputSummaries", js.Array(value :_*))
    @scala.inline
    def setInputSummaries(value: InputSummaries): Self = this.set("inputSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputSummaries: Self = this.set("inputSummaries", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

