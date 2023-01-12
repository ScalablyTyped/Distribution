package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindByUrlNameTitle extends StObject {
  
  var title: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var windowName: js.UndefOr[String] = js.undefined
}
object FindByUrlNameTitle {
  
  inline def apply(): FindByUrlNameTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindByUrlNameTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindByUrlNameTitle] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
    
    inline def setWindowNameUndefined: Self = StObject.set(x, "windowName", js.undefined)
  }
}
