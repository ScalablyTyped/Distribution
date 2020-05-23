package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /** List of remaining keys (besides the x key) to pull data for. */
  var value: js.Array[String]
  /** This is the key for the x-value in each row. */
  var x: js.UndefOr[String] = js.undefined
}

object Value {
  @scala.inline
  def apply(value: js.Array[String], x: String = null): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

