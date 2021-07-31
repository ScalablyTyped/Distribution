package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateElasticInferenceAccelerator extends StObject {
  
  /**
    *  The number of elastic inference accelerators to attach to the instance.  Default: 1
    */
  var Count: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorCount] = js.undefined
  
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge. 
    */
  var Type: String
}
object LaunchTemplateElasticInferenceAccelerator {
  
  @scala.inline
  def apply(Type: String): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
  
  @scala.inline
  implicit class LaunchTemplateElasticInferenceAcceleratorMutableBuilder[Self <: LaunchTemplateElasticInferenceAccelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: LaunchTemplateElasticInferenceAcceleratorCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
