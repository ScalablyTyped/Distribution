package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Value extends js.Object {
  var value: js.Array[String]
  var x: js.UndefOr[String] = js.undefined
}

object Anon_Value {
  @scala.inline
  def apply(value: js.Array[String], x: String = null): Anon_Value = {
    val __obj = js.Dynamic.literal(value = value)
    if (x != null) __obj.updateDynamic("x")(x)
    __obj.asInstanceOf[Anon_Value]
  }
}

