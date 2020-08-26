package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceConfiguration extends js.Object {
  /**
    * The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1 (vCPU=4, memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
    */
  var computeType: ComputeType = js.native
  /**
    * The size (in GB) of the persistent storage available to the resource instance used to execute the "containerAction" (min: 1, max: 50).
    */
  var volumeSizeInGB: VolumeSizeInGB = js.native
}

object ResourceConfiguration {
  @scala.inline
  def apply(computeType: ComputeType, volumeSizeInGB: VolumeSizeInGB): ResourceConfiguration = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], volumeSizeInGB = volumeSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConfiguration]
  }
  @scala.inline
  implicit class ResourceConfigurationOps[Self <: ResourceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComputeType(value: ComputeType): Self = this.set("computeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeSizeInGB(value: VolumeSizeInGB): Self = this.set("volumeSizeInGB", value.asInstanceOf[js.Any])
  }
  
}

