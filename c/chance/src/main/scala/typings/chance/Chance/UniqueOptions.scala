package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueOptions[T]
  extends StObject
     with Options {
  
  var comparator: js.UndefOr[js.Function2[/* array */ js.Array[T], /* value */ T, Boolean]] = js.undefined
}
object UniqueOptions {
  
  inline def apply[T](): UniqueOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueOptions[T]]
  }
  
  extension [Self <: UniqueOptions[?], T](x: Self & UniqueOptions[T]) {
    
    inline def setComparator(value: (/* array */ js.Array[T], /* value */ T) => Boolean): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
  }
}
