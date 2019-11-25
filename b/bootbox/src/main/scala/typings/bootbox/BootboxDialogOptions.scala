package typings.bootbox

import typings.bootbox.bootboxStrings.`extra-large`
import typings.bootbox.bootboxStrings.large
import typings.bootbox.bootboxStrings.lg
import typings.bootbox.bootboxStrings.sm
import typings.bootbox.bootboxStrings.small
import typings.bootbox.bootboxStrings.xl
import typings.jquery.JQuery
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for custom modals */
trait BootboxDialogOptions[T] extends BootboxBaseOptions[T] {
  var centerVertical: js.UndefOr[Boolean] = js.undefined
  var message: JQuery[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]])
  var swapButtonOrder: js.UndefOr[Boolean] = js.undefined
}

object BootboxDialogOptions {
  @scala.inline
  def apply[T](
    message: JQuery[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery[HTMLElement]]),
    animate: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    buttons: BootboxButtonMap = null,
    callback: T => _ = null,
    centerVertical: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    onEscape: js.Function0[_] | Boolean = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    size: small | sm | large | lg | `extra-large` | xl = null,
    swapButtonOrder: js.UndefOr[Boolean] = js.undefined,
    title: String | Element = null
  ): BootboxDialogOptions[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(centerVertical)) __obj.updateDynamic("centerVertical")(centerVertical.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onEscape != null) __obj.updateDynamic("onEscape")(onEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(swapButtonOrder)) __obj.updateDynamic("swapButtonOrder")(swapButtonOrder.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxDialogOptions[T]]
  }
}

