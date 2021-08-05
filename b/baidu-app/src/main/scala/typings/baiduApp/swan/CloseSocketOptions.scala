package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 关闭WebSocket连接。
  */
trait CloseSocketOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var code: js.UndefOr[Double] = js.undefined
  
  // 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。如果这个参数没有被指定，默认的取值是1000 （表示正常连接关闭）    1.4.0
  var reason: js.UndefOr[String] = js.undefined
}
object CloseSocketOptions {
  
  inline def apply(): CloseSocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseSocketOptions]
  }
  
  extension [Self <: CloseSocketOptions](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
