package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Common write methods for ES6 Map/Set. */
trait Collection[K]
  extends StObject
     with ReadonlyCollection[K] {
  
  def clear(): Unit
  
  def delete(key: K): Boolean
}
object Collection {
  
  inline def apply[K](clear: () => Unit, delete: K => Boolean, has: K => Boolean, keys: () => Iterator[K], size: Double): Collection[K] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection[K]]
  }
  
  extension [Self <: Collection[?], K](x: Self & Collection[K]) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDelete(value: K => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
  }
}
