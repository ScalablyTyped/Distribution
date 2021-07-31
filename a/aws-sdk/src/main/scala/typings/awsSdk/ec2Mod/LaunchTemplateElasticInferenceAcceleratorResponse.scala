package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateElasticInferenceAcceleratorResponse extends StObject {
  
  /**
    *  The number of elastic inference accelerators to attach to the instance.  Default: 1
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge. 
    */
  var Type: js.UndefOr[String] = js.undefined
}
object LaunchTemplateElasticInferenceAcceleratorResponse {
  
  @scala.inline
  def apply(): LaunchTemplateElasticInferenceAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAcceleratorResponse]
  }
  
  @scala.inline
  implicit class LaunchTemplateElasticInferenceAcceleratorResponseMutableBuilder[Self <: LaunchTemplateElasticInferenceAcceleratorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
