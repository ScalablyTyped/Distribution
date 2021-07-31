package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Query API
trait ExecutableQuery[T] extends StObject {
  
  def execute(): js.Promise[js.Array[T]]
}
object ExecutableQuery {
  
  @scala.inline
  def apply[T](execute: () => js.Promise[js.Array[T]]): ExecutableQuery[T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[ExecutableQuery[T]]
  }
  
  @scala.inline
  implicit class ExecutableQueryMutableBuilder[Self <: ExecutableQuery[?], T] (val x: Self & ExecutableQuery[T]) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => js.Promise[js.Array[T]]): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
