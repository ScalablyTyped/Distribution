package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetWifiList extends js.Object {
  /** Wi-Fi 设备bssid */
  var BSSID: java.lang.String
  /** Wi-Fi 设备ssid */
  var SSID: java.lang.String
  /** Wi-Fi 设备密码 */
  var password: java.lang.String
}

object SetWifiList {
  @scala.inline
  def apply(BSSID: java.lang.String, SSID: java.lang.String, password: java.lang.String): SetWifiList = {
    val __obj = js.Dynamic.literal(BSSID = BSSID, SSID = SSID, password = password)
  
    __obj.asInstanceOf[SetWifiList]
  }
}

