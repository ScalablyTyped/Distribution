package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheet
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_StyleSheet: typings.cssTree.cssTreeStrings.StyleSheet
}

object StyleSheet {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typings.cssTree.cssTreeStrings.StyleSheet,
    loc: CssLocation = null
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
}

