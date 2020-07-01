package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticInferenceAccelerator extends js.Object {
  /**
    *  The number of elastic inference accelerators to attach to the instance.  Default: 1
    */
  var Count: js.UndefOr[ElasticInferenceAcceleratorCount] = js.native
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, eia1.xlarge, eia2.medium, eia2.large, and eia2.xlarge. 
    */
  var Type: String = js.native
}

object ElasticInferenceAccelerator {
  @scala.inline
  def apply(Type: String, Count: js.UndefOr[ElasticInferenceAcceleratorCount] = js.undefined): ElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticInferenceAccelerator]
  }
}

