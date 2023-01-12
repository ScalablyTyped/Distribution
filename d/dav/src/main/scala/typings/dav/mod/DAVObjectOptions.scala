package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.DAVObject> */
trait DAVObjectOptions extends StObject {
  
  var constructor: js.UndefOr[js.Function1[/* options */ this.type, Any]] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object DAVObjectOptions {
  
  inline def apply(): DAVObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DAVObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DAVObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setConstructor(value: DAVObjectOptions => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
