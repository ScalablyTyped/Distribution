package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseBLEConnectionOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙设备 id，参考 getDevices 接口
    */
  var deviceId: String = js.native
  
  @JSName("success")
  def success_MCloseBLEConnectionOptions(res: ErrMsgResponse): Unit = js.native
}
object CloseBLEConnectionOptions {
  
  @scala.inline
  def apply(deviceId: String, success: ErrMsgResponse => Unit): CloseBLEConnectionOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[CloseBLEConnectionOptions]
  }
  
  @scala.inline
  implicit class CloseBLEConnectionOptionsMutableBuilder[Self <: CloseBLEConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
