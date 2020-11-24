package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.networking.onc.internal.ObjectFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WiFiProperties[M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L] extends WiFiPropertiesBase[M, String | ManagedDOMString] {
  
  /**
    * Whether ARP polling of default gateway is allowed.
    * @default true
    */
  var AllowGatewayARPPolling: js.UndefOr[B] = js.native
  
  /** Whether the WiFi network should be connected automatically when in range. */
  var AutoConnect: js.UndefOr[B] = js.native
  
  /** The network EAP properties. Required for WEP-8021X and WPA-EAP networks. */
  var EAP: js.UndefOr[EAPProperties] = js.native
  
  /** Contains all operating frequency recently seen for the WiFi network. */
  var FrequencyList: js.UndefOr[js.Array[integer]] = js.native
  
  /** Whether the network SSID will be broadcast. */
  var HiddenSSID: js.UndefOr[B] = js.native
  
  /**
    * @since Chrome 66.
    * The passphrase for WEP/WPA/WPA2 connections.
    * *This property can only be set!*
    */
  var Passphrase: js.UndefOr[String] = js.native
  
  /** Signal-to-noise value (in dB) below which roaming to a new network should be attempted. */
  var RoamTreshold: js.UndefOr[L] = js.native
}
object WiFiProperties {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L](): WiFiProperties[M, OF, B, S, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiProperties[M, OF, B, S, L]]
  }
  
  @scala.inline
  implicit class WiFiPropertiesOps[Self <: WiFiProperties[_, _, _, _, _], M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L] (val x: Self with (WiFiProperties[M, OF, B, S, L])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowGatewayARPPolling(value: B): Self = this.set("AllowGatewayARPPolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowGatewayARPPolling: Self = this.set("AllowGatewayARPPolling", js.undefined)
    
    @scala.inline
    def setAutoConnect(value: B): Self = this.set("AutoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConnect: Self = this.set("AutoConnect", js.undefined)
    
    @scala.inline
    def setEAP(value: EAPProperties): Self = this.set("EAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEAP: Self = this.set("EAP", js.undefined)
    
    @scala.inline
    def setFrequencyListVarargs(value: integer*): Self = this.set("FrequencyList", js.Array(value :_*))
    
    @scala.inline
    def setFrequencyList(value: js.Array[integer]): Self = this.set("FrequencyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencyList: Self = this.set("FrequencyList", js.undefined)
    
    @scala.inline
    def setHiddenSSID(value: B): Self = this.set("HiddenSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenSSID: Self = this.set("HiddenSSID", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("Passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("Passphrase", js.undefined)
    
    @scala.inline
    def setRoamTreshold(value: L): Self = this.set("RoamTreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoamTreshold: Self = this.set("RoamTreshold", js.undefined)
  }
}
