package typings.behavior3.anon

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenArray extends js.Object {
  var children: js.UndefOr[js.Array[BaseNode]] = js.undefined
}

object ChildrenArray {
  @scala.inline
  def apply(children: js.Array[BaseNode] = null): ChildrenArray = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenArray]
  }
}

