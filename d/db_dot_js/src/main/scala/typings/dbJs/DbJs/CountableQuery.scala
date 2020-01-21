package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountableQuery[T] extends js.Object {
  def count(): ExecutableQuery[T]
}

object CountableQuery {
  @scala.inline
  def apply[T](count: () => ExecutableQuery[T]): CountableQuery[T] = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count))
  
    __obj.asInstanceOf[CountableQuery[T]]
  }
}

