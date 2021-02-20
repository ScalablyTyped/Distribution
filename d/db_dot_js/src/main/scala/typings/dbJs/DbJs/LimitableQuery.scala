package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LimitableQuery[T] extends StObject {
  
  def limit(n: js.Any, m: js.Any): ExecutableQuery[T] = js.native
}
object LimitableQuery {
  
  @scala.inline
  def apply[T](limit: (js.Any, js.Any) => ExecutableQuery[T]): LimitableQuery[T] = {
    val __obj = js.Dynamic.literal(limit = js.Any.fromFunction2(limit))
    __obj.asInstanceOf[LimitableQuery[T]]
  }
  
  @scala.inline
  implicit class LimitableQueryMutableBuilder[Self <: LimitableQuery[_], T] (val x: Self with LimitableQuery[T]) extends AnyVal {
    
    @scala.inline
    def setLimit(value: (js.Any, js.Any) => ExecutableQuery[T]): Self = StObject.set(x, "limit", js.Any.fromFunction2(value))
  }
}
