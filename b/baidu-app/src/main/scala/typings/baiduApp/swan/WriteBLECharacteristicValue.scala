package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteBLECharacteristicValue
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String
  
  @JSName("complete")
  var complete_WriteBLECharacteristicValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
  
  @JSName("fail")
  var fail_WriteBLECharacteristicValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String
  
  @JSName("success")
  def success_MWriteBLECharacteristicValue(res: ErrMsgResponse): Unit
  
  /**
    * 蓝牙设备特征值对应的二进制值
    */
  var value: js.typedarray.ArrayBuffer
}
object WriteBLECharacteristicValue {
  
  inline def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: ErrMsgResponse => Unit,
    value: js.typedarray.ArrayBuffer
  ): WriteBLECharacteristicValue = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteBLECharacteristicValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteBLECharacteristicValue] (val x: Self) extends AnyVal {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
