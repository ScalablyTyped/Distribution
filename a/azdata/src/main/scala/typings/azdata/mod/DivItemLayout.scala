package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DivItemLayout extends StObject {
  
  /**
    * Matches the CSS style key and its available values.
    */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Matches the order CSS property and its available values.
    */
  var order: js.UndefOr[Double] = js.native
}
object DivItemLayout {
  
  @scala.inline
  def apply(): DivItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivItemLayout]
  }
  
  @scala.inline
  implicit class DivItemLayoutMutableBuilder[Self <: DivItemLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCSSStyles(value: StringDictionary[String]): Self = StObject.set(x, "CSSStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSStylesUndefined: Self = StObject.set(x, "CSSStyles", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
