package typings.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterableQueryBuilder[T] extends js.Object {
  def alter[K /* <: /* keyof T */ String */](column: K, newType: String): this.type = js.native
  def drop[K /* <: /* keyof T */ String */](columns: K*): this.type = js.native
  def rename[K /* <: /* keyof T */ String */](column: K, newColumn: K): this.type = js.native
}

object AlterableQueryBuilder {
  @scala.inline
  def apply[T](
    alter: (js.Any, String) => AlterableQueryBuilder[T],
    drop: /* repeated */ js.Any => AlterableQueryBuilder[T],
    rename: (js.Any, js.Any) => AlterableQueryBuilder[T]
  ): AlterableQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(alter = js.Any.fromFunction2(alter), drop = js.Any.fromFunction1(drop), rename = js.Any.fromFunction2(rename))
    __obj.asInstanceOf[AlterableQueryBuilder[T]]
  }
  @scala.inline
  implicit class AlterableQueryBuilderOps[Self <: AlterableQueryBuilder[_], T] (val x: Self with AlterableQueryBuilder[T]) extends AnyVal {
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
    def setAlter(value: (js.Any, String) => AlterableQueryBuilder[T]): Self = this.set("alter", js.Any.fromFunction2(value))
    @scala.inline
    def setDrop(value: /* repeated */ js.Any => AlterableQueryBuilder[T]): Self = this.set("drop", js.Any.fromFunction1(value))
    @scala.inline
    def setRename(value: (js.Any, js.Any) => AlterableQueryBuilder[T]): Self = this.set("rename", js.Any.fromFunction2(value))
  }
  
}

