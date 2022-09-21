package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWirelessDeviceResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the new resource.
    */
  var Arn: js.UndefOr[WirelessDeviceArn] = js.undefined
  
  /**
    * The ID of the new wireless device.
    */
  var Id: js.UndefOr[WirelessDeviceId] = js.undefined
}
object CreateWirelessDeviceResponse {
  
  inline def apply(): CreateWirelessDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWirelessDeviceResponse]
  }
  
  extension [Self <: CreateWirelessDeviceResponse](x: Self) {
    
    inline def setArn(value: WirelessDeviceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
