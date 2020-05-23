package typings.behavior3.anon

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxTime extends js.Object {
  var child: js.UndefOr[BaseNode] = js.undefined
  var maxTime: js.UndefOr[Double] = js.undefined
}

object MaxTime {
  @scala.inline
  def apply(child: BaseNode = null, maxTime: js.UndefOr[Double] = js.undefined): MaxTime = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTime)) __obj.updateDynamic("maxTime")(maxTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxTime]
  }
}

