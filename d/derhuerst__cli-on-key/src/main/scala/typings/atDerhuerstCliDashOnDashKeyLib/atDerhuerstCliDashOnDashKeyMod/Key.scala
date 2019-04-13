package typings
package atDerhuerstCliDashOnDashKeyLib.atDerhuerstCliDashOnDashKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var ctrl: scala.Boolean
  var meta: scala.Boolean
  var name: js.UndefOr[java.lang.String] = js.undefined
   // ansi code leaving out leading \x1b's
  var raw: java.lang.String
  var sequence: java.lang.String
  var shift: scala.Boolean
}

object Key {
  @scala.inline
  def apply(
    ctrl: scala.Boolean,
    meta: scala.Boolean,
    raw: java.lang.String,
    sequence: java.lang.String,
    shift: scala.Boolean,
    code: java.lang.String = null,
    name: java.lang.String = null
  ): Key = {
    val __obj = js.Dynamic.literal(ctrl = ctrl, meta = meta, raw = raw, sequence = sequence, shift = shift)
    if (code != null) __obj.updateDynamic("code")(code)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Key]
  }
}

