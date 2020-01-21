package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQuery
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_MediaQuery: typings.cssTree.cssTreeStrings.MediaQuery
}

object MediaQuery {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typings.cssTree.cssTreeStrings.MediaQuery,
    loc: CssLocation = null
  ): MediaQuery = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQuery]
  }
}

