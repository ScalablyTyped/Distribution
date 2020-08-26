package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescableQuery[T] extends js.Object {
  def desc(): DescQuery[T] = js.native
}

object DescableQuery {
  @scala.inline
  def apply[T](desc: () => DescQuery[T]): DescableQuery[T] = {
    val __obj = js.Dynamic.literal(desc = js.Any.fromFunction0(desc))
    __obj.asInstanceOf[DescableQuery[T]]
  }
  @scala.inline
  implicit class DescableQueryOps[Self <: DescableQuery[_], T] (val x: Self with DescableQuery[T]) extends AnyVal {
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
    def setDesc(value: () => DescQuery[T]): Self = this.set("desc", js.Any.fromFunction0(value))
  }
  
}

