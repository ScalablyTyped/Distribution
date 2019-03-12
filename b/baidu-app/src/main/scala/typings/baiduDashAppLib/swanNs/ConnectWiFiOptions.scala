package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectWiFiOptions
  extends BaseOptions[js.Any, js.Any] {
  /** Wi-Fi 设备bssid */
  var BSSID: java.lang.String
  /** Wi-Fi 设备ssid */
  var SSID: java.lang.String
  /** Wi-Fi 设备密码 */
  var password: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectWiFiOptions {
  @scala.inline
  def apply(
    BSSID: java.lang.String,
    SSID: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    password: java.lang.String = null,
    success: js.Any => scala.Unit = null
  ): ConnectWiFiOptions = {
    val __obj = js.Dynamic.literal(BSSID = BSSID, SSID = SSID)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (password != null) __obj.updateDynamic("password")(password)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ConnectWiFiOptions]
  }
}

