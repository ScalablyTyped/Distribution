package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiFiPropertiesBase[M /* <: ManagedObject */, S] extends StObject {
  
  /** The BSSID of the associated access point.. */
  var BSSID: js.UndefOr[String] = js.undefined
  
  /**
    * The WiFi service operating frequency in MHz.
    * For connected networks, the current frequency on which the network is connected.
    * Otherwise, the frequency of the best available BSS.
    */
  var Frequency: js.UndefOr[integer] = js.undefined
  
  /** HEX-encoded copy of the network SSID. */
  var HexSSID: js.UndefOr[S] = js.undefined
  
  /** The network SSID. */
  var SSID: js.UndefOr[S] = js.undefined
  
  /** The network security type. */
  var Security: js.UndefOr[S] = js.undefined
  
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.undefined
  
  /**
    * @since Chrome 70
    * @description The tethering state associated with the connection.
    */
  var TetheringState: js.UndefOr[String] = js.undefined
}
object WiFiPropertiesBase {
  
  inline def apply[M /* <: ManagedObject */, S](): WiFiPropertiesBase[M, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiPropertiesBase[M, S]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WiFiPropertiesBase[?, ?], M /* <: ManagedObject */, S] (val x: Self & (WiFiPropertiesBase[M, S])) extends AnyVal {
    
    inline def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    inline def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
    
    inline def setFrequency(value: integer): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    inline def setHexSSID(value: S): Self = StObject.set(x, "HexSSID", value.asInstanceOf[js.Any])
    
    inline def setHexSSIDUndefined: Self = StObject.set(x, "HexSSID", js.undefined)
    
    inline def setSSID(value: S): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    inline def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
    
    inline def setSecurity(value: S): Self = StObject.set(x, "Security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "Security", js.undefined)
    
    inline def setSignalStrength(value: integer): Self = StObject.set(x, "SignalStrength", value.asInstanceOf[js.Any])
    
    inline def setSignalStrengthUndefined: Self = StObject.set(x, "SignalStrength", js.undefined)
    
    inline def setTetheringState(value: String): Self = StObject.set(x, "TetheringState", value.asInstanceOf[js.Any])
    
    inline def setTetheringStateUndefined: Self = StObject.set(x, "TetheringState", js.undefined)
  }
}
