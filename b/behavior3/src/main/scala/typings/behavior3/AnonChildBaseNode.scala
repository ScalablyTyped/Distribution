package typings.behavior3

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildBaseNode extends js.Object {
  var child: js.UndefOr[BaseNode] = js.undefined
}

object AnonChildBaseNode {
  @scala.inline
  def apply(child: BaseNode = null): AnonChildBaseNode = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildBaseNode]
  }
}

