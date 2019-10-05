package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiFi extends js.Object {
  /** Wi-Fi 的BSSID */
  var BSSID: String
  /** Wi-Fi 的SSID */
  var SSID: String
  /** Wi-Fi 是否安全 */
  var secure: Boolean
  /** Wi-Fi 信号强度 */
  var signalStrength: Double
}

object WiFi {
  @scala.inline
  def apply(BSSID: String, SSID: String, secure: Boolean, signalStrength: Double): WiFi = {
    val __obj = js.Dynamic.literal(BSSID = BSSID, SSID = SSID, secure = secure, signalStrength = signalStrength)
  
    __obj.asInstanceOf[WiFi]
  }
}

