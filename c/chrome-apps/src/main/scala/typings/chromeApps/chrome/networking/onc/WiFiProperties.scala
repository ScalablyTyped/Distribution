package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.networking.onc.internal.ObjectFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiFiProperties[M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L]
  extends StObject
     with WiFiPropertiesBase[M, String | ManagedDOMString] {
  
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
  var Passphrase: js.UndefOr[String] = js.undefined
  
  /** Signal-to-noise value (in dB) below which roaming to a new network should be attempted. */
  var RoamTreshold: js.UndefOr[L] = js.undefined
}
object WiFiProperties {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L](): WiFiProperties[M, OF, B, S, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiProperties[M, OF, B, S, L]]
  }
  
  @scala.inline
  implicit class WiFiPropertiesMutableBuilder[Self <: WiFiProperties[?, ?, ?, ?, ?], M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L] (val x: Self & (WiFiProperties[M, OF, B, S, L])) extends AnyVal {
    
    @scala.inline
    def setAllowGatewayARPPolling(value: B): Self = StObject.set(x, "AllowGatewayARPPolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowGatewayARPPollingUndefined: Self = StObject.set(x, "AllowGatewayARPPolling", js.undefined)
    
    @scala.inline
    def setAutoConnect(value: B): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    @scala.inline
    def setEAP(value: EAPProperties): Self = StObject.set(x, "EAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEAPUndefined: Self = StObject.set(x, "EAP", js.undefined)
    
    @scala.inline
    def setFrequencyList(value: js.Array[integer]): Self = StObject.set(x, "FrequencyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyListUndefined: Self = StObject.set(x, "FrequencyList", js.undefined)
    
    @scala.inline
    def setFrequencyListVarargs(value: integer*): Self = StObject.set(x, "FrequencyList", js.Array(value :_*))
    
    @scala.inline
    def setHiddenSSID(value: B): Self = StObject.set(x, "HiddenSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenSSIDUndefined: Self = StObject.set(x, "HiddenSSID", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "Passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "Passphrase", js.undefined)
    
    @scala.inline
    def setRoamTreshold(value: L): Self = StObject.set(x, "RoamTreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoamTresholdUndefined: Self = StObject.set(x, "RoamTreshold", js.undefined)
  }
}
