package typings.canvaskitDashWasm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Values[T] extends js.Object {
  val values: js.Array[T]
}

object Anon_Values {
  @scala.inline
  def apply[T](values: js.Array[T]): Anon_Values[T] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Values[T]]
  }
}

