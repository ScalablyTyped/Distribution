package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtrulePrelude
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_AtrulePrelude: typings.cssTree.cssTreeStrings.AtrulePrelude
}

object AtrulePrelude {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typings.cssTree.cssTreeStrings.AtrulePrelude,
    loc: CssLocation = null
  ): AtrulePrelude = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtrulePrelude]
  }
}

