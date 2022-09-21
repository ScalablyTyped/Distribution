package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayTaskResponse extends StObject {
  
  /**
    * The date and time when the most recent uplink was received.
    */
  var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined
  
  /**
    * The status of the request.
    */
  var Status: js.UndefOr[WirelessGatewayTaskStatus] = js.undefined
  
  /**
    * The date and time when the task was created.
    */
  var TaskCreatedAt: js.UndefOr[ISODateTimeString] = js.undefined
  
  /**
    * The ID of the wireless gateway.
    */
  var WirelessGatewayId: js.UndefOr[typings.awsSdk.iotwirelessMod.WirelessGatewayId] = js.undefined
  
  /**
    * The ID of the WirelessGatewayTask.
    */
  var WirelessGatewayTaskDefinitionId: js.UndefOr[typings.awsSdk.iotwirelessMod.WirelessGatewayTaskDefinitionId] = js.undefined
}
object GetWirelessGatewayTaskResponse {
  
  inline def apply(): GetWirelessGatewayTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWirelessGatewayTaskResponse]
  }
  
  extension [Self <: GetWirelessGatewayTaskResponse](x: Self) {
    
    inline def setLastUplinkReceivedAt(value: ISODateTimeString): Self = StObject.set(x, "LastUplinkReceivedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUplinkReceivedAtUndefined: Self = StObject.set(x, "LastUplinkReceivedAt", js.undefined)
    
    inline def setStatus(value: WirelessGatewayTaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskCreatedAt(value: ISODateTimeString): Self = StObject.set(x, "TaskCreatedAt", value.asInstanceOf[js.Any])
    
    inline def setTaskCreatedAtUndefined: Self = StObject.set(x, "TaskCreatedAt", js.undefined)
    
    inline def setWirelessGatewayId(value: WirelessGatewayId): Self = StObject.set(x, "WirelessGatewayId", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewayIdUndefined: Self = StObject.set(x, "WirelessGatewayId", js.undefined)
    
    inline def setWirelessGatewayTaskDefinitionId(value: WirelessGatewayTaskDefinitionId): Self = StObject.set(x, "WirelessGatewayTaskDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewayTaskDefinitionIdUndefined: Self = StObject.set(x, "WirelessGatewayTaskDefinitionId", js.undefined)
  }
}
