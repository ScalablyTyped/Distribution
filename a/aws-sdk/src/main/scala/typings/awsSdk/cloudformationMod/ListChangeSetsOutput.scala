package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangeSetsOutput extends js.Object {
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of ChangeSetSummary structures that provides the ID and status of each change set for the specified stack.
    */
  var Summaries: js.UndefOr[ChangeSetSummaries] = js.native
}

object ListChangeSetsOutput {
  @scala.inline
  def apply(): ListChangeSetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChangeSetsOutput]
  }
  @scala.inline
  implicit class ListChangeSetsOutputOps[Self <: ListChangeSetsOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSummariesVarargs(value: ChangeSetSummary*): Self = this.set("Summaries", js.Array(value :_*))
    @scala.inline
    def setSummaries(value: ChangeSetSummaries): Self = this.set("Summaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaries: Self = this.set("Summaries", js.undefined)
  }
  
}

