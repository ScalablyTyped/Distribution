package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueuedMessagesRequest extends StObject {
  
  /**
    * The ID of a given wireless device which the downlink message packets are being sent.
    */
  var Id: WirelessDeviceId
  
  /**
    * The maximum number of results to return in this operation.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.iotwirelessMod.MaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.iotwirelessMod.NextToken] = js.undefined
  
  /**
    * The wireless device type, whic can be either Sidewalk or LoRaWAN.
    */
  var WirelessDeviceType: js.UndefOr[typings.awsSdk.iotwirelessMod.WirelessDeviceType] = js.undefined
}
object ListQueuedMessagesRequest {
  
  inline def apply(Id: WirelessDeviceId): ListQueuedMessagesRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuedMessagesRequest]
  }
  
  extension [Self <: ListQueuedMessagesRequest](x: Self) {
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWirelessDeviceType(value: WirelessDeviceType): Self = StObject.set(x, "WirelessDeviceType", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceTypeUndefined: Self = StObject.set(x, "WirelessDeviceType", js.undefined)
  }
}
