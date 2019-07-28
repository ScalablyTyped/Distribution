package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BracketsPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_BracketsPlain: typings.cssDashTree.cssDashTreeStrings.Brackets
}

object BracketsPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: typings.cssDashTree.cssDashTreeStrings.Brackets,
    loc: CssLocation = null
  ): BracketsPlain = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[BracketsPlain]
  }
}

