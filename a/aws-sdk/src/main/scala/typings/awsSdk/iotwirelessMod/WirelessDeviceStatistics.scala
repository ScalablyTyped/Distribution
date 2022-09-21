package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessDeviceStatistics extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[WirelessDeviceArn] = js.undefined
  
  /**
    * The name of the destination to which the device is assigned.
    */
  var DestinationName: js.UndefOr[typings.awsSdk.iotwirelessMod.DestinationName] = js.undefined
  
  var FuotaDeviceStatus: js.UndefOr[typings.awsSdk.iotwirelessMod.FuotaDeviceStatus] = js.undefined
  
  /**
    * The ID of the wireless device reporting the data.
    */
  var Id: js.UndefOr[WirelessDeviceId] = js.undefined
  
  /**
    * The date and time when the most recent uplink was received.
    */
  var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined
  
  /**
    * LoRaWAN device info.
    */
  var LoRaWAN: js.UndefOr[LoRaWANListDevice] = js.undefined
  
  var McGroupId: js.UndefOr[typings.awsSdk.iotwirelessMod.McGroupId] = js.undefined
  
  /**
    * The status of the wireless device in the multicast group.
    */
  var MulticastDeviceStatus: js.UndefOr[typings.awsSdk.iotwirelessMod.MulticastDeviceStatus] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[WirelessDeviceName] = js.undefined
  
  /**
    * The Sidewalk account credentials.
    */
  var Sidewalk: js.UndefOr[SidewalkListDevice] = js.undefined
  
  /**
    * The wireless device type.
    */
  var Type: js.UndefOr[WirelessDeviceType] = js.undefined
}
object WirelessDeviceStatistics {
  
  inline def apply(): WirelessDeviceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WirelessDeviceStatistics]
  }
  
  extension [Self <: WirelessDeviceStatistics](x: Self) {
    
    inline def setArn(value: WirelessDeviceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "DestinationName", js.undefined)
    
    inline def setFuotaDeviceStatus(value: FuotaDeviceStatus): Self = StObject.set(x, "FuotaDeviceStatus", value.asInstanceOf[js.Any])
    
    inline def setFuotaDeviceStatusUndefined: Self = StObject.set(x, "FuotaDeviceStatus", js.undefined)
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastUplinkReceivedAt(value: ISODateTimeString): Self = StObject.set(x, "LastUplinkReceivedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUplinkReceivedAtUndefined: Self = StObject.set(x, "LastUplinkReceivedAt", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANListDevice): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setMcGroupId(value: McGroupId): Self = StObject.set(x, "McGroupId", value.asInstanceOf[js.Any])
    
    inline def setMcGroupIdUndefined: Self = StObject.set(x, "McGroupId", js.undefined)
    
    inline def setMulticastDeviceStatus(value: MulticastDeviceStatus): Self = StObject.set(x, "MulticastDeviceStatus", value.asInstanceOf[js.Any])
    
    inline def setMulticastDeviceStatusUndefined: Self = StObject.set(x, "MulticastDeviceStatus", js.undefined)
    
    inline def setName(value: WirelessDeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSidewalk(value: SidewalkListDevice): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
    
    inline def setType(value: WirelessDeviceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
