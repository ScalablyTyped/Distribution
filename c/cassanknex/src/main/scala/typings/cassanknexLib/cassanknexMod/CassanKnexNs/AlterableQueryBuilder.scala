package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterableQueryBuilder[T] extends js.Object {
  def alter[K /* <: java.lang.String */](column: K, newType: java.lang.String): this.type
  def drop[K /* <: java.lang.String */](columns: K*): this.type
  def rename[K /* <: java.lang.String */](column: K, newColumn: K): this.type
}

object AlterableQueryBuilder {
  @scala.inline
  def apply[T](
    alter: (js.Any, java.lang.String) => AlterableQueryBuilder[T],
    drop: /* repeated */ js.Any => AlterableQueryBuilder[T],
    rename: (js.Any, js.Any) => AlterableQueryBuilder[T]
  ): AlterableQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(alter = js.Any.fromFunction2(alter), drop = js.Any.fromFunction1(drop), rename = js.Any.fromFunction2(rename))
  
    __obj.asInstanceOf[AlterableQueryBuilder[T]]
  }
}

