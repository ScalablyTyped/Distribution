package typings.css.cssMod

import typings.css.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /** A reference to the parent node, or null if the node has no parent. */
  var parent: js.UndefOr[Node] = js.undefined
  /** Information about the position in the source string that corresponds to the node. */
  var position: js.UndefOr[Anon_Content] = js.undefined
  /** The possible values are the ones listed in the Types section on https://github.com/reworkcss/css page. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Node {
  @scala.inline
  def apply(parent: Node = null, position: Anon_Content = null, `type`: String = null): Node = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

