package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.Array[java.lang.String]
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: baiduDashAppLib.Anon_Devices with ErrMsgResponse): scala.Unit
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(
    services: js.Array[java.lang.String],
    success: js.Function1[baiduDashAppLib.Anon_Devices with ErrMsgResponse, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(services = services, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
}

