package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRunsRequest extends js.Object {
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  /**
    * The maximum number of workflow runs to be included in the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * Name of the workflow whose metadata of runs should be returned.
    */
  var Name: NameString = js.native
  /**
    * The maximum size of the response.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetWorkflowRunsRequest {
  @scala.inline
  def apply(
    Name: NameString,
    IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: GenericString = null
  ): GetWorkflowRunsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeGraph)) __obj.updateDynamic("IncludeGraph")(IncludeGraph.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunsRequest]
  }
}

