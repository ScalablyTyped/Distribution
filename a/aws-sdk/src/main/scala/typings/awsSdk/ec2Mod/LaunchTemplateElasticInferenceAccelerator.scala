package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateElasticInferenceAccelerator extends js.Object {
  /**
    *  The number of elastic inference accelerators to attach to the instance.  Default: 1
    */
  var Count: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorCount] = js.native
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge. 
    */
  var Type: String = js.native
}

object LaunchTemplateElasticInferenceAccelerator {
  @scala.inline
  def apply(Type: String, Count: Int | scala.Double = null): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
}

