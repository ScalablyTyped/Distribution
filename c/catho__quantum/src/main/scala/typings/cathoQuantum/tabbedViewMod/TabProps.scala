package typings.cathoQuantum.tabbedViewMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var badge: js.UndefOr[ReactNode] = js.undefined
  var children: js.Array[ReactNode] | ReactNode
  var icon: js.UndefOr[ReactNode] = js.undefined
  var title: String
}

object TabProps {
  @scala.inline
  def apply(
    title: String,
    badge: ReactNode = null,
    children: js.Array[ReactNode] | ReactNode = null,
    icon: ReactNode = null
  ): TabProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

