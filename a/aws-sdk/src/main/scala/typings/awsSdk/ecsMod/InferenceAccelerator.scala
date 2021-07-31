package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceAccelerator extends StObject {
  
  /**
    * The Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
    */
  var deviceName: String
  
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: String
}
object InferenceAccelerator {
  
  @scala.inline
  def apply(deviceName: String, deviceType: String): InferenceAccelerator = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceAccelerator]
  }
  
  @scala.inline
  implicit class InferenceAcceleratorMutableBuilder[Self <: InferenceAccelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
  }
}
