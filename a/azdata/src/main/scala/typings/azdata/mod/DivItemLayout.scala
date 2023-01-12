package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DivItemLayout extends StObject {
  
  /**
    * Matches the CSS style key and its available values.
    */
  var CSSStyles: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * Matches the order CSS property and its available values.
    */
  var order: js.UndefOr[Double] = js.undefined
}
object DivItemLayout {
  
  inline def apply(): DivItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivItemLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DivItemLayout] (val x: Self) extends AnyVal {
    
    inline def setCSSStyles(value: CssStyles): Self = StObject.set(x, "CSSStyles", value.asInstanceOf[js.Any])
    
    inline def setCSSStylesUndefined: Self = StObject.set(x, "CSSStyles", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
