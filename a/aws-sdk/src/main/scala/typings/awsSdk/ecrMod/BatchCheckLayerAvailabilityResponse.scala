package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCheckLayerAvailabilityResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[LayerFailureList] = js.native
  /**
    * A list of image layer objects corresponding to the image layer references in the request.
    */
  var layers: js.UndefOr[LayerList] = js.native
}

object BatchCheckLayerAvailabilityResponse {
  @scala.inline
  def apply(failures: LayerFailureList = null, layers: LayerList = null): BatchCheckLayerAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCheckLayerAvailabilityResponse]
  }
}

