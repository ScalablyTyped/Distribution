package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRealtimeEndpointInput extends js.Object {
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId = js.native
}

object CreateRealtimeEndpointInput {
  @scala.inline
  def apply(MLModelId: EntityId): CreateRealtimeEndpointInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRealtimeEndpointInput]
  }
}

