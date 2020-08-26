package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappableQuery[T] extends js.Object {
  def map[TMap](fn: js.Function1[/* value */ T, TMap]): Query[TMap] = js.native
}

object MappableQuery {
  @scala.inline
  def apply[T](map: js.Function1[/* value */ T, js.Any] => Query[js.Any]): MappableQuery[T] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[MappableQuery[T]]
  }
  @scala.inline
  implicit class MappableQueryOps[Self <: MappableQuery[_], T] (val x: Self with MappableQuery[T]) extends AnyVal {
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
    def setMap(value: js.Function1[/* value */ T, js.Any] => Query[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
  }
  
}

