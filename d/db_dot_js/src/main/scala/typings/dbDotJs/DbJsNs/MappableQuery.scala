package typings.dbDotJs.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappableQuery[T] extends js.Object {
  def map[TMap](fn: js.Function1[/* value */ T, TMap]): Query[TMap]
}

object MappableQuery {
  @scala.inline
  def apply[T](map: js.Function1[/* value */ T, js.Any] => Query[js.Any]): MappableQuery[T] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[MappableQuery[T]]
  }
}

