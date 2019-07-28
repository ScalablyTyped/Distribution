package typings.behavior3

import typings.behavior3.b3Ns.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildBaseNode extends js.Object {
  var child: js.UndefOr[BaseNode] = js.undefined
}

object Anon_ChildBaseNode {
  @scala.inline
  def apply(child: BaseNode = null): Anon_ChildBaseNode = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child)
    __obj.asInstanceOf[Anon_ChildBaseNode]
  }
}

