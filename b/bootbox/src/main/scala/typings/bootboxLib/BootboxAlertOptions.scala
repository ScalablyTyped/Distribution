package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for alert modals */
trait BootboxAlertOptions
  extends BootboxDialogOptions[scala.Unit] {
  @JSName("buttons")
  var buttons_BootboxAlertOptions: js.UndefOr[BootboxAlertButtonMap] = js.undefined
  @JSName("callback")
  var callback_BootboxAlertOptions: js.UndefOr[js.Function0[_]] = js.undefined
}

object BootboxAlertOptions {
  @scala.inline
  def apply(
    message: jqueryLib.JQuery[stdLib.HTMLElement] | js.Array[_] | stdLib.Element | stdLib.DocumentFragment | stdLib.Text | java.lang.String | (js.Function2[
      /* index */ scala.Double, 
      /* html */ java.lang.String, 
      java.lang.String | stdLib.Element | jqueryLib.JQuery[stdLib.HTMLElement]
    ]),
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: BootboxAlertButtonMap = null,
    callback: js.Function0[_] = null,
    className: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    onEscape: js.Function0[_] | scala.Boolean = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    size: bootboxLib.bootboxLibStrings.small | bootboxLib.bootboxLibStrings.large = null,
    title: java.lang.String | stdLib.Element = null
  ): BootboxAlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (onEscape != null) __obj.updateDynamic("onEscape")(onEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxAlertOptions]
  }
}

