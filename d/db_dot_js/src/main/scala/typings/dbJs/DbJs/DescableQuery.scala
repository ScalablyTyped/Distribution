package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescableQuery[T] extends StObject {
  
  def desc(): DescQuery[T] = js.native
}
object DescableQuery {
  
  @scala.inline
  def apply[T](desc: () => DescQuery[T]): DescableQuery[T] = {
    val __obj = js.Dynamic.literal(desc = js.Any.fromFunction0(desc))
    __obj.asInstanceOf[DescableQuery[T]]
  }
  
  @scala.inline
  implicit class DescableQueryMutableBuilder[Self <: DescableQuery[_], T] (val x: Self with DescableQuery[T]) extends AnyVal {
    
    @scala.inline
    def setDesc(value: () => DescQuery[T]): Self = StObject.set(x, "desc", js.Any.fromFunction0(value))
  }
}
