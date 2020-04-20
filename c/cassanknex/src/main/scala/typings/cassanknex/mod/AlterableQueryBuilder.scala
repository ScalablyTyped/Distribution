package typings.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterableQueryBuilder[T] extends js.Object {
  def alter[K /* <: /* keyof T */ String */](column: K, newType: String): this.type
  def drop[K /* <: /* keyof T */ String */](columns: K*): this.type
  def rename[K /* <: /* keyof T */ String */](column: K, newColumn: K): this.type
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
}

