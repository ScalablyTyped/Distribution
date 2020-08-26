package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFlowDefinitionsResponse extends js.Object {
  /**
    * An array of objects describing the flow definitions.
    */
  var FlowDefinitionSummaries: typings.awsSdk.sagemakerMod.FlowDefinitionSummaries = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListFlowDefinitionsResponse {
  @scala.inline
  def apply(FlowDefinitionSummaries: FlowDefinitionSummaries): ListFlowDefinitionsResponse = {
    val __obj = js.Dynamic.literal(FlowDefinitionSummaries = FlowDefinitionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFlowDefinitionsResponse]
  }
  @scala.inline
  implicit class ListFlowDefinitionsResponseOps[Self <: ListFlowDefinitionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlowDefinitionSummariesVarargs(value: FlowDefinitionSummary*): Self = this.set("FlowDefinitionSummaries", js.Array(value :_*))
    @scala.inline
    def setFlowDefinitionSummaries(value: FlowDefinitionSummaries): Self = this.set("FlowDefinitionSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

