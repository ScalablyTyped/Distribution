package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ButtonMap options for confirm and prompt modals */
trait BootboxConfirmPromptButtonMap extends BootboxButtonMap {
  var cancel: BootboxButton | js.Function
  var confirm: BootboxButton | js.Function
}

object BootboxConfirmPromptButtonMap {
  @scala.inline
  def apply(cancel: BootboxButton | js.Function, confirm: BootboxButton | js.Function): BootboxConfirmPromptButtonMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootboxConfirmPromptButtonMap]
  }
}

