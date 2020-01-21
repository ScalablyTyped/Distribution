package typings.baseui

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenReactNode extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
}

object AnonChildrenReactNode {
  @scala.inline
  def apply(children: ReactNode = null): AnonChildrenReactNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenReactNode]
  }
}

