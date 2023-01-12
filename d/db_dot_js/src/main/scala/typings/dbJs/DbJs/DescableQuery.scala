package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescableQuery[T] extends StObject {
  
  def desc(): DescQuery[T]
}
object DescableQuery {
  
  inline def apply[T](desc: () => DescQuery[T]): DescableQuery[T] = {
    val __obj = js.Dynamic.literal(desc = js.Any.fromFunction0(desc))
    __obj.asInstanceOf[DescableQuery[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescableQuery[?], T] (val x: Self & DescableQuery[T]) extends AnyVal {
    
    inline def setDesc(value: () => DescQuery[T]): Self = StObject.set(x, "desc", js.Any.fromFunction0(value))
  }
}
