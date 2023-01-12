package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 界面-----设置置顶信息
trait SetTopBarTextOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 置顶栏文字内容
    */
  var text: String
}
object SetTopBarTextOptions {
  
  inline def apply(text: String): SetTopBarTextOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTopBarTextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTopBarTextOptions] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
