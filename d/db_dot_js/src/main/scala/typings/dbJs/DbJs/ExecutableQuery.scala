package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Query API
@js.native
trait ExecutableQuery[T] extends js.Object {
  def execute(): js.Promise[js.Array[T]] = js.native
}

object ExecutableQuery {
  @scala.inline
  def apply[T](execute: () => js.Promise[js.Array[T]]): ExecutableQuery[T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[ExecutableQuery[T]]
  }
  @scala.inline
  implicit class ExecutableQueryOps[Self <: ExecutableQuery[_], T] (val x: Self with ExecutableQuery[T]) extends AnyVal {
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
    def setExecute(value: () => js.Promise[js.Array[T]]): Self = this.set("execute", js.Any.fromFunction0(value))
  }
  
}

