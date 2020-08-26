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
  def apply(Type: String): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
  @scala.inline
  implicit class LaunchTemplateElasticInferenceAcceleratorOps[Self <: LaunchTemplateElasticInferenceAccelerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: LaunchTemplateElasticInferenceAcceleratorCount): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
  }
  
}

