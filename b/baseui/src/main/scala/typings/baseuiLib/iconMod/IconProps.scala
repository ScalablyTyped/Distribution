package typings
package baseuiLib.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var overrides: js.UndefOr[IconOverrides] = js.undefined
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    color: java.lang.String = null,
    overrides: IconOverrides = null,
    size: scala.Double | java.lang.String = null,
    title: java.lang.String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IconProps]
  }
}

