package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointWeightsAndCapacitiesOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated endpoint.
    */
  var EndpointArn: typings.awsSdk.sagemakerMod.EndpointArn = js.native
}

object UpdateEndpointWeightsAndCapacitiesOutput {
  @scala.inline
  def apply(EndpointArn: EndpointArn): UpdateEndpointWeightsAndCapacitiesOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesOutput]
  }
}

