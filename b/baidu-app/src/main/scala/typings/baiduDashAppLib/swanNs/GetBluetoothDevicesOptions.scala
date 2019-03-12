package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetBluetoothDevicesOptions(res: baiduDashAppLib.Anon_Devices with ErrMsgResponse): scala.Unit
}

object GetBluetoothDevicesOptions {
  @scala.inline
  def apply(
    success: baiduDashAppLib.Anon_Devices with ErrMsgResponse => scala.Unit,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null
  ): GetBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetBluetoothDevicesOptions]
  }
}

