package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewTitle extends StObject {
  
  /**
    * CSS styles of the title.
    */
  var style: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * Display text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object ListViewTitle {
  
  inline def apply(): ListViewTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListViewTitle] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: CssStyles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
