package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.anon.Authentication
import typings.chromeApps.anon.SignalStrength
import typings.chromeApps.anon.Type
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.unknown__
import typings.chromeApps.chromeAppsStrings.unmanaged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Partial classes for internal use
  */
object internal {
  
  trait NetworkConfigBase[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */] extends StObject {
    
    /** For cellular networks, cellular network properties. */
    var Cellular: js.UndefOr[CellularProperties[M] | CellularBase] = js.undefined
    
    /** For Ethernet networks, the Ethernet network properties. */
    var Ethernet: js.UndefOr[EthernetProperties[M] | Authentication] = js.undefined
    
    /** The network GUID. */
    var GUID: js.UndefOr[String] = js.undefined
    
    /** The network's IP address configuration type. */
    var IPAddressConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.undefined
    
    /** A user friendly network name. */
    var Name: js.UndefOr[String | ManagedDOMString] = js.undefined
    
    /** The IP configuration type for the name servers used by the network. */
    var NameServersConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.undefined
    
    /** The network priority. */
    var Priority: js.UndefOr[integer | ManagedLong] = js.undefined
    
    /** The network type. */
    var Type: js.UndefOr[NetworkType] = js.undefined
    
    /** For VPN networks, the network VPN properties. */
    var VPN: js.UndefOr[(VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | Type] = js.undefined
    
    /** For WiFi networks, the network WiFi properties. */
    var WiFi: js.UndefOr[
        (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
      ] = js.undefined
    
    /** For WiMAX networks, the network WiMAX properties. */
    var WiMAX: js.UndefOr[(WiMAXProperties[M, Boolean | ManagedBoolean]) | SignalStrength] = js.undefined
  }
  object NetworkConfigBase {
    
    inline def apply[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */](): NetworkConfigBase[M, IF, OF] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkConfigBase[M, IF, OF]]
    }
    
    extension [Self <: NetworkConfigBase[?, ?, ?], M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */](x: Self & (NetworkConfigBase[M, IF, OF])) {
      
      inline def setCellular(value: CellularProperties[M] | CellularBase): Self = StObject.set(x, "Cellular", value.asInstanceOf[js.Any])
      
      inline def setCellularUndefined: Self = StObject.set(x, "Cellular", js.undefined)
      
      inline def setEthernet(value: EthernetProperties[M] | Authentication): Self = StObject.set(x, "Ethernet", value.asInstanceOf[js.Any])
      
      inline def setEthernetUndefined: Self = StObject.set(x, "Ethernet", js.undefined)
      
      inline def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
      
      inline def setGUIDUndefined: Self = StObject.set(x, "GUID", js.undefined)
      
      inline def setIPAddressConfigType(value: IPConfigType | ManagedIPConfigType): Self = StObject.set(x, "IPAddressConfigType", value.asInstanceOf[js.Any])
      
      inline def setIPAddressConfigTypeUndefined: Self = StObject.set(x, "IPAddressConfigType", js.undefined)
      
      inline def setName(value: String | ManagedDOMString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameServersConfigType(value: IPConfigType | ManagedIPConfigType): Self = StObject.set(x, "NameServersConfigType", value.asInstanceOf[js.Any])
      
      inline def setNameServersConfigTypeUndefined: Self = StObject.set(x, "NameServersConfigType", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setPriority(value: integer | ManagedLong): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
      
      inline def setType(value: NetworkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
      
      inline def setVPN(value: (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | Type): Self = StObject.set(x, "VPN", value.asInstanceOf[js.Any])
      
      inline def setVPNUndefined: Self = StObject.set(x, "VPN", js.undefined)
      
      inline def setWiFi(
        value: (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
      ): Self = StObject.set(x, "WiFi", value.asInstanceOf[js.Any])
      
      inline def setWiFiUndefined: Self = StObject.set(x, "WiFi", js.undefined)
      
      inline def setWiMAX(value: (WiMAXProperties[M, Boolean | ManagedBoolean]) | SignalStrength): Self = StObject.set(x, "WiMAX", value.asInstanceOf[js.Any])
      
      inline def setWiMAXUndefined: Self = StObject.set(x, "WiMAX", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.unknown__
    - typings.chromeApps.chromeAppsStrings.getter
    - typings.chromeApps.chromeAppsStrings.setter
  */
  trait ObjectFunction extends StObject
  object ObjectFunction {
    
    inline def getter: typings.chromeApps.chromeAppsStrings.getter = "getter".asInstanceOf[typings.chromeApps.chromeAppsStrings.getter]
    
    inline def setter: typings.chromeApps.chromeAppsStrings.setter = "setter".asInstanceOf[typings.chromeApps.chromeAppsStrings.setter]
    
    inline def unknown: unknown__ = "unknown".asInstanceOf[unknown__]
  }
}
