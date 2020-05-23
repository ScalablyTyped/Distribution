package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetWifiList extends js.Object {
  /** Wi-Fi 设备bssid */
  var BSSID: String
  /** Wi-Fi 设备ssid */
  var SSID: String
  /** Wi-Fi 设备密码 */
  var password: String
}

object SetWifiList {
  @scala.inline
  def apply(BSSID: String, SSID: String, password: String): SetWifiList = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWifiList]
  }
}

