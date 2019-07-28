package typings.behavior3

import typings.behavior3.b3Ns.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildMaxLoopBaseNode extends js.Object {
  var child: js.UndefOr[BaseNode] = js.undefined
  var maxLoop: js.UndefOr[Double] = js.undefined
}

object Anon_ChildMaxLoopBaseNode {
  @scala.inline
  def apply(child: BaseNode = null, maxLoop: Int | Double = null): Anon_ChildMaxLoopBaseNode = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child)
    if (maxLoop != null) __obj.updateDynamic("maxLoop")(maxLoop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildMaxLoopBaseNode]
  }
}

