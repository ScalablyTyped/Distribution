package typings.blessed.mod.Widgets.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyEventArg extends js.Object {
  var ctrl: Boolean
  var full: String
  var meta: Boolean
  var name: String
  var sequence: String
  var shift: Boolean
}

object IKeyEventArg {
  @scala.inline
  def apply(ctrl: Boolean, full: String, meta: Boolean, name: String, sequence: String, shift: Boolean): IKeyEventArg = {
    val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyEventArg]
  }
}

