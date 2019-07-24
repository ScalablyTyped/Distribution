package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for custom modals */
trait BootboxDialogOptions[T] extends BootboxBaseOptions[T] {
  var centerVertical: js.UndefOr[scala.Boolean] = js.undefined
  var message: jqueryLib.JQuery[stdLib.HTMLElement] | js.Array[_] | stdLib.Element | stdLib.DocumentFragment | stdLib.Text | java.lang.String | (js.Function2[
    /* index */ scala.Double, 
    /* html */ java.lang.String, 
    java.lang.String | stdLib.Element | jqueryLib.JQuery[stdLib.HTMLElement]
  ])
  var swapButtonOrder: js.UndefOr[scala.Boolean] = js.undefined
}

object BootboxDialogOptions {
  @scala.inline
  def apply[T](
    message: jqueryLib.JQuery[stdLib.HTMLElement] | js.Array[_] | stdLib.Element | stdLib.DocumentFragment | stdLib.Text | java.lang.String | (js.Function2[
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      java.lang.String | stdLib.Element | jqueryLib.JQuery[stdLib.HTMLElement]
    ]),
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: BootboxButtonMap = null,
    callback: T => _ = null,
    centerVertical: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    onEscape: js.Function0[_] | scala.Boolean = null,
    scrollable: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    size: bootboxLib.bootboxLibStrings.small | bootboxLib.bootboxLibStrings.sm | bootboxLib.bootboxLibStrings.large | bootboxLib.bootboxLibStrings.lg | bootboxLib.bootboxLibStrings.`extra-large` | bootboxLib.bootboxLibStrings.xl = null,
    swapButtonOrder: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String | stdLib.Element = null
  ): BootboxDialogOptions[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(centerVertical)) __obj.updateDynamic("centerVertical")(centerVertical)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onEscape != null) __obj.updateDynamic("onEscape")(onEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(swapButtonOrder)) __obj.updateDynamic("swapButtonOrder")(swapButtonOrder)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxDialogOptions[T]]
  }
}

