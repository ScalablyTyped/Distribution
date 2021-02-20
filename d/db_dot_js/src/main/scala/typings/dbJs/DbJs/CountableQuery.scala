package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountableQuery[T] extends StObject {
  
  def count(): ExecutableQuery[T] = js.native
}
object CountableQuery {
  
  @scala.inline
  def apply[T](count: () => ExecutableQuery[T]): CountableQuery[T] = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count))
    __obj.asInstanceOf[CountableQuery[T]]
  }
  
  @scala.inline
  implicit class CountableQueryMutableBuilder[Self <: CountableQuery[_], T] (val x: Self with CountableQuery[T]) extends AnyVal {
    
    @scala.inline
    def setCount(value: () => ExecutableQuery[T]): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
  }
}
