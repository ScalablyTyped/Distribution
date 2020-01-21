package typings.baiduApp.swan

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteBLECharacteristicValue_
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: String
  @JSName("complete")
  var complete_WriteBLECharacteristicValue_ : js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: String
  @JSName("fail")
  var fail_WriteBLECharacteristicValue_ : js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 蓝牙特征值对应服务的 uuid
  		 */
  var serviceId: String
  /**
  		 * 蓝牙设备特征值对应的二进制值
  		 */
  var value: ArrayBuffer
  @JSName("success")
  def success_MWriteBLECharacteristicValue_(res: ErrMsgResponse): Unit
}

object WriteBLECharacteristicValue_ {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: ErrMsgResponse => Unit,
    value: ArrayBuffer,
    complete: () => Unit = null,
    fail: () => Unit = null
  ): WriteBLECharacteristicValue_ = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), value = value.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    __obj.asInstanceOf[WriteBLECharacteristicValue_]
  }
}

