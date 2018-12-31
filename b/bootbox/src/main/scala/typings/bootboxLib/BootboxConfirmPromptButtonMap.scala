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

