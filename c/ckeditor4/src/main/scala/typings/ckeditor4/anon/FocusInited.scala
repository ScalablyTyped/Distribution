package typings.ckeditor4.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusInited extends StObject {
  
  var focusInited: js.UndefOr[Boolean] = js.undefined
  
  var initOnlyNew: js.UndefOr[Boolean] = js.undefined
}
object FocusInited {
  
  inline def apply(): FocusInited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusInited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusInited] (val x: Self) extends AnyVal {
    
    inline def setFocusInited(value: Boolean): Self = StObject.set(x, "focusInited", value.asInstanceOf[js.Any])
    
    inline def setFocusInitedUndefined: Self = StObject.set(x, "focusInited", js.undefined)
    
    inline def setInitOnlyNew(value: Boolean): Self = StObject.set(x, "initOnlyNew", value.asInstanceOf[js.Any])
    
    inline def setInitOnlyNewUndefined: Self = StObject.set(x, "initOnlyNew", js.undefined)
  }
}
