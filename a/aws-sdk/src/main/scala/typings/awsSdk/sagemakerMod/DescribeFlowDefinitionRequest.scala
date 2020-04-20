package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFlowDefinitionRequest extends js.Object {
  /**
    * The name of the flow definition.
    */
  var FlowDefinitionName: typings.awsSdk.sagemakerMod.FlowDefinitionName = js.native
}

object DescribeFlowDefinitionRequest {
  @scala.inline
  def apply(FlowDefinitionName: FlowDefinitionName): DescribeFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowDefinitionRequest]
  }
}

