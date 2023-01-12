package typings.baseui.menuTypesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedMenuRef extends StObject {
  
  var current: HTMLElement | Null
}
object NestedMenuRef {
  
  inline def apply(): NestedMenuRef = {
    val __obj = js.Dynamic.literal(current = null)
    __obj.asInstanceOf[NestedMenuRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NestedMenuRef] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: HTMLElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
  }
}
