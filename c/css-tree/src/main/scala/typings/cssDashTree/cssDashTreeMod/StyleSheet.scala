package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheet
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_StyleSheet: typings.cssDashTree.cssDashTreeStrings.StyleSheet
}

object StyleSheet {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.StyleSheet,
    loc: CssLocation = null
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[StyleSheet]
  }
}

