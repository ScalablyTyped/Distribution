package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecordOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 超过30s或页面onHide时会结束录像 */
  var timeoutCallback: js.UndefOr[js.Function1[/* res */ RecordResponse, Unit]] = js.undefined
}
object StartRecordOptions {
  
  inline def apply(): StartRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRecordOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRecordOptions] (val x: Self) extends AnyVal {
    
    inline def setTimeoutCallback(value: /* res */ RecordResponse => Unit): Self = StObject.set(x, "timeoutCallback", js.Any.fromFunction1(value))
    
    inline def setTimeoutCallbackUndefined: Self = StObject.set(x, "timeoutCallback", js.undefined)
  }
}
