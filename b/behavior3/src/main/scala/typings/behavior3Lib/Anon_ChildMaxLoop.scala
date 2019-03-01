package typings
package behavior3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildMaxLoop extends js.Object {
  var child: js.UndefOr[behavior3Lib.b3Ns.BaseNode] = js.undefined
  var maxLoop: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ChildMaxLoop {
  @scala.inline
  def apply(child: behavior3Lib.b3Ns.BaseNode = null, maxLoop: scala.Int | scala.Double = null): Anon_ChildMaxLoop = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child)
    if (maxLoop != null) __obj.updateDynamic("maxLoop")(maxLoop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildMaxLoop]
  }
}

