package typings.baseui.iconMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var overrides: js.UndefOr[IconOverrides] = js.undefined
  var size: js.UndefOr[Double | String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    color: String = null,
    overrides: IconOverrides = null,
    size: Double | String = null,
    title: String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

