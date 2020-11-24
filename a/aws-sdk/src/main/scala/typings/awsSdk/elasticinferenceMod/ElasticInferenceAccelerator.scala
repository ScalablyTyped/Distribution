package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAccelerator]
  }
  
  @scala.inline
  implicit class ElasticInferenceAcceleratorOps[Self <: ElasticInferenceAccelerator] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorHealth(value: ElasticInferenceAcceleratorHealth): Self = this.set("acceleratorHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorHealth: Self = this.set("acceleratorHealth", js.undefined)
    
    @scala.inline
    def setAcceleratorId(value: AcceleratorId): Self = this.set("acceleratorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorId: Self = this.set("acceleratorId", js.undefined)
    
    @scala.inline
    def setAcceleratorType(value: AcceleratorTypeName): Self = this.set("acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorType: Self = this.set("acceleratorType", js.undefined)
    
    @scala.inline
    def setAttachedResource(value: ResourceArn): Self = this.set("attachedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedResource: Self = this.set("attachedResource", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZone): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
  }
}
