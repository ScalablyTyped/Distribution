package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackSetOperationsOutput extends js.Object {
  /**
    * If the request doesn't return all results, NextToken is set to a token. To retrieve the next set of results, call ListOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of StackSetOperationSummary structures that contain summary information about operations for the specified stack set.
    */
  var Summaries: js.UndefOr[StackSetOperationSummaries] = js.native
}

object ListStackSetOperationsOutput {
  @scala.inline
  def apply(): ListStackSetOperationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackSetOperationsOutput]
  }
  @scala.inline
  implicit class ListStackSetOperationsOutputOps[Self <: ListStackSetOperationsOutput] (val x: Self) extends AnyVal {
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
    def setSummariesVarargs(value: StackSetOperationSummary*): Self = this.set("Summaries", js.Array(value :_*))
    @scala.inline
    def setSummaries(value: StackSetOperationSummaries): Self = this.set("Summaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaries: Self = this.set("Summaries", js.undefined)
  }
  
}

