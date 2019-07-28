package typings.dbDotJs.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Query API
trait ExecutableQuery[T] extends js.Object {
  def execute(): js.Promise[js.Array[T]]
}

object ExecutableQuery {
  @scala.inline
  def apply[T](execute: () => js.Promise[js.Array[T]]): ExecutableQuery[T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
  
    __obj.asInstanceOf[ExecutableQuery[T]]
  }
}

