package typings.bootbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available when setting defaults for modals */
trait BootboxDefaultOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var backdrop: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object BootboxDefaultOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    backdrop: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): BootboxDefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[BootboxDefaultOptions]
  }
}

