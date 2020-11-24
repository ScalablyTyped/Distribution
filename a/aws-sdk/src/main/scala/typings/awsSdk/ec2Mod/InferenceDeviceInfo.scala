package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InferenceDeviceInfo extends js.Object {
  
  /**
    * The number of Inference accelerators for the instance type.
    */
  var Count: js.UndefOr[InferenceDeviceCount] = js.native
  
  /**
    * The manufacturer of the Inference accelerator.
    */
  var Manufacturer: js.UndefOr[InferenceDeviceManufacturerName] = js.native
  
  /**
    * The name of the Inference accelerator.
    */
  var Name: js.UndefOr[InferenceDeviceName] = js.native
}
object InferenceDeviceInfo {
  
  @scala.inline
  def apply(): InferenceDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceDeviceInfo]
  }
  
  @scala.inline
  implicit class InferenceDeviceInfoOps[Self <: InferenceDeviceInfo] (val x: Self) extends AnyVal {
    
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
    def setCount(value: InferenceDeviceCount): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setManufacturer(value: InferenceDeviceManufacturerName): Self = this.set("Manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("Manufacturer", js.undefined)
    
    @scala.inline
    def setName(value: InferenceDeviceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
