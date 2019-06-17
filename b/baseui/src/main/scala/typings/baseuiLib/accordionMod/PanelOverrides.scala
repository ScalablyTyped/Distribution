package typings
package baseuiLib.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelOverrides[T] extends js.Object {
  var Content: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var Header: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var PanelContainer: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var ToggleIcon: js.UndefOr[baseuiLib.Override[T]] = js.undefined
}

object PanelOverrides {
  @scala.inline
  def apply[T](
    Content: baseuiLib.Override[T] = null,
    Header: baseuiLib.Override[T] = null,
    PanelContainer: baseuiLib.Override[T] = null,
    ToggleIcon: baseuiLib.Override[T] = null
  ): PanelOverrides[T] = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Header != null) __obj.updateDynamic("Header")(Header.asInstanceOf[js.Any])
    if (PanelContainer != null) __obj.updateDynamic("PanelContainer")(PanelContainer.asInstanceOf[js.Any])
    if (ToggleIcon != null) __obj.updateDynamic("ToggleIcon")(ToggleIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelOverrides[T]]
  }
}

