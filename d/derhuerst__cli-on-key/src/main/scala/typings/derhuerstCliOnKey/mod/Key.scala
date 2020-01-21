package typings.derhuerstCliOnKey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var ctrl: Boolean
  var meta: Boolean
  var name: js.UndefOr[String] = js.undefined
   // ansi code leaving out leading \x1b's
  var raw: String
  var sequence: String
  var shift: Boolean
}

object Key {
  @scala.inline
  def apply(
    ctrl: Boolean,
    meta: Boolean,
    raw: String,
    sequence: String,
    shift: Boolean,
    code: String = null,
    name: String = null
  ): Key = {
    val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

