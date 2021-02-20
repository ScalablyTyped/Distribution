package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappableQuery[T] extends StObject {
  
  def map[TMap](fn: js.Function1[/* value */ T, TMap]): Query[TMap] = js.native
}
object MappableQuery {
  
  @scala.inline
  def apply[T](map: js.Function1[/* value */ T, js.Any] => Query[js.Any]): MappableQuery[T] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[MappableQuery[T]]
  }
  
  @scala.inline
  implicit class MappableQueryMutableBuilder[Self <: MappableQuery[_], T] (val x: Self with MappableQuery[T]) extends AnyVal {
    
    @scala.inline
    def setMap(value: js.Function1[/* value */ T, js.Any] => Query[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
  }
}
