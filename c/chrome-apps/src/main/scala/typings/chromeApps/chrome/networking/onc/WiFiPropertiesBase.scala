package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WiFiPropertiesBase[M /* <: ManagedObject */, S] extends js.Object {
  
  /** The BSSID of the associated access point.. */
  var BSSID: js.UndefOr[String] = js.native
  
  /**
    * The WiFi service operating frequency in MHz.
    * For connected networks, the current frequency on which the network is connected.
    * Otherwise, the frequency of the best available BSS.
    */
  var Frequency: js.UndefOr[integer] = js.native
  
  /** HEX-encoded copy of the network SSID. */
  var HexSSID: js.UndefOr[S] = js.native
  
  /** The network SSID. */
  var SSID: js.UndefOr[S] = js.native
  
  /** The network security type. */
  var Security: js.UndefOr[S] = js.native
  
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.native
  
  /**
    * @since Chrome 70
    * @description The tethering state associated with the connection.
    */
  var TetheringState: js.UndefOr[String] = js.native
}
object WiFiPropertiesBase {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, S](): WiFiPropertiesBase[M, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiPropertiesBase[M, S]]
  }
  
  @scala.inline
  implicit class WiFiPropertiesBaseOps[Self <: WiFiPropertiesBase[_, _], M /* <: ManagedObject */, S] (val x: Self with (WiFiPropertiesBase[M, S])) extends AnyVal {
    
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
    def setBSSID(value: String): Self = this.set("BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBSSID: Self = this.set("BSSID", js.undefined)
    
    @scala.inline
    def setFrequency(value: integer): Self = this.set("Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("Frequency", js.undefined)
    
    @scala.inline
    def setHexSSID(value: S): Self = this.set("HexSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHexSSID: Self = this.set("HexSSID", js.undefined)
    
    @scala.inline
    def setSSID(value: S): Self = this.set("SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSID: Self = this.set("SSID", js.undefined)
    
    @scala.inline
    def setSecurity(value: S): Self = this.set("Security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("Security", js.undefined)
    
    @scala.inline
    def setSignalStrength(value: integer): Self = this.set("SignalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignalStrength: Self = this.set("SignalStrength", js.undefined)
    
    @scala.inline
    def setTetheringState(value: String): Self = this.set("TetheringState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTetheringState: Self = this.set("TetheringState", js.undefined)
  }
}
