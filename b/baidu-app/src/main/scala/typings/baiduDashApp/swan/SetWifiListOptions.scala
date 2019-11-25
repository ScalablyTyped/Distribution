package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetWifiListOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 提供预设的 Wi-Fi 信息列表 */
  var wifiList: js.Array[SetWifiList]
}

object SetWifiListOptions {
  @scala.inline
  def apply(
    wifiList: js.Array[SetWifiList],
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): SetWifiListOptions = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetWifiListOptions]
  }
}

