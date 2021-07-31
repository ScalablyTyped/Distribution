package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceDeviceInfo extends StObject {
  
  /**
    * The number of Inference accelerators for the instance type.
    */
  var Count: js.UndefOr[InferenceDeviceCount] = js.undefined
  
  /**
    * The manufacturer of the Inference accelerator.
    */
  var Manufacturer: js.UndefOr[InferenceDeviceManufacturerName] = js.undefined
  
  /**
    * The name of the Inference accelerator.
    */
  var Name: js.UndefOr[InferenceDeviceName] = js.undefined
}
object InferenceDeviceInfo {
  
  @scala.inline
  def apply(): InferenceDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceDeviceInfo]
  }
  
  @scala.inline
  implicit class InferenceDeviceInfoMutableBuilder[Self <: InferenceDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: InferenceDeviceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setManufacturer(value: InferenceDeviceManufacturerName): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
    
    @scala.inline
    def setName(value: InferenceDeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
