package typings.chrome.chrome.networking.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInfo extends js.Object {
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
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
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
    def setSecurity(value: String): Self = this.set("Security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("Security", js.undefined)
  }
  
}

