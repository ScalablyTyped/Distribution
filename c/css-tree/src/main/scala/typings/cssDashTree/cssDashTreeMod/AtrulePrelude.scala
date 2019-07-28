package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtrulePrelude
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_AtrulePrelude: typings.cssDashTree.cssDashTreeStrings.AtrulePrelude
}

object AtrulePrelude {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.AtrulePrelude,
    loc: CssLocation = null
  ): AtrulePrelude = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[AtrulePrelude]
  }
}

