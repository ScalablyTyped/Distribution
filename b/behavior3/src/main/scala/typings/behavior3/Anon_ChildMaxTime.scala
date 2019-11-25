package typings.behavior3

import typings.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildMaxTime extends js.Object {
  var child: js.UndefOr[BaseNode] = js.undefined
  var maxTime: js.UndefOr[Double] = js.undefined
}

object Anon_ChildMaxTime {
  @scala.inline
  def apply(child: BaseNode = null, maxTime: Int | Double = null): Anon_ChildMaxTime = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildMaxTime]
  }
}

