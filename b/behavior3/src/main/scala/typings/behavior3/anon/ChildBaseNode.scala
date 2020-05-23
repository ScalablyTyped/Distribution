package typings.behavior3.anon

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildBaseNode extends js.Object {
  var child: js.UndefOr[BaseNode] = js.undefined
}

object ChildBaseNode {
  @scala.inline
  def apply(child: BaseNode = null): ChildBaseNode = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildBaseNode]
  }
}

