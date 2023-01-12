package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappableQuery[T] extends StObject {
  
  def map[TMap](fn: js.Function1[/* value */ T, TMap]): Query[TMap]
}
object MappableQuery {
  
  inline def apply[T](map: js.Function1[/* value */ T, Any] => Query[Any]): MappableQuery[T] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[MappableQuery[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappableQuery[?], T] (val x: Self & MappableQuery[T]) extends AnyVal {
    
    inline def setMap(value: js.Function1[/* value */ T, Any] => Query[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
  }
}
