package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowDefinitionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the flow definition you create.
    */
  var FlowDefinitionArn: typings.awsSdk.sagemakerMod.FlowDefinitionArn = js.native
}

object CreateFlowDefinitionResponse {
  @scala.inline
  def apply(FlowDefinitionArn: FlowDefinitionArn): CreateFlowDefinitionResponse = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowDefinitionResponse]
  }
}

