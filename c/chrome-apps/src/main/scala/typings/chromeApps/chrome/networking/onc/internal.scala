package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.anon.Authentication
import typings.chromeApps.anon.SignalStrength
import typings.chromeApps.anon.Type
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.unknown__
import typings.chromeApps.chromeAppsStrings.unmanaged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Partial classes for internal use
  * @internal
  * @private
  */
object internal {
  
  @js.native
  trait NetworkConfigBase[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */] extends StObject {
    
    /** For cellular networks, cellular network properties. */
    var Cellular: js.UndefOr[CellularProperties[M] | CellularBase] = js.native
    
    /** For Ethernet networks, the Ethernet network properties. */
    var Ethernet: js.UndefOr[EthernetProperties[M] | Authentication] = js.native
    
    /** The network GUID. */
    var GUID: js.UndefOr[String] = js.native
    
    /** The network's IP address configuration type. */
    var IPAddressConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.native
    
    /** A user friendly network name. */
    var Name: js.UndefOr[String | ManagedDOMString] = js.native
    
    /** The IP configuration type for the name servers used by the network. */
    var NameServersConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.native
    
    /** The network priority. */
    var Priority: js.UndefOr[integer | ManagedLong] = js.native
    
    /** The network type. */
    var Type: js.UndefOr[NetworkType] = js.native
    
    /** For VPN networks, the network VPN properties. */
    var VPN: js.UndefOr[(VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | Type] = js.native
    
    /** For WiFi networks, the network WiFi properties. */
    var WiFi: js.UndefOr[
        (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
      ] = js.native
    
    /** For WiMAX networks, the network WiMAX properties. */
    var WiMAX: js.UndefOr[(WiMAXProperties[M, Boolean | ManagedBoolean]) | SignalStrength] = js.native
  }
  object NetworkConfigBase {
    
    @scala.inline
    def apply[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */](): NetworkConfigBase[M, IF, OF] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkConfigBase[M, IF, OF]]
    }
    
    @scala.inline
    implicit class NetworkConfigBaseMutableBuilder[Self <: NetworkConfigBase[_, _, _], M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */] (val x: Self with (NetworkConfigBase[M, IF, OF])) extends AnyVal {
      
      @scala.inline
      def setCellular(value: CellularProperties[M] | CellularBase): Self = StObject.set(x, "Cellular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellularUndefined: Self = StObject.set(x, "Cellular", js.undefined)
      
      @scala.inline
      def setEthernet(value: EthernetProperties[M] | Authentication): Self = StObject.set(x, "Ethernet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEthernetUndefined: Self = StObject.set(x, "Ethernet", js.undefined)
      
      @scala.inline
      def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGUIDUndefined: Self = StObject.set(x, "GUID", js.undefined)
      
      @scala.inline
      def setIPAddressConfigType(value: IPConfigType | ManagedIPConfigType): Self = StObject.set(x, "IPAddressConfigType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPAddressConfigTypeUndefined: Self = StObject.set(x, "IPAddressConfigType", js.undefined)
      
      @scala.inline
      def setName(value: String | ManagedDOMString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameServersConfigType(value: IPConfigType | ManagedIPConfigType): Self = StObject.set(x, "NameServersConfigType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameServersConfigTypeUndefined: Self = StObject.set(x, "NameServersConfigType", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setPriority(value: integer | ManagedLong): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
      
      @scala.inline
      def setType(value: NetworkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
      
      @scala.inline
      def setVPN(value: (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | Type): Self = StObject.set(x, "VPN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVPNUndefined: Self = StObject.set(x, "VPN", js.undefined)
      
      @scala.inline
      def setWiFi(
        value: (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
      ): Self = StObject.set(x, "WiFi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWiFiUndefined: Self = StObject.set(x, "WiFi", js.undefined)
      
      @scala.inline
      def setWiMAX(value: (WiMAXProperties[M, Boolean | ManagedBoolean]) | SignalStrength): Self = StObject.set(x, "WiMAX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWiMAXUndefined: Self = StObject.set(x, "WiMAX", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.unknown__
    - typings.chromeApps.chromeAppsStrings.getter
    - typings.chromeApps.chromeAppsStrings.setter
  */
  trait ObjectFunction extends StObject
  object ObjectFunction {
    
    @scala.inline
    def getter: typings.chromeApps.chromeAppsStrings.getter = "getter".asInstanceOf[typings.chromeApps.chromeAppsStrings.getter]
    
    @scala.inline
    def setter: typings.chromeApps.chromeAppsStrings.setter = "setter".asInstanceOf[typings.chromeApps.chromeAppsStrings.setter]
    
    @scala.inline
    def unknown: unknown__ = "unknown".asInstanceOf[unknown__]
  }
}
