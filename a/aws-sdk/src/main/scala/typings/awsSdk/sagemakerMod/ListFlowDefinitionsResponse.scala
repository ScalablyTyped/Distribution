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
  def apply(FlowDefinitionSummaries: FlowDefinitionSummaries, NextToken: NextToken = null): ListFlowDefinitionsResponse = {
    val __obj = js.Dynamic.literal(FlowDefinitionSummaries = FlowDefinitionSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFlowDefinitionsResponse]
  }
}

