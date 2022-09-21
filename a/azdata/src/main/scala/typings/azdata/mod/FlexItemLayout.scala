package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexItemLayout extends StObject {
  
  /**
    * Matches the CSS style key and its available values.
    */
  var CSSStyles: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * Matches the flex CSS property and its available values.
    * Default is "1 1 auto".
    */
  var flex: js.UndefOr[String] = js.undefined
  
  /**
    * Matches the order CSS property and its available values.
    */
  var order: js.UndefOr[Double] = js.undefined
}
object FlexItemLayout {
  
  inline def apply(): FlexItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexItemLayout]
  }
  
  extension [Self <: FlexItemLayout](x: Self) {
    
    inline def setCSSStyles(value: CssStyles): Self = StObject.set(x, "CSSStyles", value.asInstanceOf[js.Any])
    
    inline def setCSSStylesUndefined: Self = StObject.set(x, "CSSStyles", js.undefined)
    
    inline def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
