package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptions[T] extends StObject {
  
  var comparator: js.UndefOr[Boolean | String | (js.Function2[/* a */ T, /* b */ T, Double])] = js.undefined
}
object CollectionOptions {
  
  inline def apply[T](): CollectionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptions[T]]
  }
  
  extension [Self <: CollectionOptions[?], T](x: Self & CollectionOptions[T]) {
    
    inline def setComparator(value: Boolean | String | (js.Function2[/* a */ T, /* b */ T, Double])): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorFunction2(value: (/* a */ T, /* b */ T) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
  }
}
