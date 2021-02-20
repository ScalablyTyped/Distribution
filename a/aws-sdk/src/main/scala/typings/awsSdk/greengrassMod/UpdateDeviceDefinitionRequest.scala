package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeviceDefinitionRequest extends StObject {
  
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.native
}
object UpdateDeviceDefinitionRequest {
  
  @scala.inline
  def apply(DeviceDefinitionId: string): UpdateDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceDefinitionRequest]
  }
  
  @scala.inline
  implicit class UpdateDeviceDefinitionRequestMutableBuilder[Self <: UpdateDeviceDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceDefinitionId(value: string): Self = StObject.set(x, "DeviceDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
