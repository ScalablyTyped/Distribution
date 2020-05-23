package typings.bootstrap.mod

import typings.bootstrap.bootstrapStrings.static
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
  var backdrop: js.UndefOr[Boolean | static] = js.undefined
  /**
    * Puts the focus on the modal when initialized.
    *
    * @default true
    */
  var focus: js.UndefOr[Boolean] = js.undefined
  /**
    * Closes the modal when escape key is pressed.
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows the modal when initialized.
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object ModalOption {
  @scala.inline
  def apply(
    backdrop: Boolean | static = null,
    focus: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined
  ): ModalOption = {
    val __obj = js.Dynamic.literal()
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOption]
  }
}

