package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedWifiOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetConnectedWifiOptions(wifi: WiFi): scala.Unit
}

object GetConnectedWifiOptions {
  @scala.inline
  def apply(
    success: js.Function1[WiFi, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetConnectedWifiOptions = {
    val __obj = js.Dynamic.literal(success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetConnectedWifiOptions]
  }
}

