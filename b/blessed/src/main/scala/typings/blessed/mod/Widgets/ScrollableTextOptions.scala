package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollableTextOptions
  extends StObject
     with ScrollableBoxOptions {
  
  /**
    * Use pre-defined keys (i or enter for insert, e for editor, C-e for editor while inserting).
    */
  var keys: js.UndefOr[String | js.Array[String] | Boolean] = js.undefined
  
  /**
    * Whether to enable automatic mouse support for this element.
    * Use pre-defined mouse events (right-click for editor).
    */
  var mouse: js.UndefOr[Boolean | js.Function0[Unit]] = js.undefined
  
  /**
    * Use vi keys with the keys option.
    */
  var vi: js.UndefOr[Boolean] = js.undefined
}
object ScrollableTextOptions {
  
  inline def apply(): ScrollableTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableTextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollableTextOptions] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setMouse(value: Boolean | js.Function0[Unit]): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseFunction0(value: () => Unit): Self = StObject.set(x, "mouse", js.Any.fromFunction0(value))
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setVi(value: Boolean): Self = StObject.set(x, "vi", value.asInstanceOf[js.Any])
    
    inline def setViUndefined: Self = StObject.set(x, "vi", js.undefined)
  }
}
