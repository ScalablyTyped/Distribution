package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseBLEConnectionOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 getDevices 接口
  		 */
  var deviceId: java.lang.String
  @JSName("success")
  def success_MCloseBLEConnectionOptions(res: ErrMsgResponse): scala.Unit
}

object CloseBLEConnectionOptions {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    success: ErrMsgResponse => scala.Unit,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null
  ): CloseBLEConnectionOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[CloseBLEConnectionOptions]
  }
}

