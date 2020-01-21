package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRunRequest extends js.Object {
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  /**
    * Name of the workflow being run.
    */
  var Name: NameString = js.native
  /**
    * The ID of the workflow run.
    */
  var RunId: IdString = js.native
}

object GetWorkflowRunRequest {
  @scala.inline
  def apply(Name: NameString, RunId: IdString, IncludeGraph: js.UndefOr[scala.Boolean] = js.undefined): GetWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeGraph)) __obj.updateDynamic("IncludeGraph")(IncludeGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunRequest]
  }
}

