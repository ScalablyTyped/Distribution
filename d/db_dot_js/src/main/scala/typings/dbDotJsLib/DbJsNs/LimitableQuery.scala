package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitableQuery[T] extends js.Object {
  def limit(n: js.Any, m: js.Any): ExecutableQuery[T]
}

object LimitableQuery {
  @scala.inline
  def apply[T](limit: js.Function2[js.Any, js.Any, ExecutableQuery[T]]): LimitableQuery[T] = {
    val __obj = js.Dynamic.literal(limit = limit)
  
    __obj.asInstanceOf[LimitableQuery[T]]
  }
}

