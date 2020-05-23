package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticInferenceAcceleratorHealth extends js.Object {
  /**
    *  The health status of the Elastic Inference Accelerator. 
    */
  var status: js.UndefOr[AcceleratorHealthStatus] = js.native
}

object ElasticInferenceAcceleratorHealth {
  @scala.inline
  def apply(status: AcceleratorHealthStatus = null): ElasticInferenceAcceleratorHealth = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticInferenceAcceleratorHealth]
  }
}

