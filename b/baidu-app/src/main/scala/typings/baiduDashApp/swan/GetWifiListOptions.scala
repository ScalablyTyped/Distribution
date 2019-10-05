package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWifiListOptions extends js.Object {
  /** Wi-Fi 列表数据 */
  var wifiList: js.Array[WiFi]
}

object GetWifiListOptions {
  @scala.inline
  def apply(wifiList: js.Array[WiFi]): GetWifiListOptions = {
    val __obj = js.Dynamic.literal(wifiList = wifiList)
  
    __obj.asInstanceOf[GetWifiListOptions]
  }
}

