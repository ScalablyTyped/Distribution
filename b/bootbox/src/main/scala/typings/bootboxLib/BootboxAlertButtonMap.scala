package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ButtonMap options for alerts modals */
trait BootboxAlertButtonMap extends BootboxButtonMap {
  var ok: BootboxButton | js.Function
}

object BootboxAlertButtonMap {
  @scala.inline
  def apply(ok: BootboxButton | js.Function): BootboxAlertButtonMap = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootboxAlertButtonMap]
  }
}

