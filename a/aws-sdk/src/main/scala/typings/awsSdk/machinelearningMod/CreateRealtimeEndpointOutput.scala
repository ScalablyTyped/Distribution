package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRealtimeEndpointOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * The endpoint information of the MLModel 
    */
  var RealtimeEndpointInfo: js.UndefOr[typings.awsSdk.machinelearningMod.RealtimeEndpointInfo] = js.native
}

object CreateRealtimeEndpointOutput {
  @scala.inline
  def apply(MLModelId: EntityId = null, RealtimeEndpointInfo: RealtimeEndpointInfo = null): CreateRealtimeEndpointOutput = {
    val __obj = js.Dynamic.literal()
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId.asInstanceOf[js.Any])
    if (RealtimeEndpointInfo != null) __obj.updateDynamic("RealtimeEndpointInfo")(RealtimeEndpointInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRealtimeEndpointOutput]
  }
}

