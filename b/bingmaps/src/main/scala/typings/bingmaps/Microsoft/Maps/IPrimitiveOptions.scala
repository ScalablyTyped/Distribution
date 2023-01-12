package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrimitiveOptions extends StObject {
  
  /** The css cursor to show when the IPrimitive has mouse events on it. Default value is pointer (hand). */
  var cursor: js.UndefOr[String] = js.undefined
  
  /** Boolean indicating whether the IPrimitive is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IPrimitiveOptions {
  
  inline def apply(): IPrimitiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPrimitiveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPrimitiveOptions] (val x: Self) extends AnyVal {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
