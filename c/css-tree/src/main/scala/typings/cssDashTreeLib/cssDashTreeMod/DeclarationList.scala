package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationList
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_DeclarationList: cssDashTreeLib.cssDashTreeLibStrings.DeclarationList
}

object DeclarationList {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.DeclarationList,
    loc: CssLocation = null
  ): DeclarationList = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DeclarationList]
  }
}

