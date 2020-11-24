package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceDefinitionRequest extends js.Object {
  
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
}
object GetDeviceDefinitionRequest {
  
  @scala.inline
  def apply(DeviceDefinitionId: string): GetDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceDefinitionRequest]
  }
  
  @scala.inline
  implicit class GetDeviceDefinitionRequestOps[Self <: GetDeviceDefinitionRequest] (val x: Self) extends AnyVal {
    
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
    def setDeviceDefinitionId(value: string): Self = this.set("DeviceDefinitionId", value.asInstanceOf[js.Any])
  }
}
