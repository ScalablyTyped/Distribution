package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTypeCollection extends StObject {
  
  var content_types: js.Array[Any]
  
  var count: js.UndefOr[Double] = js.undefined
}
object ContentTypeCollection {
  
  inline def apply(content_types: js.Array[Any]): ContentTypeCollection = {
    val __obj = js.Dynamic.literal(content_types = content_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentTypeCollection] (val x: Self) extends AnyVal {
    
    inline def setContent_types(value: js.Array[Any]): Self = StObject.set(x, "content_types", value.asInstanceOf[js.Any])
    
    inline def setContent_typesVarargs(value: Any*): Self = StObject.set(x, "content_types", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
