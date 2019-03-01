package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Value extends js.Object {
  var value: js.Array[java.lang.String]
  var x: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Value {
  @scala.inline
  def apply(value: js.Array[java.lang.String], x: java.lang.String = null): Anon_Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (x != null) __obj.updateDynamic("x")(x)
    __obj.asInstanceOf[Anon_Value]
  }
}

