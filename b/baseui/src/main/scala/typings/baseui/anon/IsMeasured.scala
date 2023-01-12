package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMeasured[Value] extends StObject {
  
  var isMeasured: js.UndefOr[Boolean] = js.undefined
  
  var isSelected: js.UndefOr[Boolean] = js.undefined
  
  var onSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var textQuery: js.UndefOr[String] = js.undefined
  
  var value: Value
  
  var x: Double
  
  var y: Double
}
object IsMeasured {
  
  inline def apply[Value](value: Value, x: Double, y: Double): IsMeasured[Value] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMeasured[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsMeasured[?], Value] (val x: Self & IsMeasured[Value]) extends AnyVal {
    
    inline def setIsMeasured(value: Boolean): Self = StObject.set(x, "isMeasured", value.asInstanceOf[js.Any])
    
    inline def setIsMeasuredUndefined: Self = StObject.set(x, "isMeasured", js.undefined)
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    inline def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setTextQuery(value: String): Self = StObject.set(x, "textQuery", value.asInstanceOf[js.Any])
    
    inline def setTextQueryUndefined: Self = StObject.set(x, "textQuery", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
