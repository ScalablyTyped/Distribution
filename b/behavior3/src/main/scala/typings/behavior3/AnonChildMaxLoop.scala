package typings.behavior3

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildMaxLoop extends js.Object {
  var child: js.UndefOr[BaseNode] = js.undefined
  var maxLoop: js.UndefOr[Double] = js.undefined
}

object AnonChildMaxLoop {
  @scala.inline
  def apply(child: BaseNode = null, maxLoop: Int | Double = null): AnonChildMaxLoop = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (maxLoop != null) __obj.updateDynamic("maxLoop")(maxLoop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildMaxLoop]
  }
}

