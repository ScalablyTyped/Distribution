package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceDefinitionRequest extends StObject {
  
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
  implicit class GetDeviceDefinitionRequestMutableBuilder[Self <: GetDeviceDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceDefinitionId(value: string): Self = StObject.set(x, "DeviceDefinitionId", value.asInstanceOf[js.Any])
  }
}
