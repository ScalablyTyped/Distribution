package typings.baiduApp.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceId extends js.Object {
  /**
    * 特征值 uuid
    */
  var characteristicId: String = js.native
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String = js.native
  /**
    * 特征值所属服务 uuid
    */
  var serviceId: String = js.native
  /**
    * 特征值最新的值
    */
  var value: ArrayBuffer = js.native
}

object DeviceId {
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, value: ArrayBuffer): DeviceId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceId]
  }
  @scala.inline
  implicit class DeviceIdOps[Self <: DeviceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharacteristicId(value: String): Self = this.set("characteristicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

