package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexItemLayout extends StObject {
  
  /**
    * Matches the CSS style key and its available values.
    */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.undefined
  
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
  
  @scala.inline
  def apply(): FlexItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexItemLayout]
  }
  
  @scala.inline
  implicit class FlexItemLayoutMutableBuilder[Self <: FlexItemLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCSSStyles(value: StringDictionary[String]): Self = StObject.set(x, "CSSStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSStylesUndefined: Self = StObject.set(x, "CSSStyles", js.undefined)
    
    @scala.inline
    def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
