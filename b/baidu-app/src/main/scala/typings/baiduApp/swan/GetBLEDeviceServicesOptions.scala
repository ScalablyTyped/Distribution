package typings.baiduApp.swan

import typings.baiduApp.anon.servicesArrayuuidstringis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceServicesOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 蓝牙设备 id，参考 getDevices 接口
    */
  var deviceId: String
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  @JSName("success")
  def success_MGetBLEDeviceServicesOptions(res: servicesArrayuuidstringis): Unit
}
object GetBLEDeviceServicesOptions {
  
  inline def apply(deviceId: String, success: servicesArrayuuidstringis => Unit): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBLEDeviceServicesOptions] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: servicesArrayuuidstringis => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
