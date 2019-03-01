package typings
package behavior3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildBaseNode extends js.Object {
  var child: js.UndefOr[behavior3Lib.b3Ns.BaseNode] = js.undefined
}

object Anon_ChildBaseNode {
  @scala.inline
  def apply(child: behavior3Lib.b3Ns.BaseNode = null): Anon_ChildBaseNode = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child)
    __obj.asInstanceOf[Anon_ChildBaseNode]
  }
}

