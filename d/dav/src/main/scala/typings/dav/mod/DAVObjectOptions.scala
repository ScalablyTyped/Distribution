package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.DAVObject> */
trait DAVObjectOptions extends StObject {
  
  var constructor: js.UndefOr[js.Function1[/* options */ this.type, js.Any]] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object DAVObjectOptions {
  
  @scala.inline
  def apply(): DAVObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DAVObjectOptions]
  }
  
  @scala.inline
  implicit class DAVObjectOptionsMutableBuilder[Self <: DAVObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstructor(value: DAVObjectOptions => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
