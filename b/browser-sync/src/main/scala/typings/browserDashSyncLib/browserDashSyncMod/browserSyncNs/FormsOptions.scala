package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsOptions extends js.Object {
  var inputs: scala.Boolean
  var submit: scala.Boolean
  var toggles: scala.Boolean
}

object FormsOptions {
  @scala.inline
  def apply(inputs: scala.Boolean, submit: scala.Boolean, toggles: scala.Boolean): FormsOptions = {
    val __obj = js.Dynamic.literal(inputs = inputs, submit = submit, toggles = toggles)
  
    __obj.asInstanceOf[FormsOptions]
  }
}

