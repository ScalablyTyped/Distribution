package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentstackRequest extends StObject {
  
  var option: js.Object
  
  var url: String
}
object ContentstackRequest {
  
  inline def apply(option: js.Object, url: String): ContentstackRequest = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentstackRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentstackRequest] (val x: Self) extends AnyVal {
    
    inline def setOption(value: js.Object): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
