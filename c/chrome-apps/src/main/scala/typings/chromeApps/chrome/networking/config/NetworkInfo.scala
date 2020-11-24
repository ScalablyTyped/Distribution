package typings.chromeApps.chrome.networking.config

import typings.chromeApps.anon.WIFI
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.None
import typings.chromeApps.chromeAppsStrings.WI_FI
import typings.chromeApps.chromeAppsStrings.WiFi
import typings.chromeApps.chromeAppsStrings.`WEP-PSK`
import typings.chromeApps.chromeAppsStrings.`WPA-EAP`
import typings.chromeApps.chromeAppsStrings.`WPA-PSK`
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInfo extends js.Object {
  
  /**
    * The basic service set identification (BSSID) uniquely identifying the
    * basic service set. *BSSID* is represented as a human readable,
    * hex-encoded string with bytes separated by colons, e.g.
    * 45:67:89:ab:cd:ef.
    */
  var BSSID: js.UndefOr[String] = js.native
  
  /** A unique identifier of the network. */
  var GUID: js.UndefOr[String] = js.native
  
  /**
    * A hex-encoded byte sequence.
    */
  var HexSSID: js.UndefOr[String] = js.native
  
  /**
    * The decoded SSID of the network (default encoding is UTF-8).
    * To filter for non-UTF-8 SSIDs, use HexSSID instead.
    */
  var SSID: js.UndefOr[String] = js.native
  
  /** Identifier indicating the security type of the network. */
  var Security: js.UndefOr[None | `WEP-PSK` | `WPA-PSK` | `WPA-EAP`] = js.native
  
  /** Currently only WiFi supported. */
  var Type: ToStringLiteral[WIFI, WI_FI, Exclude[WI_FI, WiFi]] = js.native
}
object NetworkInfo {
  
  @scala.inline
  def apply(Type: ToStringLiteral[WIFI, WI_FI, Exclude[WI_FI, WiFi]]): NetworkInfo = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
  
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
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
    def setType(value: ToStringLiteral[WIFI, WI_FI, Exclude[WI_FI, WiFi]]): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSSID(value: String): Self = this.set("BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBSSID: Self = this.set("BSSID", js.undefined)
    
    @scala.inline
    def setGUID(value: String): Self = this.set("GUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGUID: Self = this.set("GUID", js.undefined)
    
    @scala.inline
    def setHexSSID(value: String): Self = this.set("HexSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHexSSID: Self = this.set("HexSSID", js.undefined)
    
    @scala.inline
    def setSSID(value: String): Self = this.set("SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSID: Self = this.set("SSID", js.undefined)
    
    @scala.inline
    def setSecurity(value: None | `WEP-PSK` | `WPA-PSK` | `WPA-EAP`): Self = this.set("Security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("Security", js.undefined)
  }
}
