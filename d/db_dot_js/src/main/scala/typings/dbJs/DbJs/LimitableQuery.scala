package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitableQuery[T] extends StObject {
  
  def limit(n: Any, m: Any): ExecutableQuery[T]
}
object LimitableQuery {
  
  inline def apply[T](limit: (Any, Any) => ExecutableQuery[T]): LimitableQuery[T] = {
    val __obj = js.Dynamic.literal(limit = js.Any.fromFunction2(limit))
    __obj.asInstanceOf[LimitableQuery[T]]
  }
  
  extension [Self <: LimitableQuery[?], T](x: Self & LimitableQuery[T]) {
    
    inline def setLimit(value: (Any, Any) => ExecutableQuery[T]): Self = StObject.set(x, "limit", js.Any.fromFunction2(value))
  }
}
