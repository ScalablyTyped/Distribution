package typings.baiduApp.swan

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteBLECharacteristicValue
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String = js.native
  @JSName("complete")
  var complete_WriteBLECharacteristicValue: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String = js.native
  @JSName("fail")
  var fail_WriteBLECharacteristicValue: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String = js.native
  /**
    * 蓝牙设备特征值对应的二进制值
    */
  var value: ArrayBuffer = js.native
  @JSName("success")
  def success_MWriteBLECharacteristicValue(res: ErrMsgResponse): Unit = js.native
}

object WriteBLECharacteristicValue {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: ErrMsgResponse => Unit,
    value: ArrayBuffer
  ): WriteBLECharacteristicValue = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteBLECharacteristicValue]
  }
  @scala.inline
  implicit class WriteBLECharacteristicValueOps[Self <: WriteBLECharacteristicValue] (val x: Self) extends AnyVal {
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
    def setSuccess(value: ErrMsgResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
  }
  
}

