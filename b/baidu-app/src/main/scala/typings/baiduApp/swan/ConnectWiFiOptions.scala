package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectWiFiOptions
  extends BaseOptions[js.Any, js.Any] {
  /** Wi-Fi 设备bssid */
  var BSSID: String = js.native
  /** Wi-Fi 设备ssid */
  var SSID: String = js.native
  /** Wi-Fi 设备密码 */
  var password: js.UndefOr[String] = js.native
}

object ConnectWiFiOptions {
  @scala.inline
  def apply(BSSID: String, SSID: String): ConnectWiFiOptions = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectWiFiOptions]
  }
  @scala.inline
  implicit class ConnectWiFiOptionsOps[Self <: ConnectWiFiOptions] (val x: Self) extends AnyVal {
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
    def setSSID(value: String): Self = this.set("SSID", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
  
}

