package typings.behavior3

import typings.behavior3.b3Ns.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenArray extends js.Object {
  var children: js.UndefOr[js.Array[BaseNode]] = js.undefined
}

object Anon_ChildrenArray {
  @scala.inline
  def apply(children: js.Array[BaseNode] = null): Anon_ChildrenArray = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Anon_ChildrenArray]
  }
}

