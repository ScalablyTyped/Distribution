package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Query API
trait ExecutableQuery[T] extends js.Object {
  def execute(): js.Promise[js.Array[T]]
}

object ExecutableQuery {
  @scala.inline
  def apply[T](execute: js.Function0[js.Promise[js.Array[T]]]): ExecutableQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.asInstanceOf[ExecutableQuery[T]]
  }
}

