package typings.canvaskitWasm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues[T] extends js.Object {
  val values: js.Array[T]
}

object AnonValues {
  @scala.inline
  def apply[T](values: js.Array[T]): AnonValues[T] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValues[T]]
  }
}

