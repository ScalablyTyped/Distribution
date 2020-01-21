package typings.baseui.menuMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedMenuProps extends js.Object {
  var children: ReactNode
}

object NestedMenuProps {
  @scala.inline
  def apply(children: ReactNode = null): NestedMenuProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedMenuProps]
  }
}

