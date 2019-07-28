package typings.baiduDashApp.swanNs

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
    val __obj = js.Dynamic.literal(BSSID = BSSID, SSID = SSID, password = password)
  
    __obj.asInstanceOf[SetWifiList]
  }
}

