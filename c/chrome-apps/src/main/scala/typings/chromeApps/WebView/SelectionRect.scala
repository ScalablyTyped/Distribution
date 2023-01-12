package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a rectangle in screen coordinates.
  * The containment semantics are array-like; that is, the coordinate (left, top) is considered to be contained by the rectangle,
  * but the coordinate (left + width, top) is not.
  **/
trait SelectionRect extends StObject {
  
  /** Height of the rectangle. */
  var height: integer
  
  /** Distance from the left edge of the screen to the left edge of the rectangle. */
  var left: integer
  
  /** Distance from the top edge of the screen to the top edge of the rectangle. */
  var top: integer
  
  /** Width of the rectangle. */
  var width: integer
}
object SelectionRect {
  
  inline def apply(height: integer, left: integer, top: integer, width: integer): SelectionRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionRect] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: integer): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: integer): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
