package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /** A reference to the parent node, or null if the node has no parent. */
  var parent: js.UndefOr[Node] = js.undefined
  /** Information about the position in the source string that corresponds to the node. */
  var position: js.UndefOr[cssLib.Anon_Content] = js.undefined
  /** The possible values are the ones listed in the Types section on https://github.com/reworkcss/css page. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Node {
  @scala.inline
  def apply(parent: Node = null, position: cssLib.Anon_Content = null, `type`: java.lang.String = null): Node = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Node]
  }
}

