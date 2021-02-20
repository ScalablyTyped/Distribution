package typings.baiduApp.swan

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSName("success")
  def success_MWriteBLECharacteristicValue(res: ErrMsgResponse): Unit = js.native
  
  /**
    * 蓝牙设备特征值对应的二进制值
    */
  var value: ArrayBuffer = js.native
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
  implicit class WriteBLECharacteristicValueMutableBuilder[Self <: WriteBLECharacteristicValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
