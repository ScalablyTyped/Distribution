package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtrulePrelude
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_AtrulePrelude: cssDashTreeLib.cssDashTreeLibStrings.AtrulePrelude
}

object AtrulePrelude {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.AtrulePrelude,
    loc: CssLocation = null
  ): AtrulePrelude = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[AtrulePrelude]
  }
}

