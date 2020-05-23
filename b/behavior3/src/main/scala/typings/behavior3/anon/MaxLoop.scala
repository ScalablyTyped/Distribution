package typings.behavior3.anon

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxLoop extends js.Object {
  var child: js.UndefOr[BaseNode] = js.undefined
  var maxLoop: js.UndefOr[Double] = js.undefined
}

object MaxLoop {
  @scala.inline
  def apply(child: BaseNode = null, maxLoop: js.UndefOr[Double] = js.undefined): MaxLoop = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLoop)) __obj.updateDynamic("maxLoop")(maxLoop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxLoop]
  }
}

