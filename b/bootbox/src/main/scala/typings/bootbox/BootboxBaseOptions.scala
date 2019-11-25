package typings.bootbox

import typings.bootbox.bootboxStrings.`extra-large`
import typings.bootbox.bootboxStrings.large
import typings.bootbox.bootboxStrings.lg
import typings.bootbox.bootboxStrings.sm
import typings.bootbox.bootboxStrings.small
import typings.bootbox.bootboxStrings.xl
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options shared by all modal types */
trait BootboxBaseOptions[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var backdrop: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[BootboxButtonMap] = js.undefined
  var callback: js.UndefOr[js.Function1[/* result */ T, _]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var onEscape: js.UndefOr[js.Function0[_] | Boolean] = js.undefined
   // complex object where each key is of type BootboxButton
  var scrollable: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  /** All other values result in medium */
  var size: js.UndefOr[small | sm | large | lg | `extra-large` | xl] = js.undefined
  var title: js.UndefOr[String | Element] = js.undefined
}

object BootboxBaseOptions {
  @scala.inline
  def apply[T](
    animate: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    buttons: BootboxButtonMap = null,
    callback: /* result */ T => _ = null,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    onEscape: js.Function0[_] | Boolean = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    size: small | sm | large | lg | `extra-large` | xl = null,
    title: String | Element = null
  ): BootboxBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onEscape != null) __obj.updateDynamic("onEscape")(onEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxBaseOptions[T]]
  }
}

