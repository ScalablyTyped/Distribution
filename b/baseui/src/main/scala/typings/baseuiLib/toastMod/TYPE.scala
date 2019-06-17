package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TYPE extends js.Object {
  var `inline`: baseuiLib.baseuiLibStrings.`inline`
  var toast: baseuiLib.baseuiLibStrings.toast
}

object TYPE {
  @scala.inline
  def apply(`inline`: baseuiLib.baseuiLibStrings.`inline`, toast: baseuiLib.baseuiLibStrings.toast): TYPE = {
    val __obj = js.Dynamic.literal(toast = toast)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[TYPE]
  }
}

