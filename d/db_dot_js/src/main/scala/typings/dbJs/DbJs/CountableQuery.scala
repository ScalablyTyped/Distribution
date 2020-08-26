package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountableQuery[T] extends js.Object {
  def count(): ExecutableQuery[T] = js.native
}

object CountableQuery {
  @scala.inline
  def apply[T](count: () => ExecutableQuery[T]): CountableQuery[T] = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count))
    __obj.asInstanceOf[CountableQuery[T]]
  }
  @scala.inline
  implicit class CountableQueryOps[Self <: CountableQuery[_], T] (val x: Self with CountableQuery[T]) extends AnyVal {
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
    def setCount(value: () => ExecutableQuery[T]): Self = this.set("count", js.Any.fromFunction0(value))
  }
  
}

