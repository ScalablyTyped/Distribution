package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceCharacteristicsOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: java.lang.String
  /**
  		 * 蓝牙服务 uuid
  		 */
  var serviceId: java.lang.String
  /**
  		 * 成功则返回本机蓝牙适配器状态
  		 */
  @JSName("success")
  def success_MGetBLEDeviceCharacteristicsOptions(res: baiduDashAppLib.Anon_Characteristics with ErrMsgResponse): scala.Unit
}

object GetBLEDeviceCharacteristicsOptions {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    serviceId: java.lang.String,
    success: js.Function1[baiduDashAppLib.Anon_Characteristics with ErrMsgResponse, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetBLEDeviceCharacteristicsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceId")(deviceId)
    __obj.updateDynamic("serviceId")(serviceId)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsOptions]
  }
}

