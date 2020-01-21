package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointWeightsAndCapacitiesInput extends js.Object {
  /**
    * An object that provides new capacity and weight values for a variant.
    */
  var DesiredWeightsAndCapacities: DesiredWeightAndCapacityList = js.native
  /**
    * The name of an existing Amazon SageMaker endpoint.
    */
  var EndpointName: typings.awsSdk.sagemakerMod.EndpointName = js.native
}

object UpdateEndpointWeightsAndCapacitiesInput {
  @scala.inline
  def apply(DesiredWeightsAndCapacities: DesiredWeightAndCapacityList, EndpointName: EndpointName): UpdateEndpointWeightsAndCapacitiesInput = {
    val __obj = js.Dynamic.literal(DesiredWeightsAndCapacities = DesiredWeightsAndCapacities.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesInput]
  }
}

