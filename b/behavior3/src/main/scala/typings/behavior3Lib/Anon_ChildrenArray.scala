package typings
package behavior3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenArray extends js.Object {
  var children: js.UndefOr[js.Array[behavior3Lib.b3Ns.BaseNode]] = js.undefined
}

object Anon_ChildrenArray {
  @scala.inline
  def apply(children: js.Array[behavior3Lib.b3Ns.BaseNode] = null): Anon_ChildrenArray = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Anon_ChildrenArray]
  }
}

