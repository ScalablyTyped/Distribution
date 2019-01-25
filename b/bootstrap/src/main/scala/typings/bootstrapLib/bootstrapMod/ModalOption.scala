package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOption extends js.Object {
  /**
    * Includes a modal-backdrop element.
    * Alternatively, specify `static` for a backdrop which doesn't close the modal on click.
    *
    * @default true
    */
  var backdrop: js.UndefOr[scala.Boolean | bootstrapLib.bootstrapLibStrings.static] = js.undefined
  /**
    * Puts the focus on the modal when initialized.
    *
    * @default true
    */
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Closes the modal when escape key is pressed.
    *
    * @default true
    */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows the modal when initialized.
    *
    * @default true
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

