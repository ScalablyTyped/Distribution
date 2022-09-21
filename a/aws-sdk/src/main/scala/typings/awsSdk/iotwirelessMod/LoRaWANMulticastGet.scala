package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANMulticastGet extends StObject {
  
  var DlClass: js.UndefOr[typings.awsSdk.iotwirelessMod.DlClass] = js.undefined
  
  var NumberOfDevicesInGroup: js.UndefOr[typings.awsSdk.iotwirelessMod.NumberOfDevicesInGroup] = js.undefined
  
  var NumberOfDevicesRequested: js.UndefOr[typings.awsSdk.iotwirelessMod.NumberOfDevicesRequested] = js.undefined
  
  var RfRegion: js.UndefOr[SupportedRfRegion] = js.undefined
}
object LoRaWANMulticastGet {
  
  inline def apply(): LoRaWANMulticastGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANMulticastGet]
  }
  
  extension [Self <: LoRaWANMulticastGet](x: Self) {
    
    inline def setDlClass(value: DlClass): Self = StObject.set(x, "DlClass", value.asInstanceOf[js.Any])
    
    inline def setDlClassUndefined: Self = StObject.set(x, "DlClass", js.undefined)
    
    inline def setNumberOfDevicesInGroup(value: NumberOfDevicesInGroup): Self = StObject.set(x, "NumberOfDevicesInGroup", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDevicesInGroupUndefined: Self = StObject.set(x, "NumberOfDevicesInGroup", js.undefined)
    
    inline def setNumberOfDevicesRequested(value: NumberOfDevicesRequested): Self = StObject.set(x, "NumberOfDevicesRequested", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDevicesRequestedUndefined: Self = StObject.set(x, "NumberOfDevicesRequested", js.undefined)
    
    inline def setRfRegion(value: SupportedRfRegion): Self = StObject.set(x, "RfRegion", value.asInstanceOf[js.Any])
    
    inline def setRfRegionUndefined: Self = StObject.set(x, "RfRegion", js.undefined)
  }
}
