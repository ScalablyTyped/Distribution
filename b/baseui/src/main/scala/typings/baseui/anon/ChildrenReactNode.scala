package typings.baseui.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenReactNode extends js.Object {
  var children: ReactNode
}

object ChildrenReactNode {
  @scala.inline
  def apply(children: ReactNode = null): ChildrenReactNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenReactNode]
  }
}

