package typings.blueprintjsSelect.anon

import typings.blueprintjsSelect.`libEsm@ExamplesFilmsMod`.Film
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedItems extends StObject {
  
  var createdItems: js.Array[Film]
  
  var items: js.Array[Film]
}
object CreatedItems {
  
  inline def apply(createdItems: js.Array[Film], items: js.Array[Film]): CreatedItems = {
    val __obj = js.Dynamic.literal(createdItems = createdItems.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatedItems] (val x: Self) extends AnyVal {
    
    inline def setCreatedItems(value: js.Array[Film]): Self = StObject.set(x, "createdItems", value.asInstanceOf[js.Any])
    
    inline def setCreatedItemsVarargs(value: Film*): Self = StObject.set(x, "createdItems", js.Array(value*))
    
    inline def setItems(value: js.Array[Film]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Film*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
