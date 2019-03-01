package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountableQuery[T] extends js.Object {
  def count(): ExecutableQuery[T]
}

object CountableQuery {
  @scala.inline
  def apply[T](count: js.Function0[ExecutableQuery[T]]): CountableQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.asInstanceOf[CountableQuery[T]]
  }
}

