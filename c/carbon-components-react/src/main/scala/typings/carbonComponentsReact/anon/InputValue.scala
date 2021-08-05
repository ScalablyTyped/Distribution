package typings.carbonComponentsReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValue[ItemType] extends StObject {
  
  var inputValue: js.UndefOr[String] = js.undefined
  
  var item: ItemType
  
  var itemToString: js.UndefOr[js.Function1[/* item */ js.UndefOr[ItemType | Null], String]] = js.undefined
}
object InputValue {
  
  inline def apply[ItemType](item: ItemType): InputValue[ItemType] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValue[ItemType]]
  }
  
  extension [Self <: InputValue[?], ItemType](x: Self & InputValue[ItemType]) {
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setItem(value: ItemType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemToString(value: /* item */ js.UndefOr[ItemType | Null] => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
    
    inline def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
  }
}
