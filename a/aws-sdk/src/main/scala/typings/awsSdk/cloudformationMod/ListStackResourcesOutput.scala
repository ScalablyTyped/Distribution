package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackResourcesOutput extends js.Object {
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of StackResourceSummary structures.
    */
  var StackResourceSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.StackResourceSummaries] = js.native
}

object ListStackResourcesOutput {
  @scala.inline
  def apply(): ListStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackResourcesOutput]
  }
  @scala.inline
  implicit class ListStackResourcesOutputOps[Self <: ListStackResourcesOutput] (val x: Self) extends AnyVal {
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
    def setStackResourceSummariesVarargs(value: StackResourceSummary*): Self = this.set("StackResourceSummaries", js.Array(value :_*))
    @scala.inline
    def setStackResourceSummaries(value: StackResourceSummaries): Self = this.set("StackResourceSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackResourceSummaries: Self = this.set("StackResourceSummaries", js.undefined)
  }
  
}

