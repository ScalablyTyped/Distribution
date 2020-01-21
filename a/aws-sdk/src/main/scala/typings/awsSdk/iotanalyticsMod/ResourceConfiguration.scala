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
}

