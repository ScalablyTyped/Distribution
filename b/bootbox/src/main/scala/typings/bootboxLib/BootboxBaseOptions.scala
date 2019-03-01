package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options shared by all modal types */
trait BootboxBaseOptions[T] extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var backdrop: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[BootboxButtonMap] = js.undefined
  var callback: js.UndefOr[js.Function1[/* result */ T, _]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var onEscape: js.UndefOr[js.Function0[_] | scala.Boolean] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /** All other values result in medium */
  var size: js.UndefOr[bootboxLib.bootboxLibStrings.small | bootboxLib.bootboxLibStrings.large] = js.undefined
  var title: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
}

object BootboxBaseOptions {
  @scala.inline
  def apply[T](
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: BootboxButtonMap = null,
    callback: js.Function1[/* result */ T, _] = null,
    className: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    onEscape: js.Function0[_] | scala.Boolean = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    size: bootboxLib.bootboxLibStrings.small | bootboxLib.bootboxLibStrings.large = null,
    title: java.lang.String | stdLib.Element = null
  ): BootboxBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[BootboxBaseOptions[T]]
  }
}

