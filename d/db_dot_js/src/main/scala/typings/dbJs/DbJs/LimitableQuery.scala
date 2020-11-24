package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LimitableQuery[T] extends js.Object {
  
  def limit(n: js.Any, m: js.Any): ExecutableQuery[T] = js.native
}
object LimitableQuery {
  
  @scala.inline
  def apply[T](limit: (js.Any, js.Any) => ExecutableQuery[T]): LimitableQuery[T] = {
    val __obj = js.Dynamic.literal(limit = js.Any.fromFunction2(limit))
    __obj.asInstanceOf[LimitableQuery[T]]
  }
  
  @scala.inline
  implicit class LimitableQueryOps[Self <: LimitableQuery[_], T] (val x: Self with LimitableQuery[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLimit(value: (js.Any, js.Any) => ExecutableQuery[T]): Self = this.set("limit", js.Any.fromFunction2(value))
  }
}
