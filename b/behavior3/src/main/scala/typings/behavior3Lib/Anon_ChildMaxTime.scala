package typings
package behavior3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildMaxTime extends js.Object {
  var child: js.UndefOr[behavior3Lib.b3Ns.BaseNode] = js.undefined
  var maxTime: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ChildMaxTime {
  @scala.inline
  def apply(child: behavior3Lib.b3Ns.BaseNode = null, maxTime: scala.Int | scala.Double = null): Anon_ChildMaxTime = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child)
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildMaxTime]
  }
}

