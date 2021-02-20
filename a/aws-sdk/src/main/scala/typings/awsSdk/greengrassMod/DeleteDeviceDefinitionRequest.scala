package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeviceDefinitionRequest extends StObject {
  
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
}
object DeleteDeviceDefinitionRequest {
  
  @scala.inline
  def apply(DeviceDefinitionId: string): DeleteDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteDeviceDefinitionRequestMutableBuilder[Self <: DeleteDeviceDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceDefinitionId(value: string): Self = StObject.set(x, "DeviceDefinitionId", value.asInstanceOf[js.Any])
  }
}
