package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_SelectorPlain: typings.cssDashTree.cssDashTreeStrings.Selector
}

object SelectorPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: typings.cssDashTree.cssDashTreeStrings.Selector,
    loc: CssLocation = null
  ): SelectorPlain = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SelectorPlain]
  }
}

