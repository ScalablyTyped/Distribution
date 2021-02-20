package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networking {
  
  ////////////////////
  // Notifications
  ////////////////////
  /**
    * Use the networking.config API to authenticate to captive portals.
    * Permissions:  "networking.config"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  object config {
    
    type CaptivePorttalDetectedEvent = Event[js.Function1[/* networkInfo */ NetworkInfo, Unit]]
    
    @js.native
    trait NetworkInfo extends StObject {
      
      /** Optional. The basic service set identification (BSSID) uniquely identifying the basic service set. BSSID is represented as a human readable, hex-encoded string with bytes separated by colons, e.g. 45:67:89:ab:cd:ef. */
      var BSSID: js.UndefOr[String] = js.native
      
      /** Optional. A unique identifier of the network. */
      var GUID: js.UndefOr[String] = js.native
      
      /** Optional. A hex-encoded byte sequence. */
      var HexSSID: js.UndefOr[String] = js.native
      
      /** Optional. The decoded SSID of the network (default encoding is UTF-8). To filter for non-UTF-8 SSIDs, use HexSSID instead. */
      var SSID: js.UndefOr[String] = js.native
      
      /** Optional. Identifier indicating the security type of the network. Valid values are None, WEP-PSK, WPA-PSK and WPA-EAP. */
      var Security: js.UndefOr[String] = js.native
      
      /** Currently only WiFi supported. */
      var Type: String = js.native
    }
    object NetworkInfo {
      
      @scala.inline
      def apply(Type: String): NetworkInfo = {
        val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
        __obj.asInstanceOf[NetworkInfo]
      }
      
      @scala.inline
      implicit class NetworkInfoMutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
        
        @scala.inline
        def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGUIDUndefined: Self = StObject.set(x, "GUID", js.undefined)
        
        @scala.inline
        def setHexSSID(value: String): Self = StObject.set(x, "HexSSID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHexSSIDUndefined: Self = StObject.set(x, "HexSSID", js.undefined)
        
        @scala.inline
        def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
        
        @scala.inline
        def setSecurity(value: String): Self = StObject.set(x, "Security", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecurityUndefined: Self = StObject.set(x, "Security", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      }
    }
  }
}
