package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBLEConnectionOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 getDevices 接口
  		 */
  var deviceId: java.lang.String
  @JSName("success")
  def success_MCreateBLEConnectionOptions(res: ErrMsgResponse): scala.Unit
}

object CreateBLEConnectionOptions {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    success: js.Function1[ErrMsgResponse, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): CreateBLEConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceId")(deviceId)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[CreateBLEConnectionOptions]
  }
}

