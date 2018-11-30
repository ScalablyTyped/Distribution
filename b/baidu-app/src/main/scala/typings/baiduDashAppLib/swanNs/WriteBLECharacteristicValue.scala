package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WriteBLECharacteristicValue
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: java.lang.String
  @JSName("complete")
  var complete_WriteBLECharacteristicValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: java.lang.String
  @JSName("fail")
  var fail_WriteBLECharacteristicValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * 蓝牙特征值对应服务的 uuid
  		 */
  var serviceId: java.lang.String
  /**
  		 * 蓝牙设备特征值对应的二进制值
  		 */
  var value: stdLib.ArrayBuffer
  @JSName("success")
  def success_MWriteBLECharacteristicValue(res: ErrMsgResponse): scala.Unit
}

