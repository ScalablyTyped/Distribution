package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRequest extends js.Object {
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  /**
    * The name of the workflow to retrieve.
    */
  var Name: NameString = js.native
}

object GetWorkflowRequest {
  @scala.inline
  def apply(Name: NameString, IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined): GetWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeGraph)) __obj.updateDynamic("IncludeGraph")(IncludeGraph.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRequest]
  }
}

