package typings.cookieclicker

import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  /**
    * Same as `getBoundingClientRect`, but applies `Game.scale`
    */
  def getBounds(): DOMRect
}
object Element {
  
  inline def apply(getBounds: () => DOMRect): Element = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds))
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setGetBounds(value: () => DOMRect): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
  }
}
