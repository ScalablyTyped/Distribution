package typings.cordovaSqliteStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Item extends StObject {
    
    def item(i: Double): Any
    
    var length: Double
  }
  object Item {
    
    inline def apply(item: Double => Any, length: Double): Item = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Double => Any): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
