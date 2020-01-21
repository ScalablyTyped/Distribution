package typings.behavior3

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenArray extends js.Object {
  var children: js.UndefOr[js.Array[BaseNode]] = js.undefined
}

object AnonChildrenArray {
  @scala.inline
  def apply(children: js.Array[BaseNode] = null): AnonChildrenArray = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenArray]
  }
}

