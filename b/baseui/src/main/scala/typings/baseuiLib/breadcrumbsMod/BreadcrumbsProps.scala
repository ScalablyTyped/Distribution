package typings
package baseuiLib.breadcrumbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProps extends js.Object {
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var overrides: js.UndefOr[BreadcrumbsOverrides] = js.undefined
}

object BreadcrumbsProps {
  @scala.inline
  def apply(
    ariaLabel: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    overrides: BreadcrumbsOverrides = null
  ): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[BreadcrumbsProps]
  }
}

