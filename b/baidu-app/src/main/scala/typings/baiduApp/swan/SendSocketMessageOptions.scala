package typings.baiduApp.swan

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendSocketMessageOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 需要发送的内容 */
  var data: String | ArrayBuffer
}
object SendSocketMessageOptions {
  
  @scala.inline
  def apply(data: String | ArrayBuffer): SendSocketMessageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendSocketMessageOptions]
  }
  
  @scala.inline
  implicit class SendSocketMessageOptionsMutableBuilder[Self <: SendSocketMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
