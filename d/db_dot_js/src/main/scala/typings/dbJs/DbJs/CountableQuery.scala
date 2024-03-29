package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountableQuery[T] extends StObject {
  
  def count(): ExecutableQuery[T]
}
object CountableQuery {
  
  inline def apply[T](count: () => ExecutableQuery[T]): CountableQuery[T] = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count))
    __obj.asInstanceOf[CountableQuery[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountableQuery[?], T] (val x: Self & CountableQuery[T]) extends AnyVal {
    
    inline def setCount(value: () => ExecutableQuery[T]): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
  }
}
