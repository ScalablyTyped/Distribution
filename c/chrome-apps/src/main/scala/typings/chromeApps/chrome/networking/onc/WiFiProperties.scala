package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.networking.onc.internal.ObjectFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiFiProperties[M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L]
  extends StObject
     with WiFiPropertiesBase[
      M, 
      /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string */ js.Any
    ] {
  
  /**
    * Whether ARP polling of default gateway is allowed.
    * @default true
    */
  var AllowGatewayARPPolling: js.UndefOr[B] = js.undefined
  
  /** Whether the WiFi network should be connected automatically when in range. */
  var AutoConnect: js.UndefOr[B] = js.undefined
  
  /** The network EAP properties. Required for WEP-8021X and WPA-EAP networks. */
  var EAP: js.UndefOr[EAPProperties] = js.undefined
  
  /** Contains all operating frequency recently seen for the WiFi network. */
  var FrequencyList: js.UndefOr[js.Array[integer]] = js.undefined
  
  /** Whether the network SSID will be broadcast. */
  var HiddenSSID: js.UndefOr[B] = js.undefined
  
  /**
    * @since Chrome 66.
    * The passphrase for WEP/WPA/WPA2 connections.
    * *This property can only be set!*
    */
  var Passphrase: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: OF extends 'setter' ? string : never | undefined */ js.Any
  ] = js.undefined
  
  /** Signal-to-noise value (in dB) below which roaming to a new network should be attempted. */
  var RoamTreshold: js.UndefOr[L] = js.undefined
}
object WiFiProperties {
  
  inline def apply[M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L](): WiFiProperties[M, OF, B, S, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiProperties[M, OF, B, S, L]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WiFiProperties[?, ?, ?, ?, ?], M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L] (val x: Self & (WiFiProperties[M, OF, B, S, L])) extends AnyVal {
    
    inline def setAllowGatewayARPPolling(value: B): Self = StObject.set(x, "AllowGatewayARPPolling", value.asInstanceOf[js.Any])
    
    inline def setAllowGatewayARPPollingUndefined: Self = StObject.set(x, "AllowGatewayARPPolling", js.undefined)
    
    inline def setAutoConnect(value: B): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    inline def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    inline def setEAP(value: EAPProperties): Self = StObject.set(x, "EAP", value.asInstanceOf[js.Any])
    
    inline def setEAPUndefined: Self = StObject.set(x, "EAP", js.undefined)
    
    inline def setFrequencyList(value: js.Array[integer]): Self = StObject.set(x, "FrequencyList", value.asInstanceOf[js.Any])
    
    inline def setFrequencyListUndefined: Self = StObject.set(x, "FrequencyList", js.undefined)
    
    inline def setFrequencyListVarargs(value: integer*): Self = StObject.set(x, "FrequencyList", js.Array(value*))
    
    inline def setHiddenSSID(value: B): Self = StObject.set(x, "HiddenSSID", value.asInstanceOf[js.Any])
    
    inline def setHiddenSSIDUndefined: Self = StObject.set(x, "HiddenSSID", js.undefined)
    
    inline def setPassphrase(
      value: /* import warning: importer.ImportType#apply Failed type conversion: OF extends 'setter' ? string : never | undefined */ js.Any
    ): Self = StObject.set(x, "Passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "Passphrase", js.undefined)
    
    inline def setRoamTreshold(value: L): Self = StObject.set(x, "RoamTreshold", value.asInstanceOf[js.Any])
    
    inline def setRoamTresholdUndefined: Self = StObject.set(x, "RoamTreshold", js.undefined)
  }
}
