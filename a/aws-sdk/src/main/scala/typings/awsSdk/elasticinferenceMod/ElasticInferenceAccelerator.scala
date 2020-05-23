package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticInferenceAccelerator extends js.Object {
  /**
    *  The health of the Elastic Inference Accelerator. 
    */
  var acceleratorHealth: js.UndefOr[ElasticInferenceAcceleratorHealth] = js.native
  /**
    *  The ID of the Elastic Inference Accelerator. 
    */
  var acceleratorId: js.UndefOr[AcceleratorId] = js.native
  /**
    *  The type of the Elastic Inference Accelerator. 
    */
  var acceleratorType: js.UndefOr[AcceleratorTypeName] = js.native
  /**
    *  The ARN of the resource that the Elastic Inference Accelerator is attached to. 
    */
  var attachedResource: js.UndefOr[ResourceArn] = js.native
  /**
    *  The availability zone where the Elastic Inference Accelerator is present. 
    */
  var availabilityZone: js.UndefOr[AvailabilityZone] = js.native
}

object ElasticInferenceAccelerator {
  @scala.inline
  def apply(
    acceleratorHealth: ElasticInferenceAcceleratorHealth = null,
    acceleratorId: AcceleratorId = null,
    acceleratorType: AcceleratorTypeName = null,
    attachedResource: ResourceArn = null,
    availabilityZone: AvailabilityZone = null
  ): ElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    if (acceleratorHealth != null) __obj.updateDynamic("acceleratorHealth")(acceleratorHealth.asInstanceOf[js.Any])
    if (acceleratorId != null) __obj.updateDynamic("acceleratorId")(acceleratorId.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    if (attachedResource != null) __obj.updateDynamic("attachedResource")(attachedResource.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticInferenceAccelerator]
  }
}

