package typings.canvaskitWasm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Values[T] extends js.Object {
  val values: js.Array[T]
}

object Values {
  @scala.inline
  def apply[T](values: js.Array[T]): Values[T] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[T]]
  }
}

