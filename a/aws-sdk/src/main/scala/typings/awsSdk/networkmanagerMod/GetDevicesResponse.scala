package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicesResponse extends StObject {
  
  /**
    * The devices.
    */
  var Devices: js.UndefOr[DeviceList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetDevicesResponse {
  
  @scala.inline
  def apply(): GetDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevicesResponse]
  }
  
  @scala.inline
  implicit class GetDevicesResponseMutableBuilder[Self <: GetDevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: DeviceList): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = StObject.set(x, "Devices", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
