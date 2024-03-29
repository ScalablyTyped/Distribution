package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设备-----剪贴板
trait SetClipboardDataOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var data: String
}
object SetClipboardDataOptions {
  
  inline def apply(data: String): SetClipboardDataOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetClipboardDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetClipboardDataOptions] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
