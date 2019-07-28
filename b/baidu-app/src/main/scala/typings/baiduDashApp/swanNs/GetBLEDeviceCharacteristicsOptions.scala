package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_Characteristics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceCharacteristicsOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: String
  /**
  		 * 蓝牙服务 uuid
  		 */
  var serviceId: String
  /**
  		 * 成功则返回本机蓝牙适配器状态
  		 */
  @JSName("success")
  def success_MGetBLEDeviceCharacteristicsOptions(res: Anon_Characteristics with ErrMsgResponse): Unit
}

object GetBLEDeviceCharacteristicsOptions {
  @scala.inline
  def apply(
    deviceId: String,
    serviceId: String,
    success: Anon_Characteristics with ErrMsgResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetBLEDeviceCharacteristicsOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, serviceId = serviceId, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsOptions]
  }
}

