package typings.baiduDashApp

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharacteristicIdDeviceId extends js.Object {
  /**
  				 * 特征值 uuid
  				 */
  var characteristicId: String
  /**
  				 * 蓝牙设备 id，参考 device 对象
  				 */
  var deviceId: String
  /**
  				 * 特征值所属服务 uuid
  				 */
  var serviceId: String
  /**
  				 * 特征值最新的值
  				 */
  var value: ArrayBuffer
}

object Anon_CharacteristicIdDeviceId {
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, value: ArrayBuffer): Anon_CharacteristicIdDeviceId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, deviceId = deviceId, serviceId = serviceId, value = value)
  
    __obj.asInstanceOf[Anon_CharacteristicIdDeviceId]
  }
}

