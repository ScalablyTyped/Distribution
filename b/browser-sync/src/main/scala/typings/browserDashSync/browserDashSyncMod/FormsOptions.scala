package typings.browserDashSync.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsOptions extends js.Object {
  var inputs: Boolean
  var submit: Boolean
  var toggles: Boolean
}

object FormsOptions {
  @scala.inline
  def apply(inputs: Boolean, submit: Boolean, toggles: Boolean): FormsOptions = {
    val __obj = js.Dynamic.literal(inputs = inputs, submit = submit, toggles = toggles)
  
    __obj.asInstanceOf[FormsOptions]
  }
}

