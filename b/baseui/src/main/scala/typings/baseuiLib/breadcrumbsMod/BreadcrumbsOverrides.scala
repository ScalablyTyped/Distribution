package typings
package baseuiLib.breadcrumbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsOverrides extends js.Object {
  var Icon: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Separator: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object BreadcrumbsOverrides {
  @scala.inline
  def apply(
    Icon: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null,
    Separator: baseuiLib.Override[_] = null
  ): BreadcrumbsOverrides = {
    val __obj = js.Dynamic.literal()
    if (Icon != null) __obj.updateDynamic("Icon")(Icon.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (Separator != null) __obj.updateDynamic("Separator")(Separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsOverrides]
  }
}

