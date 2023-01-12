package typings.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GhostOptions extends StObject {
  
  var clicks: js.UndefOr[Boolean] = js.undefined
  
  var forms: js.UndefOr[FormsOptions | Boolean] = js.undefined
  
  var scroll: js.UndefOr[Boolean] = js.undefined
}
object GhostOptions {
  
  inline def apply(): GhostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GhostOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GhostOptions] (val x: Self) extends AnyVal {
    
    inline def setClicks(value: Boolean): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setClicksUndefined: Self = StObject.set(x, "clicks", js.undefined)
    
    inline def setForms(value: FormsOptions | Boolean): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
    
    inline def setFormsUndefined: Self = StObject.set(x, "forms", js.undefined)
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
  }
}
